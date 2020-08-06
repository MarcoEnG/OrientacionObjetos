package interfaces.defecto;

public interface Interfaz {
	
	public void metodo();
	
	default public void metodoPorDefecto() {
		System.out.println("Este es uno de los nuevos metodos por defecto");
	}
	
	public static void metodoEstatico() {
		System.out.println("Metodo estatico en un interfaz");
	}

}
