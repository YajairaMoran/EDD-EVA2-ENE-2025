/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_8_collections1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author usuario
 */
public class EVA2_8_COLLECTIONS1 {

    public static void main(String[] args) {
        System.out.println("LINKEDLIST");
        LinkedList<Integer> miLista = new LinkedList();
        miLista.add(100);
        miLista.add(200);
        miLista.add(300);
        miLista.add(400);
        miLista.add(500);
        miLista.add(600);
        System.out.println(miLista);
        miLista.remove(3);
        System.out.println(miLista);
        miLista.add(2,250);
        System.out.println(miLista);
        miLista.clear();
        System.out.println(miLista);
        
        System.out.println("");
        System.out.println("ARRAYLIST");//se basa en arreglos
        ArrayList<String> miArrayList = new ArrayList();
        miArrayList.add("Hola");
        miArrayList.add("");
        miArrayList.add("mundo");
        miArrayList.add("");
        miArrayList.add("curel");
        miArrayList.add("");
        miArrayList.add("!!");
        System.out.println(miArrayList);
        for (int i = 0; i < miArrayList.size(); i++) {
            System.out.print("[ "+miArrayList.get(i)+" ]");
        }
        //QUEQUE
        System.out.println("");
        System.out.println("");
        System.out.println("QUEQUES");
        Queue<Integer> miQueue = new LinkedList();
        miQueue.add(100);
        miQueue.add(200);
        miQueue.add(300);
        miQueue.add(400);
        miQueue.add(500);
        miQueue.add(600);
        System.out.println(miQueue.peek());//el primero en llegar 
        System.out.println(miQueue);
        System.out.println(miQueue.poll());
        System.out.println(miQueue);
        
        System.out.println("");
        System.out.println("STACK");
        Stack<Integer> miStack = new Stack();
        miStack.push(100);
        miStack.push(200);
        miStack.push(300);
        miStack.push(400);
        miStack.push(500);
        System.out.println("CIMA: "+miStack.peek());
        System.out.println(miStack);
        System.out.println("CIMA: "+miStack.pop());
        System.out.println(miStack);
        
        //conjuntos
        //set
        System.out.println("");
        HashSet<String> conjunto = new HashSet();
        conjunto.add("ROJO");
        conjunto.add("AZUL");
        conjunto.add("VERDE");
        conjunto.add("NARANJA");
        conjunto.add("ROJO");
        conjunto.add("AMARILLO");
        System.out.println(conjunto);
        
        System.out.println("");
        //mapas (maps)-->huarda pares de valores
        Map<String,Integer> miMapa = new HashMap();
        miMapa.put("LUNES", 1);
        miMapa.put("MARTES", 2);
        miMapa.put("MIERCOLES", 3);
        miMapa.put("JUEVES", 4);
        miMapa.put("VIERNES", 5);
        miMapa.put("SABADO", 6);
        miMapa.put("DOMINGO", 7);
        System.out.println(miMapa);
        System.out.println(miMapa.get("LUNES"));
        
        
    }
    
}
