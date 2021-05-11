public class Principal{
	public static void main(String[] args) {
		Principal.engine((int x, int y) -> x + y);
		Principal.engine((int x, int y) -> x * y);	
		try{
			Principal.engine((int x, int y) -> x / y);
				}catch(ArithmeticException ex){
					System.out.println("Error al dividir entre 0");
				}
		
		Principal.engine((int x, int y) -> x - y);
		Principal.engine((int x, int y) -> x % y);

		Principal.engine((long x, long y) -> x + y);
		Principal.engine((long x, long y) -> x * y);
		Principal.engine((long x, long y) -> x / y);
		try{
			Principal.engine((int x, int y) -> x / y);
				}catch(ArithmeticException ex){
					System.out.println("Error al dividir entre 0");
				}
		Principal.engine((long x, long y) -> x - y);
		Principal.engine((long x, long y) -> x % y);
	}

	//Sobrecarga de métodos
	private static void engine(CalculadoraInt cal){
		int x = 2, y = 0;
		int resultado = cal.calcular(x, y);
		System.out.println("resultado con Int = " + resultado);
	}

	private static void engine(CalculadoraLong cal){
		int x = 2, y = 0;
		long resultado = cal.calcular(x, y);
		System.out.println("resultado con Long = " + resultado);
	}
}