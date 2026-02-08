package Teste9;

import java.util.Scanner;

public class Atv9 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu peso: ");
        double numPeso = sc.nextDouble();

        System.out.println("Digite a sua altura: ");
        Double numAltura = sc.nextDouble();

        Double numIMC = numPeso / (numAltura * numAltura);

        logicaVerifica(numIMC);

        System.out.println();

        volta();

        sc.close();
    }

    public static void logicaVerifica(Double numIMC){

        if(numIMC < 18.5){
            System.out.println("Seu IMC é: " + numIMC);
            System.out.println("Você está abaixo do peso ideal");
        }
        else if(numIMC >= 18.5 && numIMC <= 24.9){
            System.out.println("Seu IMC é: " + numIMC);
            System.out.println("Peso ideal!! Parabens");
        }
        else if(numIMC >= 25.0 && numIMC <= 29.9){
            System.out.println("Seu IMC é: " + numIMC);
            System.out.println("Levemente acima do peso");
        }
        else if(numIMC >= 30.0 && numIMC <= 34.9){
            System.out.println("Seu IMC é: " + numIMC);
            System.out.println("Obesidade grau 1");
        }
        else if(numIMC >= 35.0 && numIMC <= 39.9){
            System.out.println("Seu IMC é: " + numIMC);
            System.out.println("Obesidade grau 2");
        }
        else if(numIMC <= 40.0){
            System.out.println("Seu IMC é: " + numIMC);
            System.out.println("Obesidade grau 3");
        }
    }

    public static void volta(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Você quer fazer outra verificação? 1--Sim ou 2--Não");
        int numDecide = sc.nextInt();

        switch(numDecide){
            case 1:
                main(new String[0]);
                break;
            case 2:
                System.out.println("O programa encerra aqui");
                break;
            default:
                System.out.println("Digite um valor valido!");
                volta();
                break;
        }
        sc.close();
    }
}
