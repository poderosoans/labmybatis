/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.repositorio.impl;

import org.apache.ibatis.session.SqlSession;
import pe.edu.cibertec.dominio.Usuario;
import pe.edu.cibertec.repositorio.UsuarioRepositorio;
import pe.edu.cibertec.repositorio.mapper.UsuarioMapper;

/**
 *
 * @author Poderosoans
 */
public class MybatisUsuarioRepositorioImpl implements UsuarioRepositorio{
    
    private UsuarioMapper usuarioMapper;
    
    public MybatisUsuarioRepositorioImpl(SqlSession session) {
        usuarioMapper = session.getMapper(UsuarioMapper.class);
    }
    
    @Override
    public Usuario buscar(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void crear(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizar(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario login(String email, String password) {
        Usuario user = (Usuario) usuarioMapper.loginUsuario(email, password);
        if( user != null) {
            return user;
        }
        return null;
    }
    
}
