import java.util.Scanner;

public class uri1154 {
	Scanner input = new Scanner(System.in);
	private double soma = 0;
	private int contador = 0;
	
	
	public Scanner getInput() {
		return input;
	}
	public void setInput(Scanner input) {
		this.input = input;
	}
	public double getSoma() {
		return soma;
	}
	public void setSoma(double soma) {
		this.soma = soma;
	}
	public int getContador() {
		return contador;
	}
	public void setContador(int contador) {
		this.contador = contador;
	}
	
	public void age() {
		
		while (true) {
			int age = input.nextInt();
			
			if (age < 0) {
				break;
			} else {
				soma = soma + age;
				contador++;
			}
			
		}
		System.out.println(String.format("%.2f", soma / contador));
		
	}


}
