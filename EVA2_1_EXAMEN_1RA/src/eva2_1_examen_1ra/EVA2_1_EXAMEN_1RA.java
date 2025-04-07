/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_1_examen_1ra;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class EVA2_1_EXAMEN_1RA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu= new Scanner(System.in);
        int arr1[],arr2[];
        System.out.println("Tamanaño de los arreglos");
        int tam=captu.nextInt();
        arr1 =new int[tam];
        arr2 =new int[tam];
        //imprime los arreglos sin valores
        for (int i = 0; i < tam; i++) {
            System.out.print("[ " + arr1[i]+ " ]");
        }
        System.out.println("");
        for (int i = 0; i < tam; i++) {
            System.out.print("[ " + arr2[i]+ " ]");
        }
        //captura los datos de los arreglos
        System.out.println("");
        for (int i = 0; i < arr1.length; i++) { 
                System.out.println("Dato " + (i+1) + " del arreglo 1:");
                arr1[i]=captu.nextInt();
                captu.nextLine();
            }
            System.out.println("");
            for (int i = 0; i < arr2.length; i++) {
                System.out.println("Dato " + (i+1) + " del arreglo 2:");
                arr2[i]=captu.nextInt();
                captu.nextLine();    
            }
        //imprime el valor de los arreglos con valores
        for (int i = 0; i < tam; i++) {
            System.out.print("[ " + arr1[i]+ " ]");
        }
        System.out.println("");
        for (int i = 0; i < tam; i++) {
            System.out.print("[ " + arr2[i]+ " ]");
        }
        //ver si los arreglos son iguales lugar por lugar 
        System.out.println("");
          for (int i = 0; i < tam; i++) {
            if (arr1[i] == arr2[i]) {
                System.out.println("El arreglo es igual en la posicion "+ (i + 1));
            } else {
                System.out.println("El arreglo no es igual en la posicion "+ (i + 1));
            }
        }
          //compara todo el arreglo
          System.out.println("");
            if (arr1.length != arr2.length) {
                System.out.println("El arreglo completo es igual");
            } else {
                System.out.println("El arreglo completo no es igual");
        }
            
    }
}

