/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.boletin1;
import java.util.Scanner;
/**
 *
 * @author Hermes
 */
public class ejercicio5 {

public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);

int num;
System.out.print("Introduce un número: ");
num=sc.nextInt();
if( num < 0)
System.out.println("Negativo");
else
// suponemos que el 0 es positivo.
System.out.println("Positivo");
}
}