/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.repositorio.impl;

import org.apache.ibatis.session.SqlSession;
import pe.edu.cibertec.dominio.DetalleCarrito;
import pe.edu.cibertec.repositorio.DetalleCarritoRepositorio;
import pe.edu.cibertec.repositorio.mapper.DetalleCarritoMapper;

/**
 *
 * @author Poderosoans
 */
public class MybatisDetalleCarritoRepositorioImpl implements DetalleCarritoRepositorio{
    
    private DetalleCarritoMapper detalleCarritoMapper;
    
    public MybatisDetalleCarritoRepositorioImpl(SqlSession session) {
        detalleCarritoMapper = session.getMapper(DetalleCarritoMapper.class);
    }
    
    @Override
    public void crear(DetalleCarrito detalleCarrito) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
