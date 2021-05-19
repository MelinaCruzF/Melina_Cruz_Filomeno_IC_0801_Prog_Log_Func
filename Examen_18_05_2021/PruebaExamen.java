public interface PruebaExamen{

	public default void mensajeHola(){
		System.out.println("Hola mi nombre es: Melina Cruz Filomeno");
	}

	public default void mensajeHola(String cadena){
		System.out.println("La cadena es: " + cadena);
	}

	public static int operacionPrueba(int v1, int v2){
		int suma = v1+v2;
		return suma;
	}

	public void operacionPrueba(int val1, int val2, int val3);
	
}