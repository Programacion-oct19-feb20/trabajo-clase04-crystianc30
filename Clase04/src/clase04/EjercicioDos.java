/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase04;

import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class EjercicioDos {

    /*
    Generar un prgrama que permita pedir datos por teclado para:
    ingreso de nombre
    ingreso de ciudad de nacimiento
    ingreso de edad
    ingreso de costo de matricula
    
    Luego presentar los datos de la siguiente forma:
    Datos Personales:
    Nombres:
    Ciudad de Nacimiento:
    Edad:
    Matrícula:
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        String nombres;
        String ciudad_de_nacimiento;
        int edad; // enteros
        double costo_de_matrícula; // decimales

        System.out.println("Ingrese sus Nombres:");
        nombres = entrada.nextLine(); // entrada en cadena
        System.out.println("Ingrese su Ciudad de Nacimiento:");
        ciudad_de_nacimiento = entrada.nextLine(); // entrada en cadena
        System.out.println("Ingrese su Edad:");
        edad = entrada.nextInt(); // ingreso de enteros
        System.out.println("Ingrese su Costo de Matrícula:");
        costo_de_matrícula = entrada.nextDouble(); // ingreso de decimales

        System.out.printf("Datos Personales:\nNombres:%s\nCiudad de Nacimiento:"
                + "%s\nEdad:%d\nCosto de Matrícula:%.1f\n", nombres,
                ciudad_de_nacimiento, edad, costo_de_matrícula);

    }
}
