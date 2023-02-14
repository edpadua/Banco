package banco;



public class Teste {
	
	
public static void main(String[] args) {
	Cliente C1;
	C1=new Cliente("luis", "34545");
	
	
	C1.myCONTA[0] = new ContaCorrente("Conta0", 50);
	C1.myCONTA[1] = new ContaPoupanca("Conta1", 100);
	
	C1.myCONTA[2] = new ContaEspecial("Conta2", 0, 50);
	
	

	System.out.println("Conta Corrente - Adicionando 200 e sacando 50");
	System.out.println(C1.myCONTA[0].getQuantia());
	
	C1.myCONTA[0].depositar(2000);
	
	C1.myCONTA[0].sacar(50);
	
	System.out.println(C1.myCONTA[0].getQuantia());
	
	
	
	

	System.out.println("Conta Poupança - Adicionando Juros");
	System.out.println(C1.myCONTA[1].getQuantia());
	
	C1.myCONTA[1].depositar(2000);
	
	((ContaPoupanca) C1.myCONTA[1]).incrementarJuros();
	
	System.out.println(C1.myCONTA[1].getQuantia());
	
	
	

	

	System.out.println("Conta Especial");
	
	System.out.println(C1.myCONTA[2].getQuantia());
	
	C1.myCONTA[2].depositar(2000);
	
	C1.myCONTA[2].sacar(2050);
	
	

	
	System.out.println(C1.myCONTA[2].getQuantia());
	
	
	
	
	
}	

}


  
