package creacionDeProductos;


public class Main {

	public static void main(String[] args) {
		producto  Remera = new producto("nike",0234,500,true);
		
		System.out.println(CosasLindas.getNombre());
		System.out.println(CosasLindas.getId());
		System.out.println(CosasLindas.getPrecio());
		System.out.println(CosasLindas.getStock());
		
		
	}
}
