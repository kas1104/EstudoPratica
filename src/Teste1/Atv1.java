//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package Teste1;

import java.util.Scanner;

public class Atv1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int numA = sc.nextInt();
        System.out.println("Digite um segundo numero:");
        int numB = sc.nextInt();
        System.out.println("Digite um terceiro numero:");
        int numC = sc.nextInt();
        int soma = numA + numB;
        if (soma < numC) {
            System.out.println("O primeiro valor que você digitou foi: " + numA + ", o segundo valor que você digitou foi: " + numB + "o terceiro valor que você digitou foi: " + numC);
            System.out.println("A soma dos dois primeiros valores são: " + soma + ", e é menor que: " + numC);
        } else if (soma > numC) {
            System.out.println("O primeiro valor que você digitou foi: " + numA + ", o segundo valor que você digitou foi: " + numB + "o terceiro valor que você digitou foi: " + numC);
            System.out.println("A soma dos dois primeiros valores são: " + soma + ", e é maior que: " + numC);
        }

        volta();
        sc.close();
    }

    public static void volta() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quer fazer outra operação? 1--Sim ou 2--Não");
        int numDecide = sc.nextInt();
        switch (numDecide) {
            case 1:
                main(new String[0]);
            default:
                sc.close();
                return;
            case 2:
                System.out.println("O programa encerra aqui");
        }
    }
}
