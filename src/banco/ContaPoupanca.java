package banco;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(String a, int b){
		super(a,b);
	}
	
	 public void incrementarJuros() {
		 
		 
		 double a = getQuantia() + (0.05*getQuantia());
		 
		 setQuantia(a);

	 }


}
