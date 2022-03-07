import java.util.Arrays;
import java.util.Scanner;


public class MedianaQuestao1 //Colocar a classe MedianaQuestao1 como public para ser utilizada por todas as classes do projeto.
{

    public static final String ANSI_RED = "";
    public static final String ANSI_RESET = "";
    public static void main(String args[]) 
    {
        float res;
        float [] arrayone;
        char choice;
        int choiceone;
        Scanner input = new Scanner (System.in);

        System.out.println("\nBem-Vindo ao Algoritmo de Mediana\n"); 
        System.out.println("\nQuantos elementos vai ter a lista?");//Saber quantos elementos vai ter na lista e digitar a quantidade
        System.out.println("Digite a quantidade: ");

        choiceone = input.nextInt();
        arrayone = new float[choiceone];
        
        for (int y = 0; y < arrayone.length; y++) //Digitar os números da lista
        { 
            System.out.println("Digite os numeros da lista: ");
            arrayone [y] = input. nextFloat();
        }

        Arrays.sort(arrayone);  //O método sort() permite classificar (ordenar) elementos de um array local.
        boolean er = true;
        while (er) 
        {
            res = 0;
            System.out.println("\n\nVoce quer calcular a mediana?: \nS. Mediana\nN. Sair\n"); //Opção de calcular a mediana ou não e digitar a escolha
            System.out.print("Digite sua escolha: ");
            choice = input.next().charAt (0);
            
            if (choice == 's' ) //Cálculo da Mediana
            {
                if (arrayone.length % 2 == 1) 
                {
                        res = arrayone[(arrayone.length + 1) / 2 - 1];
                } else 
                {
                    res = (arrayone [arrayone.length / 2 - 1] + arrayone [arrayone.length / 2]) / 2;
                }
                System.out.println("Resultado: " + ANSI_RED + res + ANSI_RESET); 

           
            } 
            else if (choice == 'n')  //Sair do Programa
            { 
                System.out.println("Thanks!");
            } else 
            {
                System.out.println("Por favor escolha s ou n");
            }
        }
    }
}

