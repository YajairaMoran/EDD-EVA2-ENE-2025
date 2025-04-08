/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_9_tipos_genericos;

/**
 *
 * @author usuario
 */
public class EVA2_9_TIPOS_GENERICOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //clases para tipos de datos genericos
        //int-->Integer
        //double-->Double
        //float-->
        Nodo<String> nodo = new Nodo();
        nodo.setValor("Hola Mundo!!!");
        System.out.println(nodo.getValor());
        
        Nodo<Double> nodo2 = new Nodo();
        nodo2.setValor(968.8);
        System.out.println(nodo2.getValor());
        
    }
    
}//En la T se tiene que usar solo mayusculas
class Nodo <T>{//los tipos de datos genericos no funcionasn con los tipos de datos primitivos
    private T valor;
    private Nodo siguinete;
    private Nodo previo;

    public Nodo() {
        siguinete = null;
        previo = null;
    }
    
    public Nodo(T valor) {
        this.valor = valor;
        siguinete = null;
        previo = null;
    }
    
    public Nodo getSiguinete() {
        return siguinete;
    }
    
    public void setSiguinete(Nodo siguinete) {
        this.siguinete = siguinete;
    }
    
    public Nodo getPrevio() {
        return previo;
    }
    
    public void setPrevio(Nodo previo) {
        this.previo = previo;
    }
    
    public T getValor() {
        return valor;
    }
    
    public void setValor(T valor) {
        this.valor = valor;
    }
    
    
    
}