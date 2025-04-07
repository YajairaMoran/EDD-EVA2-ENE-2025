/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_7_arbol_binario;

public class ArbolB {
    private Nodo root;

    public ArbolB() {
        root=null;//arbol vacio
    }
    
    //ADD NODO (recursivas)
    //BIG(O)=logN
    public void add (int valor){
        //Hay nodos
        //No hay nodos
        Nodo nuevo =new Nodo(valor);
        if (root==null) {
            root=nuevo;
        }else{
            addRecu(valor, root);
        }
        
    }
    
    private void addRecu(int valor, Nodo actual){
        if (valor < actual.getValor()) {//va a la izquierda
            if (actual.getIzquierda()==null) {//izq.vacia(disponible)
                actual.setIzquierda(new Nodo(valor));//
            }else{
                addRecu(valor, actual.getIzquierda());
            }
        }else if (valor > actual.getValor()) {//va a la derecha
            if (actual.getDerecha()==null) {//Der.vacia(disponible)
                actual.setDerecha(new Nodo(valor));//
            }else{
                addRecu(valor, actual.getDerecha());
            }
        }
    }
    
    //BIG(O)=N
    public void inorder(){
        inorderRec(root);
        System.out.println("");
    }
    public void inorderRec(Nodo actual){
        if (actual!=null) {
            //recorre todo el lado izquierdo
            inorderRec(actual.getIzquierda());
            
            System.out.print("[ " +actual.getValor()+" ]");
            //recorre todo el lado derecho
            inorderRec(actual.getDerecha());
        }
    }
    
    public void postorder(){
        postorderRec(root);
        System.out.println("");
    }
    public void postorderRec(Nodo actual){
        if (actual!=null) {
            //recorre todo el lado izquierdo
            postorderRec(actual.getIzquierda());
            postorderRec(actual.getDerecha());
            System.out.print("[ " +actual.getValor()+" ]");
        }
    }
    
    
    public void preorder(){
        preorderRec(root);
        System.out.println("");
    }
    public void preorderRec(Nodo actual){
        if (actual!=null) {
            System.out.print("[ " +actual.getValor()+" ]");
            preorderRec(actual.getIzquierda());
            preorderRec(actual.getDerecha());
            
        }
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
