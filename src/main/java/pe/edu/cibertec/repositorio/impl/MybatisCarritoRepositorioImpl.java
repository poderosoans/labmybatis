/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.repositorio.impl;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import pe.edu.cibertec.dominio.Carrito;
import pe.edu.cibertec.repositorio.CarritoRepositorio;
import pe.edu.cibertec.repositorio.mapper.CarritoMapper;

/**
 *
 * @author Poderosoans
 */
public class MybatisCarritoRepositorioImpl implements CarritoRepositorio  {
    
    private CarritoMapper carritoMapper;
    
    public MybatisCarritoRepositorioImpl(SqlSession session) {
        carritoMapper = session.getMapper(CarritoMapper.class);
    }

    @Override
    public List<Carrito> buscarPorUsuario(Long idUsuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void crear(Carrito carrito) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizar(Carrito carrito) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
