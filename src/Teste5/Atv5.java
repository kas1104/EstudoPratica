//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package Teste5;

import java.util.Scanner;

public class Atv5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu salario:");
        Double numSalarioUsuario = sc.nextDouble();
        System.out.println("Digite o valor do salario minimo atualmente:");
        Double numSalarioMinimo = sc.nextDouble();
        Double numSalarioTotal = numSalarioUsuario / numSalarioMinimo;
        long numSalarioArredondado = Math.round(numSalarioTotal);
        System.out.println("O numero de salarios que você ganha é: " + numSalarioArredondado);
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
