public class LambdaTest{
	public static void main(String[] args) {
		
		//Expresión lambda ==> representa un objeto de una interfaz funcional
		FunctionTest ft = () -> System.out.println("Hola Mundo");  // Implementación del mtodo abstracto "saludar()"
																// de la Interfaz Funcional
		
		LambdaTest objeto = new LambdaTest();
		objeto.miMetodo(ft);
	}

	public void miMetodo(FunctionTest parametro){
		parametro.saludar();
	}
}