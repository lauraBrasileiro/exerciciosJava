package listaexercicios;

public class Exercicio1 {
	public static void main(String[] args ) {
	Integer soma = 0;

	for (Integer i = 0; i <= 500; i++) {

	    if(i % 2 != 0 && i % 3 == 0) {
	        soma += i;
	    }
	}

	System.out.println(soma);
}}
