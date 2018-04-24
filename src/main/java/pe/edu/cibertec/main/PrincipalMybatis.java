/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.main;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import pe.edu.cibertec.dominio.Producto;
import pe.edu.cibertec.dominio.Usuario;

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
         Producto producto = sqlSession.selectOne("pe.edu.cibertec.repositorio.mapper.ProductoMapper.selectProducto", 1L);
         System.out.println(producto.getId() + " " + producto.getNombre() + " " + producto.getCategoria().getNombre());
         
         // Delete
//         sqlSession.delete("pe.edu.cibertec.repositorio.mapper.UsuarioMapper.deleteUsuario",
//                 lstUsuario.get(lstUsuario.size() - 1).getId());
//         sqlSession.commit();
     }
    }
}
