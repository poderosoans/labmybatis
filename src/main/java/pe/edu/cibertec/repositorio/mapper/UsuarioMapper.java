/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.repositorio.mapper;

import java.util.Map;
import pe.edu.cibertec.dominio.Usuario;

/**
 *
 * @author Poderosoans
 */
public interface UsuarioMapper {
    Usuario loginUsuario(Map params);
}
