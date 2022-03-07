import java.util.Scanner;

public class MensagemQuestao3 //Colocar a classe EncriptadaQuestao3 como public para ser utilizada por todas as classes do projeto.
{ 
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("\nBem-Vindo ao Algoritmo de Textos Encriptados\n"); 
	System.out.println("Digite aqui a sua frase para ser criptografada: "); //Digitação do texto
	String texto = input.nextLine();

    String trecho = texto.replace(" ", ""); //Espaços removidos do texto.
    int parcela_let = trecho.length(); //Quantidade de letras
    double raiz_let = (double) Math.sqrt(parcela_let); //Raiz quadrada do número caracteres
    int numero_inteiro = (int) Math.round(raiz_let); //Colocar em número inteiro as raízes não exatas

    
    char[][] pegString = new char[numero_inteiro][numero_inteiro]; //Frase no Grid
    int parcela= 0;
        for(int y = 0; y < numero_inteiro; y++)
        {
            for(int x = 0; x < numero_inteiro;x++)
            {
                char[] posi = trecho.toCharArray();
                pegString[y][x] = posi[parcela];
                parcela++;
                if(parcela == parcela_let)
                {
                    break;
                }
            }
        }
        parcela = 0;
    
    for(int y = 0; y < numero_inteiro;y++) //Texto Codificado
    { 
        for(int x = 0; x < numero_inteiro;x++)
        {
            System.out.print(pegString[x][y]);
            parcela++;
            if(parcela == texto.length())
            {
                break;
            }
        }
        System.out.print(" ");
        }
    }
}
