/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.repositorio.mapper;

import pe.edu.cibertec.dominio.Producto;

/**
 *
 * @author Java-LM
 */
public interface ProductoMapper {
  
   Producto selectProducto (Long id);
   
   Integer insertProducto (Producto producto);
}
