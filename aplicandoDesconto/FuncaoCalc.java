package aplicandoDesconto;

public class FuncaoCalc {
	double preco;//d3
	//double desconto;//e3
	
	double aplicaDesconto(double desconto){
		double produto = (desconto * preco) / 100;
		return preco - produto;
		
	}
}
