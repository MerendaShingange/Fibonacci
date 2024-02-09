/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fibonacci;
import java.util.Scanner;
/**
 *
 * @author Lenovo-User
 */
public class Fibonacci {

    public static void main(String[] args) {
       

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of Fibonacci terms to generate: ");
        int numTerms = scanner.nextInt();

        generateFibonacci(numTerms);
    }

    private static void generateFibonacci(int numTerms) {
        int firstTerm = 0, secondTerm = 1;

        System.out.println("Fibonacci Sequence up to " + numTerms + " terms:");

        for (int i = 0; i < numTerms; i++) {
            System.out.print(firstTerm + " ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}

    

