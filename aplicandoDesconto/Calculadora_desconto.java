package aplicandoDesconto;

import java.util.Scanner;

public class Calculadora_desconto {

	public static void main(String[] args) {
		
		Scanner tcl = new Scanner(System.in);//variable for keyboard input
		
		FuncaoCalc rs = new FuncaoCalc();//call of class to make math operation
		
		System.out.print("Digite o valor total da compra: ");//data input- value
		rs.preco = tcl.nextDouble();
		
		System.out.print("Digite a porcentagem do desconto: ");//data input- discount
		double off = tcl.nextDouble();
		
		double total = rs.aplicaDesconto(off);//method for discount application
		
		System.out.printf("O total a pagar com desconto é: R$%.2f.", total);//The total amount payable at a discount is: R $% 2f.
		
		tcl.close();
	}
	
}
