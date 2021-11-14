package creacionDeProductos;

public class producto {

	private String nombre;	
	private int id;
	private double precio;
	private Boolean stock;
	
	public producto(String nombre,int id,double precio,boolean stock){
		this.nombre=nombre;
		this.id=id;
		this.precio=precio;
		this.stock=stock;
	}
	
public String getNombre() {return nombre;}
public void setNombre(String nombre) {this.nombre = nombre;}
public int getId() {return id;}
public void setId(int id) {	this.id = id;}
public double getPrecio() {return precio;}
public void setPrecio(double precio) {this.precio = precio;}
public Boolean getStock() {return stock;}
public void setStock(Boolean stock) {this.stock = stock;}



}
