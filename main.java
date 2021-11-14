package creacionDeProductos;


public class Main {

	public static void main(String[] args) {
		producto  CosasLindas = new producto("Programacion con java",1520,899,true);
		
		System.out.println(CosasLindas.getNombre());
		System.out.println(CosasLindas.getId());
		System.out.println(CosasLindas.getPrecio());
		System.out.println(CosasLindas.getStock());
		
		
	}
}
