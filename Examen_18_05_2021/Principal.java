public class Principal{

	public static void main(String[] args) {

		PruebaExamen pe = (val1, val2, val3) -> System.out.println(val1 + val2 + val3);
		pe.operacionPrueba(1,5,3);

		System.out.println(PruebaExamen.operacionPrueba(2,2));

		pe.mensajeHola();	

		pe.mensajeHola("Programa");

		pe = (int val1, int val2, int val3) -> System.out.println((val1 + (val2 * val3)));
		pe.operacionPrueba(1,PruebaExamen.operacionPrueba(1,5),PruebaExamen.operacionPrueba(1,3));
		Principal.miMetodo(pe);
		miMetodo((int val1, int val2, int val3) -> System.out.println(val1+(val2/val3)));
		pe = (int val1, int val2, int val3) -> System.out.println(val1+((val2 *1.0)/(val3*1.0)));
		miMetodo(pe,12,3,2);
}
	
	private static void miMetodo(PruebaExamen objeto){
		objeto.operacionPrueba(1,PruebaExamen.operacionPrueba(3,2),PruebaExamen.operacionPrueba(1,2));
	}

	private static void miMetodo(PruebaExamen objeto, int val1, int val2, int val3){
		objeto.operacionPrueba(val1,PruebaExamen.operacionPrueba(val2, val2),PruebaExamen.operacionPrueba(val3, val3));
	}
	
}