import java.util.Scanner;
public class exmenu {
    public static void main(String[] args){
        /* Escreva um programa que lê a idade e o estado civil ( C – Casado, S – Solteiro, V –
        Viúvo e D – Desquitado) de várias pessoas. Ele deve calcular e exibir:
        - a quantidade de pessoas casadas
        - a quantidade de pessoas solteiras
        - a média das idades das pessoas viúvas
        - o percentual de pessoas desquitadas ou viúvas dentre todas as pessoas analisadas.
        O programa encerra execução quando a idade digitada for igual a zero.*/
        int idade = 9999;
        String estadocivil;
        int qtdeCasadas = 0;
        int qtdeSolteiros = 0;
        int qtdeViuvos = 0;
        int mediaViuvos = 0;
        int qtdeDesquitado = 0;
        int qtdePessoas = 0;
        Scanner scanner = new Scanner(System.in);
        do{
        System.out.printf("Digite o estado civil\n C- Casado \n S- Solteiro \n V- Viuvo \n D- Desquitado \n");
        estadocivil = scanner.nextLine();
        System.out.println("Digite a idade");
        idade = scanner.nextInt();  
        if(estadocivil.equalsIgnoreCase("C")){
            qtdeCasadas++;
        }
        if(estadocivil.equalsIgnoreCase("S")){
            qtdeSolteiros++;
        }
        if(estadocivil.equalsIgnoreCase("V")){
            qtdeViuvos++;
            mediaViuvos+=idade;
        }
        if(estadocivil.equalsIgnoreCase("D")){
            qtdeDesquitado++;
        }
        qtdePessoas++;
        System.out.println(" ");
        }while(idade > 0);

        System.out.println("Quantidade de casados: " + qtdeCasadas);
        System.out.println("Quantidade de solteiros: " + qtdeSolteiros);
        System.out.println("Media de viuvos: " + mediaViuvos/qtdeViuvos);
        System.out.println("Percentual desquitados e viuvos: " + (qtdeDesquitado+qtdeViuvos)*100/(qtdePessoas-1));

        















        scanner.close();
    }
}
