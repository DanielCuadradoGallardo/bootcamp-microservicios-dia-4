package vista;

import java.util.List;

public class App {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(18, 6, 4, 15, 55, 78, 12, 9, 8);
		
		System.out.println(cuentaImperativa(numbers));
		
		System.out.println(cuentaFuncional(numbers));
		

	}
	
	private static int cuentaImperativa(List<Integer> numbers) {
		int count = 0; 
		
		for(Integer i : numbers) {
			if(i > 10) {
				count++;
			}
		}
		return (count);
	}
	
	private static int cuentaFuncional(List<Integer> numbers) {
		
	    return numbers.stream()
	            .filter(i -> i > 10)
	            .count();
	}
	

}
