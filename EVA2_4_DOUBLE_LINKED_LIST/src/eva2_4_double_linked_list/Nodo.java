/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_4_double_linked_list;

/**
 *
 * @author usuario
 */
public class Nodo {
    private int valor;
    private Nodo siguiente;
    private Nodo previo;
    
    
    public Nodo(Nodo siguiente) {
        siguiente = null;
        previo = null;
    }
//    public Nodo(Nodo previo) {
//        previo = null;
//    }
        
    public Nodo(int valor) {
        this.valor = valor;
        siguiente = null;
        previo = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getPrevio() {
        return previo;
    }

    public void setPrevio(Nodo previo) {
        this.previo = previo;
    }
    
    
}
