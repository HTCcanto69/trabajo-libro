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
public class ejercicio2 {

public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
double a,r; // área y radio
System.out.print("Introduce el radio de un circulo: ");
r=sc.nextDouble();
a=Math.PI*(r*r); // para elevar al cuadrado otra opción es: Math.pow (r, 2)
System.out.println("El área de una circunferencia de radio " + r+ " es: " + a);
}
}