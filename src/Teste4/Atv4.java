//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package Teste4;

import java.util.Scanner;

public class Atv4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int numA = sc.nextInt();
        System.out.println("O numero que você digitou é: " + numA + ", o antecessor dele é: " + (numA - 1) + ", o sucessor dele é: " + (numA + 1));
        volta();
        sc.close();
    }

    public static void volta() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Deseja fazer outra operação? 1--Sim ou 2--Não");
        int numDecide = sc.nextInt();
        switch (numDecide) {
            case 1 -> main(new String[0]);
            case 2 -> System.out.println("O programa encerra aqui!");
        }

        sc.close();
    }
}
