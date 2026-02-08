//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package Teste3;

import java.util.Scanner;

public class Atv3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int numA = sc.nextInt();
        System.out.println("Digite outro numero:");
        int numB = sc.nextInt();
        if (numA == numB) {
            int numC = numA + numB;
            System.out.println("O valor A é: " + numA + ", o valor B é: " + numB + ", a soma dos valores é: " + numC);
        } else {
            int numC = numA * numB;
            System.out.println("O valor A é: " + numA + ", o valor B é: " + numB + ", a multiplicação dos valores é: " + numC);
        }

        volta();
        sc.close();
    }

    private static void volta() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Você quer fazer outro teste? 1--Sim ou 2--Não");
        int numDecide = sc.nextInt();
        switch (numDecide) {
            case 1 -> main(new String[0]);
            case 2 -> System.out.println("O programa acaba aqui");
        }

        sc.close();
    }
}
