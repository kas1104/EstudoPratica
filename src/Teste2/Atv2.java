//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package Teste2;

import java.util.Scanner;

public class Atv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero para ver se ele par ou impar:");
        int numVerifica = sc.nextInt();
        if (numVerifica % 2 != 0) {
            System.out.println("O numero: " + numVerifica + ", é impar");
        } else {
            System.out.println("O numero: " + numVerifica + ", é par");
        }

        volta();
    }

    private static void volta() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quer fazer outro teste? 1--Sim ou 2--Não");
        int numValida = sc.nextInt();
        switch (numValida) {
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

    }
}
