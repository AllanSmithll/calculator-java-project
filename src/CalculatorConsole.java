import java.util.Scanner;

public class CalculatorConsole {

	public static void main(String[] args) {
				Scanner scanner = new Scanner(System.in);
		
				while (true) {
					System.out.println("Digite uma operação (ex: 2 + 3), s para sair, h para histórico:");
					String input = scanner.nextLine();
					if (input.startsWith("s")) {break;}
					if (input.startsWith("h")) {System.out.println(Calculator.historic()); continue;}
		
					String[] parts = input.split(" ");
					if (parts.length != 3) {
						System.out.println("Entrada inválida");
						continue;
					}
		
					double num1, num2;
					try {
						num1 = Double.parseDouble(parts[0]);
						num2 = Double.parseDouble(parts[2]);
					} catch (NumberFormatException e) {
						System.out.println("Entrada inválida");
						continue;
					}
		
					double result;
					switch (parts[1]) {
						case "+":
							result = Calculator.addition(num1, num2);
							break;
						case "-":
							result = Calculator.subtraction(num1, num2);
							break;
						case "*":
							result = Calculator.multiplication(num1, num2);
							break;
						case "/":
							result = Calculator.division(num1, num2);
							break;
						case "^":
							result = Calculator.exponentiation(num1, num2);
							break;
						case "%":
							result = Calculator.percentage(num1, num2);
							break;
						default:
							System.out.println("Operador inválido");
							continue;
					}
		
					System.out.println(result);
				}
				scanner.close();
			}
		}
