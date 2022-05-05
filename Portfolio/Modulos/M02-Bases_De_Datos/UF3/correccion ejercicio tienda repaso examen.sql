drop database tienda if exists;
create database tienda;

create table producto{
codigo			int(3),
descripcion		varchar(30),
stock			int(3),
umbral_pedido 	int(4)
}

create table venta{
numventa			int(2),
codProducto			varchar(3),
cantidad			int(3),
fecha			 	date
}

create table ordenes_pedido{
numpedido			int(4)	auto_increment,
codproducto			int(3),
cantidad			int(3)
}
DELIMITER //
create trigger stock after insert on venta for each row
begin
declare cantidadRepuesto int 2,
set cantidadRepuesto=(select umbral from producto where codigo=new.codProducto)*3-(select stock from producto where codigo=new.codProducto),
update producto set stock=stock-new.cantidad where codigo=new.codProducto
if((select stock from producto where codigo=new.codProducto)<(select umbral from producto where codigo=new.codProducto)) then
	insert into ordenes_pedido(codProducto,cantidad) VALUES (new.codProducto,cantidadRepuesto)
    update stock set stock= where codigo=codProducto;
end

/*correccion*/
begin
declare umbral_v int(4);
declare stock_v int(3);
set umbral_v:=(select umbral from producto where codigo=new.codProducto);
set stock_v:=(SELECT stock from producto where codigo=new.codProducto);
	insert into ordenes_pedido(codProducto, cantidad) VALUES (new.codProducto,umbral_v-stock_v);
end

DELIMITER ;    
    