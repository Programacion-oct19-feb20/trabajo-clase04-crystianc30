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
public class EjercicioTres {
    /*
      Generar un prgrama que permita pedir datos por teclado para:
    ingreso de nombre completos de un estudiante
    ingreso de nota 1 (debe ser entero)
    ingreso de nota 2 (debe ser entero)
    ingreso del ciclo que cursa el alumno (debe ser cadena)
    
    Luego presentar los datos de la siguiente forma:
    Informe del Alumno
    Nombres Completos:
    Ciclo:
    Nota 1:
    Nota 2:
    */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        String nombres_completos;
        int nota_1; // enteros
        int nota_2; // enteros
        String ciclo; // cadena

        System.out.println("Ingrese sus Nombres Completos:");
        nombres_completos = entrada.nextLine(); // entrada en cadena
        System.out.println("Ingrese su Nota 1:");
        nota_1 = entrada.nextInt(); // entrada en enteros
        System.out.println("Ingrese su Nota 2:");
        nota_2 = entrada.nextInt(); // ingreso de enteros
        
        entrada.nextLine();                
        System.out.println("Ingrese que Ciclo Cursa:");
        ciclo = entrada.nextLine(); // ingreso de cadena

        System.out.printf("Informe del Alumno:\nNombres Completos:"
                + "%s\nNota 1:%d\nNota 2:%d\nCiclo que Cursa:%s\n", 
                nombres_completos,nota_1, nota_2, ciclo);
        
    }
}
