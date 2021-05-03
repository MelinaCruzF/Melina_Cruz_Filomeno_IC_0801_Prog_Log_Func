public class LambdaTest{
	public static void main(String[] args) {
		
		//Expresión lambda ==> representa un ojeto de una interfaz funcional
		Operaciones op = (num1, num2) -> System.out.println(num1 + num2);

		LambdaTest objeto = new LambdaTest();
		objeto.miMetodo(op,10,10);
	}

	public void miMetodo(Operaciones op, int num1, int num2){
		op.imprimeSuma(num1, num2);
	}
}