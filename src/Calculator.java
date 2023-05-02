/**
 * Allan Alves Amancio
 * Calculator Class
*/
import java.util.ArrayList;

public class Calculator {
		public static ArrayList<String> historico = new ArrayList<>();
		private Calculator() {}
		
		public static double somar(double num1, double num2) {
			double resultado = num1+num2;
			historico.add(num1 + "+" + num2 + "=" + resultado);
			return resultado;
		}
		
		public static double subtrair(double num1, double num2) {
			double resultado =  num1-num2;
			historico.add(num1 + "-" + num2 + "=" + resultado);
			return resultado;
		}
		
		public static double multiplicar(double num1, double num2) {
			double resultado =  num1*num2;
			historico.add(num1 + "*" + num2 + "=" + resultado);
			return resultado;
		}
		
		public static double dividir(double num1, double num2) {
			double resultado =  num1/num2;
			historico.add(num1 + "/" + num2 + "=" + resultado);
			return resultado;
		}
		
		public static String historico() {
			return historico.toString();
		}
}