set delimiter $$

CREATE PROCEDURE productosTop(IN p_cantidadMeses INT, IN p_idCategoria INT)
BEGIN
    select
	 pr.id,
	 pr.nombre,
	 descripcion,
	 precio,
	 imagen,
	 ca.id AS codigo_Categoria,
	 ca.nombre AS nombreCategoria
	from tab_producto pr
	  inner join categoria ca on pr.id_categoria = ca.id
	where pr.id in (
	select distinct p.id
	from tab_producto p
	 inner join detalle_carrito dc on dc.id_producto = p.id
	 inner join carrito c on c.id = dc.id_carrito
	where
	  TIMESTAMPDIFF(MONTH, date(fecha_compra), curdate() ) >= p_cantidadMeses
	  and (p_idCategoria IS NULL OR p.id_categoria = p_idCategoria) );
END$$

set delimiter ;