

DELIMITER //
CREATE TRIGGER ex02repasoventa AFTER INSERT ON venta FOR EACH ROW
BEGIN
	update producto set stock=stock-new.cantidad where producto.cod=new.codproducto;
	if(stock<umbral_pedido) then
		declare cantPedido int(3);
		set cantPedido=(SELECT (umbral_pedido*3)-stock FROM producto WHERE producto.cod=new.codproducto);
		insert on ordenes_pedido VALUES(new.codproducto, cantPedido);
		update producto set stock=umbral_pedido*3 where producto.cod=new.codproducto;        
END ;

DELIMITER ;

