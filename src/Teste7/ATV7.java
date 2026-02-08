package Teste7;

import java.util.Scanner;

public class ATV7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numValor1 = sc.nextInt();

        System.out.println("Digite um segundo numero: ");
        int numValor2 = sc.nextInt();

        if (2 <= (numValor1 + numValor2) && 10 >= (numValor1 * numValor2)) {
            System.out.println("os valores digitados são verdadeiros");
        }
        else if(10 <= (numValor1 + numValor2) || 30 >= (numValor1 * numValor2)){
            System.out.println("Os valores digitados são falsos!!");
        }
        volta();

        sc.close();

    }

    private static void volta(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Você quer fazer outra operação? 1--Sim ou 2--Não");
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

        }
        sc.close();
    }
}
