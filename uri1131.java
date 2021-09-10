import java.util.Scanner;

public class uri1131 {
	
	Scanner leitor = new Scanner(System.in);
	private int vitoriaInter;
	private int vitoriaGremio;
	private int empate;
	private int contador = 1;	
		
	public int getVitoriaInter() {
		return vitoriaInter;
	}
	public void setVitoriaInter(int vitoriaInter) {
		this.vitoriaInter = vitoriaInter;
	}
	public int getVitoriaGremio() {
		return vitoriaGremio;
	}
	public void setVitoriaGremio(int vitoriaGremio) {
		this.vitoriaGremio = vitoriaGremio;
	}
	public int getEmpate() {
		return empate;
	}
	public void setEmpate(int empate) {
		this.empate = empate;
	}
	public int getContador() {
		return contador;
	}
	public void setContador(int contador) {
		this.contador = contador;
	}
	
	public void total(int condicao) {
		
		while (condicao != 2) {
			int golsInter = leitor.nextInt();
			int golsGremio = leitor.nextInt();
			
			if (golsInter > golsGremio) {
				this.vitoriaInter++;
			} else if (golsInter < golsGremio) {
				this.vitoriaGremio++;
			} else if (golsInter == golsGremio) {
				this.empate++;
			}
			this.contador++;
			System.out.println("Novo grenal (1-sim 2-nao)");			
			condicao = leitor.nextInt();	
			
		}
	}
	
	

}
