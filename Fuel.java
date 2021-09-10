
public class Fuel {
	
	private int alcool;
	private int gasolina;
	private int diesel;
	
		
	public int getAlcool() {
		return alcool;
	}
	public void setAlcool(int alcool) {
		this.alcool = this.alcool + 1;
	}
	public int getGasolina() {
		return gasolina;
	}
	public void setGasolina(int gasolina) {
		this.gasolina = this.gasolina + 1;
	}
	public int getDiesel() {
		return diesel;
	}
	public void setDiesel(int diesel) {
		this.diesel = this.diesel + 1;
	}
	
	public void total(int condicao) {		
		if (condicao == 1) {
			setAlcool(condicao);
		} else if (condicao == 2) {
			setGasolina(condicao);
		} else if (condicao == 3) {
			setDiesel(condicao);
		}		
		
		if (condicao == 4) { 
			System.out.println("MUITO OBRIGADO");
			System.out.println("Alcool: " + getAlcool());
			System.out.println("Gasolina: " + getGasolina());
			System.out.println("Diesel: " + getDiesel());
			return;
		}		
		
	}
	
	

}
