/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio;

import java.util.Scanner;

/**
 *
 * @author 12941311688
 */
public class Exercicio8 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Escreva o 1° numero: ");
        String num = s.nextLine();
        System.out.print("Escreva o 2° numero: ");
        String num2 = s.nextLine();
        System.out.println();
        if (num == num2) {
            System.out.print("Eles são iguais");
        } else if (num!=num2){
            System.out.print("Eles são diferentes");
        }

    }
}
