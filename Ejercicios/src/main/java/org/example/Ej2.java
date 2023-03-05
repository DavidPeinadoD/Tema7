package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        //haz un array list de strings
        ArrayList<String> clientes = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int opcion = 0;
        while (opcion != 3) {
            System.out.println("1. Mostrar Clientes" + "\n" + "2. Añadir Cliente" + "\n" + "3. Salir");
            opcion = sc.nextInt();
            if (opcion == 1) {
                for (String cliente : clientes) {
                    System.out.println(cliente);
                }

            } else if (opcion == 2) {
                System.out.println("Introduce el nombre completo del cliente.");
                sc.nextLine();
                clientes.add(sc.nextLine());
            } else if (opcion == 3) {
                System.out.println("Saliendo del programa.");
            } else {
                System.out.println("Opción no válida. Introduce una opción entre 1 y 3.");
            }
        }
    }
}