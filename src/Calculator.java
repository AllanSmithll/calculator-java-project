/**
 * @author Allan Alves Amancio
 * Calculator Class
*/
import java.util.ArrayList;

public class Calculator {
		public static ArrayList<String> historic = new ArrayList<>();
		private Calculator() {}
		
		/**
		* Calculates the sum of two numbers.
		*
		* @param num1 The first number to be added.
		* @param num2 The second number to be added.
		* @return The result of the addition.
		*/
		public static double addition(double num1, double num2) {
			double result = num1+num2;
			historic.add(num1 + "+" + num2 + "=" + result);
			return result;
		}
		
		/**
		 * Calculates the sum of two numbers.
		 *
		 * @param num1 The first number to be added.
		 * @param num2 The second number to be added.
		 * @return The result of the addition.
		*/
		public static double subtraction(double num1, double num2) {
			double result =  num1-num2;
			historic.add(num1 + "-" + num2 + "=" + result);
			return result;
		}
		
		/**
		 * Calculates the product of two numbers.
		 *
		 * @param num1 The first number to be multiplied.
		 * @param num2 The second number to be multiplied.
		 * @return The result of the multiplication.
		 */
		public static double multiplication(double num1, double num2) {
			double result =  num1*num2;
			historic.add(num1 + "*" + num2 + "=" + result);
			return result;
		}
		
		/**
		 * Calculates the quotient of two numbers.
		 *
		 * @param num1 The dividend.
		 * @param num2 The divisor.
		 * @return The result of the division.
		*/
		public static double division(double num1, double num2) {
			double result =  num1/num2;
			historic.add(num1+"/"+num2+"="+result);
			return result;
		}

		/**
		 * Calculates the square root of a number.
		 *
		 * @param radicand The number to take the square root of.
		 * @return The square root of the radicand.
		 */
		public static double squareRoot(double radicand) {
			double result = Math.sqrt(radicand);
			historic.add("Sqr -> "+radicand+"="+result);
			return result;
		}

		/**
		 * Calculates the result of raising a base to an exponent.
		 *
		 * @param base The base.
		 * @param exponent The exponent.
		 * @return The result of the exponentiation.
		 */
		public static double exponentiation(double base, double exponent){
			double result = Math.pow(base, exponent);
			historic.add(base+"^"+exponent+"="+result);
			return result;
		}

		/**
		 * Calculates a percentage of a quantity.
		 *
		 * @param percentage The percentage to calculate.
		 * @param quantity The quantity to calculate the percentage of.
		 * @return The result of the percentage calculation.
		 */
		public static double percentage(double percentage, double quantity) {
			double result = (percentage * 100) / 100;
			historic.add(percentage+"% of "+quantity+"="+result);
			return result;
		}
		
		/**
		 * Returns a string representation of the calculation history.
		 * 
		 * @return a string representation of the calculation history
		 */
		public static String historic() {
			return historic.toString();
		}
}