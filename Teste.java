import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		Fuel f = new Fuel();
		int condicao = 0;
		
		while (condicao != 4) {
			condicao = leitor.nextInt();
			f.total(condicao);
		}
		
		
		

	}

}
