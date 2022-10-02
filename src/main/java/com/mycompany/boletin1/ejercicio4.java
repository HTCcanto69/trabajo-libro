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
public class ejercicio4 {

public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);

int n1,n2;
System.out.print("Introduce un número: ");
n1=sc.nextInt();
System.out.print("Introduce otro número: ");
n2=sc.nextInt();
if(n1==n2)
System.out.println("Son iguales");
else
System.out.println("No son iguales");
}
}