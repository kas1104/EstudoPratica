package Teste6;

import java.util.Scanner;

public class Atv6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        Double numValor = sc.nextDouble();

        Double numConta = (numValor * 0.05) + numValor;

        System.out.println("O valor que voê digitou foi: " + numValor + ", e ele foi aumentado em 5 % e ficou: " + ((numValor * 0.05) + numValor));
        System.out.println("E esse mesmo valor se tivesse um desacrescimo ficaria " + ( numValor - ( numValor * 0.05)));

        volta();

        sc.close();
    }

    private static void volta(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Quer fazer outra operação? 1-- Sim ou 2-- Não");
        int numDecide = sc.nextInt();

        switch(numDecide){
            case 1:
                main(new String[0]);
                break;
            case 2:
                System.out.println("O programa encerra aqui");
                break;
            default:
                System.out.println("Digite um valor valido");
                volta();
        }

        sc.close();
    }
}
