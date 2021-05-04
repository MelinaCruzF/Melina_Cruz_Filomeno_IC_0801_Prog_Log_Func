public class Principal{
	public static void main(String[] args) {
		Principal.engine((x, y) -> x + y);
		Principal.engine((x, y) -> x * y);
		Principal.engine((x, y) -> x / y);
		Principal.engine((x, y) -> x - y);
		Principal.engine((x, y) -> x % y);

		Principal.engines((x, y) -> x + y);
		Principal.engines((x, y) -> x * y);
		Principal.engines((x, y) -> x / y);
		Principal.engines((x, y) -> x - y);
		Principal.engines((x, y) -> x % y);
	}

	//Sobrecarga de métodos
	private static void engine(CalculadoraInt cal){
		int x = 2, y = 4;
		int resultado = cal.calcular(x, y);
		System.out.println("resultado con Int = " + resultado);
	}

	private static void engines(CalculadoraLong cal){
		long x = 2, y = 4;
		long resultado = cal.calcular(x, y);
		System.out.println("resultado con Long = " + resultado);
	}
}