// authors = 'Thallison', 'Matheus', 'Joab'

//-----------------
//Este problema foi utilizado em 155 Dojo(s).
//Se os números de 1 a 5 fossem escritos em palavras: um, dois, três, quatro, cinco, então teríamos utilizado 2 + 4 + 4 + 6 + 5 = 21 letras no total.
//Se todos os números de 1 até 20 fossem escritos em palavras, quantas letras nós teríamos utilizado?

import java.util.ArrayList;


public class cod3 {

	public static void main(String[] args) {
        String[] numeros = {"um","dois","três","quatro","cinco","seis","sete","oito","nove","dez","onze","doze","treze","quatorze","quinze",
        "dezesseis","dezessete","dezoito","dezenove","vinte"};
        ArrayList<Integer> numerosValor = new ArrayList<Integer>();
        String valorImprimir = "";
        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {   
            numerosValor.add(numeros[i].length());
        }
        for (int i = 0; i < numeros.length; i++) { 
            valorImprimir = valorImprimir + " + " +numerosValor.get(i).toString();
            soma = soma + numerosValor.get(i);
            if(i == numeros.length - 1)
            {
                System.out.println(valorImprimir.substring(2) + " = " + soma + "letras no total.");
            }
        }

	}

}
