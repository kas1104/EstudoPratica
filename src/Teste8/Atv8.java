package Teste8;

import java.util.Scanner;

public class Atv8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] vetorNum = new int[3];

        for(int x = 0; x < vetorNum.length; x++){
            System.out.println("Digite um numero: ");
            vetorNum[x] = sc.nextInt();
        }

        System.out.println();

        exibirLista(vetorNum);

        logicaTroca(vetorNum);

        System.out.println();

        System.out.println("Ordem descrecente dos valores digitados: ");

        exibirLista(vetorNum);

        volta();

        sc.close();
    }

    public static void logicaTroca(int[] vetorNum){
        for(int x = 0; x < vetorNum.length; x++){
            for(int y = x; y < vetorNum.length; y++){

                if(vetorNum[x] < vetorNum[y]) {
                    int verifica = vetorNum[x];
                    vetorNum[x] = vetorNum[y];
                    vetorNum[y] = verifica;
                }
            }
        }
    }

    public static void exibirLista(int[] vetorNum){
        for(int x = 0; x < vetorNum.length; x++){
            System.out.println("[" + vetorNum[x] + "]");
        }
    }

    public static void volta(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Você quer fazer outro teste? 1--Sim ou 2--Não");
        int numDecide = sc.nextInt();

        switch(numDecide){
            case 1:
                main(new String[0]);
                break;
            case 2:
                System.out.println("O programa encerra aqui!!");
                break;
            default:
                System.out.println("Digite um valor valido!");
                volta();
                break;
        }

        sc.close();
    }
}
