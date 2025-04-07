/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_5_queue;

import java.nio.file.Files;

public class MyQueue {

    private Nodo inicio;
    private Nodo previo;
    private Nodo fin;

    public MyQueue() {
        inicio = null;//significa que no hay nodos en la lista
        previo = null;
        fin = null;
    }

    public void add(int valor) {
        //crear un nodo con ese valor
        Nodo nuevo = new Nodo(valor);
        if (inicio == null) {
            inicio = nuevo;//nuevo nodo si la lista esta vacia 
            fin = nuevo;
        } else {
            //movernos hasta el ultimo nodo si la lista no esta vacia
            //conectamos

            fin.setSiguiente(nuevo);
            nuevo.setPrevio(fin);
            //movemos fin al nuevo nodo
            fin = nuevo;
        }
    }

    public void PrintList() {
        Nodo temp = inicio;
        //O(n)
        while (temp != null) {
            System.out.print("[" + temp.getValor() + "]"); //TEMP BRINCA DE OBJETO 1 AL SIGUEINTE OBJETO
            temp = temp.getSiguiente();
        }
        System.out.println("");
    }

    public void PrintListInverso() {
        Nodo temp = fin;
        //O(n)
        while (temp != null) {
            System.out.print("[" + temp.getValor() + "]"); //TEMP BRINCA DE OBJETO 1 AL SIGUEINTE OBJETO
            temp = temp.getPrevio();
        }
        System.out.println("");
    }

    public int size() {
        int cont = 0;
        Nodo temp = inicio;
//        cont++;
        while (temp != null) {
            cont++;
            temp = temp.getSiguiente();
        }
        return cont;
    }

    public boolean isEmpty() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    public void clear() {//0(1)
        inicio = null;
        fin = null;
    }

    public void insertAt(int valor, int posicion) throws Exception {
        if (inicio == null) {//Si la lista esta vacia 
            throw new Exception("La lista está vacía");
        }// Lanzamos una excepcion porque no se puede insertar en una posición dentro de una lista que no tiene nodos.
        if (posicion < 0 || posicion > size()) { //La posicion no debe ser negativa y no puede ser mayor al tamaño de la lista
            throw new Exception("La posición " + posicion + " no es válida, tiene que estar entre 0 y " + size());
        }

        Nodo nuevo = new Nodo(valor);//Creamos un nuevo nodo con el valor que vamos a insertar
        //Insertar en la primera posicion 0
        if (posicion == 0) { // Si la posicion es 0 estamos insertando al inicio
            nuevo.setSiguiente(inicio);//Hacemos que el nuevo nodo apunte al actual inicio con setSiguiente(inicio)
            if (inicio != null) { //Si la lista no esta vacia, apuntaremos a el puntero previo, es decir el antiguo inicio
                inicio.setPrevio(nuevo);//Para que apunte al nuevo nodo
            }
            inicio = nuevo;//Actualizamos inicio para que sea el nuevo nodo
            if (fin == null) { // Si la lista estaba vacía, fin también debe actualizarse
                fin = nuevo;
            }
            return;
        }
        Nodo temp = inicio; //temp empieza en inicio y avanzamos con un contador (cont)
        int cont = 0;

        while (cont < posicion - 1) { //Avanzamos hasta el nodo antes de la posicion deseada
            temp = temp.getSiguiente();
            cont++;
        }
        //Conectamos el nuevo nodo
        nuevo.setSiguiente(temp.getSiguiente());//El nuevo nodo apunta al nodo que antes ocupaba esta posicion
        nuevo.setPrevio(temp);//Hacemos que el nuevo nodo apunte como previo al nodo anterior (temp).

        if (temp.getSiguiente() != null) { //si no insertamos al final
            temp.getSiguiente().setPrevio(nuevo);
        } else {
            fin = nuevo;// Si insertamos al final, actualizamos fin
        }

        temp.setSiguiente(nuevo); //hacemos que el nodo anterior (temp) apunte al nuevo nodo.
    }

    public void eliminar(int posicion) throws Exception {
        if (inicio == null || posicion < 0 || posicion >= size()) {
            throw new Exception("Posición inválida o lista vacía.");//Verifica si la lista está vacía o si la posición es inválida
        }
        if (posicion == 0) { // Caso especial: eliminar el primer nodo
            inicio = inicio.getSiguiente(); // Mueve inicio al siguiente nodo
            if (inicio != null) {
                inicio.setPrevio(null); // Desconecta el nodo eliminado
            } else {
                fin = null; // Si la lista queda vacía, actualiza fin
            }
            return;
        }

        Nodo temp = inicio;
        for (int i = 0; i < posicion - 1; i++) { // Nos movemos hasta el nodo anterior al que queremos eliminar
            temp = temp.getSiguiente();
        }

        Nodo nodoAEliminar = temp.getSiguiente(); // Nodo que vamos a eliminar
        temp.setSiguiente(nodoAEliminar.getSiguiente()); // Saltamos el nodo a eliminar

        if (nodoAEliminar.getSiguiente() != null) { // Si no estamos eliminando el último nodo
            nodoAEliminar.getSiguiente().setPrevio(temp); // Actualizamos el puntero previo
        } else {
            fin = temp; // Si eliminamos el último nodo, actualizamos fin
        }
    }

    //
    public int findKth(int posicion) throws Exception {
        if (inicio == null) {//lo primero es verificar si la lista tiene nodos(no puede regresar un valor que no existe)
            throw new Exception("La lista esta vacia");
        }
        int tama = size();
        if (posicion < 0 || posicion >= tama) {
            throw new Exception("La posicion " + posicion + " no es valida, tiene que estar entre 0 y " + (tama - 1));//Lanza una excepcion de que la posicion no es valida
        }
        Nodo temp = inicio;
        for (int i = 0; i < posicion; i++) {// se recorre la lista hasta llegar a la posición ingresada
            temp = temp.getSiguiente();
        }
        System.out.println("El valor en la posicion " + posicion + " es: " + temp.getValor());

//                Nodo temp2 = fin;
//                for (int i = 0; i <posicion; i++) {
//                    temp2 = temp2.getPrevio();
//                }
//                System.out.println("el valor en la posicion "+posicion+" inversamente es: "+temp2.getValor());
        return temp.getValor();// devuelve el valor del nodo 
    }

    //agrega un nodo a la cola QUEUE
    public void push(int valor) {
        add(valor);
    }

    //POP: recupera un valor de la estructura QUEUE
//    elimina el primer nodo
    public int pop() throws Exception {
        int valor = findKth(0);
        eliminar(0);
        return valor;
    }

    //PEEK: recupera un valor de la estructura
    public int peek() throws Exception {
        int valor = findKth(0);
        return valor;
    }

}
