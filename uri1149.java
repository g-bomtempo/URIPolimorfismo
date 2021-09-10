import java.util.Scanner;

public class uri1149 {
	
	Scanner leitor = new Scanner(System.in);
	private int A;
	private int N;
	private int soma = 0;
	
	public int getA() {
		return A;
	}
	public void setA(int a) {
		this.A = a;
	}
	public int getN() {
		return N;
	}
	public void setN(int n) {
		this.N = n;
	}
	
	public void Calculo() {
		this.A = leitor.nextInt();
		
		while(true) {			
			if (N <= 0) {
				this.N = leitor.nextInt();
			} else {
				while (N != 0) {
					soma = soma + A;
					A++;
					N--;
				}
				System.out.println(soma);
				break;				
			}
		}
	}
	

	

}
