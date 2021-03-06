/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.repositorio.impl;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import pe.edu.cibertec.dominio.Producto;
import pe.edu.cibertec.dominio.busqueda.BusquedaProductoTop;
import pe.edu.cibertec.repositorio.ProductoRepositorio;
import pe.edu.cibertec.repositorio.mapper.ProductoMapper;

/**
 *
 * @author Java-LM
 */
public class MybatisProductoRepositorioImpl implements ProductoRepositorio{
    
    private ProductoMapper productoMapper;
    
    public MybatisProductoRepositorioImpl(SqlSession session) {
        productoMapper = session.getMapper(ProductoMapper.class);
    }
    
    @Override
    public Producto buscar(Long id) {
        return productoMapper.selectProducto(id);
    }

    @Override
    public List<Producto> obtenerTodos() {
        return productoMapper.selectProductos();
    }

    @Override
    public List<Producto> obtenerPorCategoria(Long idCategoria) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /*@Override
    public Integer crear(Producto producto) {
        
        return productoMapper.insertProducto(producto);
    }
    */

    @Override
    public List<Producto> obtenerProductosTop(BusquedaProductoTop busquedaProductoTop) {
        if (busquedaProductoTop.getIdCategoria() != null && busquedaProductoTop.getIdCategoria() <= 0) {
            busquedaProductoTop.setIdCategoria(null);
        }
        //return productoMapper.selectProductoTop(busquedaProductoTop);
        
        return productoMapper.procedureProductoTop(busquedaProductoTop);
    }

    @Override
    public void actualizar(Producto producto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Producto producto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void crear(Producto producto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
