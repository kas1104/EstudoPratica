package Teste10;

import java.util.Scanner;

public class Atv10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Double[] vetorNota = new Double[3];

        perguntaNota(vetorNota);

        System.out.println();

        exibirVetor(vetorNota);

        logicaVetor(vetorNota);

        volta();

        sc.close();

    }
//3.6 7.8 5.76
    public static void logicaVetor(Double[] vetorNota){
        for(int x = 0; x < vetorNota.length; x++){

            Double media = (vetorNota[0] + vetorNota[1] + vetorNota[2]) / 3;

            for(int y = x; y < 1; y++){
                if(media < 10) {
                    System.out.println("A sua media é: " + media);
                }
                else if (media > 10){
                    System.out.println("Digite valores validos!");
                    main(new String[0]);
                }
            }
        }
    }

    public static void perguntaNota(Double[] vetorNota){
        Scanner sc = new Scanner(System.in);

        for(int x = 0; x < vetorNota.length; x++){
            System.out.println("Digite sua nota " + (x + 1) + ", para somar e ver sua media:");
            vetorNota[x] = sc.nextDouble();
        }
    }

    public static void exibirVetor(Double[] vetorNota){
        for(int x = 0; x < vetorNota.length; x++){
            System.out.println("Sua nota " + (x + 1) + ", é: " + vetorNota[x]);
        }
    }

    public static void volta(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Você quer fazer outra operação? 1-- Sim ou 2--Não");
        int numDecide = sc.nextInt();

        switch(numDecide){
            case 1:
                main(new String[0]);
                break;
            case 2:
                System.out.println("O programa encerra aqui!");
                break;
            default:
                System.out.println("Digite um valor valido!");
                volta();
                break;
        }
        sc.close();
    }
}
