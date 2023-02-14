package banco;

public class Conta {
	

		  private String NumConta;
		  private double Quantia;
		  
		  
		  
		  public Conta(String a, double b){
			   NumConta = a;
			  Quantia = b;
			  
		  }
		  public void setQuantia(double a){
			  Quantia = a;
		  }
		  
		  public void depositar(double valor) {
			  
			  
			  Quantia = Quantia + valor;
			  
		  }

		  public void sacar(int valor) {
			  if(valor <= Quantia){
				  
				  Quantia = Quantia - valor;

				  
			  }
			  else{
				  System.out.println("Valor errado");
			  }
			  
		  }

		  public double getQuantia(){
			  return Quantia;
		  }
		  
		  public void verificarQuantia() {
			  
			  System.out.println(getQuantia());
		  }

		  public void cancelar() {
			  
			  NumConta= "";
			  Quantia = 0;
		  }

		

}
