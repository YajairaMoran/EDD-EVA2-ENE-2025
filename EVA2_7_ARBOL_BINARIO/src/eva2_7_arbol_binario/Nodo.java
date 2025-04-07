/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_7_arbol_binario;

/**
 *
 * @author usuario
 */
public class Nodo {
    private int valor;
    private Nodo derecha;
    private Nodo izquierda;
    
    
    public Nodo() {
        derecha = null;
        izquierda = null;
    }
//    public Nodo(Nodo previo) {
//        previo = null;
//    }
        
    public Nodo(int valor) {
        this.valor = valor;
        derecha = null;
        izquierda = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }
    
    
}
