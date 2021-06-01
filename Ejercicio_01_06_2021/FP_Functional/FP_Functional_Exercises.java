import java.util.List;

public class FP_Functional_Exercises{
	public static void main(String[] args){
		List<Integer> numbers = List.of(12,	9, 13, 4, 6, 2, 4, 12, 15);

		List<String> courses = List.of("Spring", "Spring Boot", "API","Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
		
			System.out.print("Exercise 1:  ");
			printEvenNumbersInListFunctional(numbers);

			System.out.print("Exercise 3:  ");
			printCoursesSpring(courses);

			System.out.print("Exercise 4:  ");
			printCountC(courses);

			System.out.print("Exercise 5:  ");
			printCubes(numbers);

			System.out.print("Exercise 6:  ");
			printLengthCursos(courses);
	}


		private static boolean isEven(int number){//impar
			return (number%2!=0);
		}

		private static void printNumber(int number){ //int
			System.out.print(number + ", ");
		}

		private static void printText(String course){ //string
			System.out.print(course + ", ");
		}

	
	
	//1 números impares
	private static void printEvenNumbersInListFunctional(List<Integer> numbers){
		numbers.stream()					   
			.filter(FP_Functional_Exercises::isEven) 
			.forEach(FP_Functional_Exercises::printNumber); 
		System.out.println("");
	}

	//2 cursos separados
	private static void printCourses(List<String> courses){
		courses.stream() 						
			.forEach(cursos -> System.out.println(cursos));
	}

	//3 cursos que contengan Spring
	private static void printCoursesSpring(List<String> courses){
		courses.stream()						
			.filter(cursos -> cursos.contains("Spring"))
			.forEach(FP_Functional_Exercises::printText);
		System.out.println("");
	}

	//4 conteo de caracteres más de 4
	private static void printCountC(List<String> courses){
		courses.stream()
			.filter(cursos -> cursos.length()>4)
			.forEach(FP_Functional_Exercises::printText);
		System.out.println("");
	}

	//5 Cubos de los valores impares
	private static void printCubes(List<Integer> numbers){
		numbers.stream()
			.filter(FP_Functional_Exercises::isEven)
			.map(number -> number*number*number)
			.forEach(FP_Functional_Exercises::printNumber);
		System.out.println("");
	}

	//6 Cantidad de caracteres de los cursos
	private static void printLengthCursos(List<String> courses){
		courses.stream()
			.map(cursos -> cursos.length())
			.forEach(FP_Functional_Exercises::printNumber);
		System.out.println("");
	}
}