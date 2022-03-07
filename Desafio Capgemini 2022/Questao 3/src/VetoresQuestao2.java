import java.util.Scanner;
import java.util.ArrayList;
import java.util.Objects;
import java.util.List;



public class VetoresQuestao2 //Colocar a classe VetoresQuestao2 como public para ser utilizada por todas as classes do projeto.
{
    public static void main(String[] args) 
    {
        
        Scanner input = new Scanner(System.in);
	int y, x, lista;
	
	System.out.println("Bem-Vindo ao Algoritmo de Vetores Inteiros!");
	System.out.println("Quantos números sua lista vai ter? "); //Inserir a quantidade de números da lista
	lista = input.nextInt();
	
	int[] vet = new int[lista];
	
	System.out.println("Digite o valor para um inteiro qualquer x: "); //Inserir um número inteiro qualquer x.
	x = input.nextInt();

        List<Integer> vetor = new ArrayList<>();
        int a, b, pares = 0;

        
        for(a = 0; a < lista; a++) //Colocar os valores na lista
        {
                System.out.println("Número da posição "+ a);
                int valor = input.nextInt();
                vetor.add(valor);
        }
        
        for(b = 0; b < lista; b++) //Pares que tenham o valor da sua diferença igual ao valor de x.
        {
                 for(a = 0; a < lista; a++)
                 {
                        if((vetor.get(a) - vetor.get(b) == x) && !(Objects.equals(vetor.get(a), vetor.get(b))))
                        {
                                pares++;
                        }
                }
        }
        //Pares do vetor que tem uma diferença igual ao valor de x.
        System.out.println("Quantidade de pares do vetor que tem uma diferença igual ao valor de x= " + pares);
       
        } 
}
