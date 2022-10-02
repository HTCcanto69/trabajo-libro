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
public class ejercicio3 {

public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
double l,r; // longitud y radio
System.out.print("Introduce el radio de una circunferencia: ");
r=sc.nextDouble();
l=2*Math.PI*r;
System.out.println("La longitud de una circunferencia de radio " + r+ " es: " + l);
}
}