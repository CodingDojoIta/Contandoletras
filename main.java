// authors = 'Thallison', 'Matheus', 'Joab'
import java.util.ArrayList;

public class codigo {

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
