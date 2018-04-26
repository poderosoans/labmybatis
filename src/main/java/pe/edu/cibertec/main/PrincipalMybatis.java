/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.main;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import pe.edu.cibertec.dominio.Categoria;
import pe.edu.cibertec.dominio.Producto;
import pe.edu.cibertec.dominio.Usuario;
import pe.edu.cibertec.dominio.busqueda.BusquedaProductoTop;
import pe.edu.cibertec.repositorio.ProductoRepositorio;
import pe.edu.cibertec.repositorio.impl.MybatisProductoRepositorioImpl;
import pe.edu.cibertec.repositorio.mapper.CategoriaMapper;
import pe.edu.cibertec.repositorio.mapper.ProductoMapper;

/**
 *
 * @author Java-LM
 */
public class PrincipalMybatis {
    
    public static SqlSessionFactory createSqlSessionFactory() {
        try{
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            return sqlSessionFactory;
        } catch (IOException e) {
            System.out.println("Error al generar SQLSessionFactory");
            e.printStackTrace(System.out);
            System.exit(-1);
            return  null;
        }
    }
    
    public static void main(String[] args) {
     SqlSessionFactory sqlSessionFactory = createSqlSessionFactory();
     try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
         // Insert
         Usuario nuevoUsuario = new Usuario();
         nuevoUsuario.setNombre("Maria");
         nuevoUsuario.setApellido("Meza");
         nuevoUsuario.setFechaNacimiento(new Date());
         sqlSession.insert("pe.edu.cibertec.repositorio.mapper.UsuarioMapper.insertUsuario", nuevoUsuario);
         sqlSession.commit();
         System.out.println("Id del usuario: "+ nuevoUsuario.getId());
         
        // Update
//         Usuario usuario = sqlSession.selectOne("pe.edu.cibertec.repositorio.mapper.UsuarioMapper.selectUsuario", 1L);
//         
//         usuario.setFechaNacimiento(new Date());
//         usuario.setNombre(usuario.getNombre()+ " Amigable");
//         sqlSession.update("pe.edu.cibertec.repositorio.mapper.UsuarioMapper.updateUsuario", usuario);
//         System.out.println(usuario.getNombre() + " " + usuario.getApellido());
         
         // Select
//         List<Usuario> lstUsuario = sqlSession.selectList("pe.edu.cibertec.repositorio.mapper.UsuarioMapper.selectAllUsuario");
//         lstUsuario.forEach(u -> System.out.println(
//                 u.getNombre() + " " + u.getApellido() + " " + u.getFechaNacimiento()
//         ));
         
         // JOIN
         // Producto producto = sqlSession.selectOne("pe.edu.cibertec.repositorio.mapper.ProductoMapper.selectProducto", 1L);
         // Producto producto = sqlSession.getMapper(ProductoMapper.class).selectProducto(1L);
         ProductoRepositorio productoRepositorio = new MybatisProductoRepositorioImpl(sqlSession);
         Producto producto = productoRepositorio.buscar(1L);
      
         System.out.println(producto.getId() + " " + producto.getNombre() + " " + producto.getCategoria().getNombre());
         
         // Delete
//         sqlSession.delete("pe.edu.cibertec.repositorio.mapper.UsuarioMapper.deleteUsuario",
//                 lstUsuario.get(lstUsuario.size() - 1).getId());
        
//        Categoria categoria = new Categoria();
//        categoria.setId(1L);
//        Producto nuevo = new Producto();
//        nuevo.setNombre("Reloj de cuarzo");
//        nuevo.setDescripcion("Reloj de última generación");
//        nuevo.setPrecio(new BigDecimal("900.00"));
//        nuevo.setImagen(obtenerArchivo(RUTA_IMAGEN));
//        nuevo.setCategoria(categoria);
//        int indice = productoRepositorio.crear(nuevo);
//         System.out.println("Fila modificadas: "+ indice);
//         System.out.println("Queremos el idnice: "+nuevo.getId());
        
         System.out.println(sqlSession.getMapper(CategoriaMapper.class).obtenerTodos());
         
         // Consulta multiple
        BusquedaProductoTop busquedaProductoTop = new BusquedaProductoTop();
        busquedaProductoTop.setIdCategoria(1);
        List<Producto> productosTop = productoRepositorio.obtenerProductosTop(busquedaProductoTop);
        productosTop.forEach(System.out::println);
        
         sqlSession.commit();

     }
     
    }
    
    private static final String RUTA_IMAGEN = "D:\\Cibertec 2\\Alumno03\\01. MyBatis\\02_mybatis\\reloj_cuarzo.jpg";
    private static final int CHUNK_SIZE = 1024 * 4;
    
    static byte[] obtenerArchivo(String ruta) {
        byte[] resultado = null;
        try(BufferedInputStream bis = 
                new BufferedInputStream (
                        new FileInputStream(new File(ruta)))) {
            ByteArrayOutputStream baos = new ByteArrayOutputStream(); // Stream salida (para descarga)
            byte[] chunk = new byte[CHUNK_SIZE];
            int leidos = 0;
            while ((leidos = bis.read(chunk)) > 0) {
                baos.write(chunk, 0, leidos);
            }
            resultado = baos.toByteArray();
        } catch(IOException e) {
            e.printStackTrace(System.out);
        }
        return resultado;
        
    }
}
