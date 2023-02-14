package banco;

public class ContaEspecial extends Conta {

	public double limite;

	public ContaEspecial(String a, double b, double c) {


		super(a, b);
		limite = c;
		// TODO Auto-generated constructor stub
	}



	  public void sacar(int valor) {
		  if(valor <= getQuantia()){

			 setQuantia(getQuantia() - valor);

		  }



		  else if(valor<= getQuantia()+limite){

			  limite = limite - valor;

			  setQuantia( limite);

			  }
		  else{

			  System.out.println("mesmo com limite nao tem suficiente");
		  }

	  }


}
