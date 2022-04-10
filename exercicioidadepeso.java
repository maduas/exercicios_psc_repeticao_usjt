import java.util.Scanner;
public class exercicioidadepeso{
    public static void main(String[] args){
        /*Escreva um programa que recebe a idade, a altura e o peso de várias pessoas. Ele
        calcula e exibe:
        - a quantidade de pessoas com idade superior a 50 anos.
        - a média das alturas das pessoas com idade entre 10 e 20 anos, inclusive.
        - o percentual de pessoas com peso inferior a 40 quilos entre todas as pessoas
        analisadas.
        O programa encerra sua execução quando a idade digitada for igual a zero.*/
        Scanner s = new Scanner(System.in);
        int idade = 9999;
        int altura = 9999;
        int peso = 9999;
        int menorQuarentaKg = 0;
        int qtdePessoas = 0;
        int superiorCinquenta = 0;
        int mediaAltura = 0;
        int mediaAlturaRep =0;
        do{
            System.out.println("Digite a idade da pessoa " + (qtdePessoas+1));
            idade = s.nextInt();
            System.out.println("Digite a altura da pessoa " + (qtdePessoas+1));
            altura = s.nextInt();
            System.out.println("Digite o peso da pessoa " + (qtdePessoas+1));
            peso = s.nextInt();
            
            if(idade>50){
                superiorCinquenta++;
            }
            if(idade>=10 && idade<=20){
                mediaAlturaRep++;
                mediaAltura += altura;
            }
            if(peso<40){
                menorQuarentaKg++;
            }
        qtdePessoas++;
            System.out.println(" ");
        }while (idade!=0);
        System.out.println("Pessoas com mais de 50 anos: " + superiorCinquenta);
        System.out.println("Media altura de pessoas entre 10 e 20 anos: " + mediaAltura/mediaAlturaRep);
        System.out.println("% pessoas com menos de 40kg: " + (menorQuarentaKg-1)*100/(qtdePessoas-1));

        s.close();
        






















    }
}