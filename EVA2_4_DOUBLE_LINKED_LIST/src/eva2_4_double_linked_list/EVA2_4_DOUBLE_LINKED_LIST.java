/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_4_double_linked_list;

/**
 *
 * @author usuario
 */
public class EVA2_4_DOUBLE_LINKED_LIST {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaDoble lista = new ListaDoble();
        System.out.println("lista original:");
        lista.add(100);//0
        lista.add(200);//1
        lista.add(300);//2
        lista.add(400);//3
        lista.add(500);//4
        System.out.println("Lista en orden original");
        lista.PrintList();
        System.out.println("Lista en orden inverso");
        lista.PrintListInverso();
        System.out.println("cantidad de nodos: "+lista.size());
        System.out.println("");
        
        System.out.println("lista despues de agregar un nodo");
            try{//agrega un nodo
            lista.insertAt(350, 3);
            }catch(Exception e){
                e.printStackTrace();
            }
        System.out.println("Lista en orden original");
        lista.PrintList();
        System.out.println("Lista en orden inverso");
        lista.PrintListInverso();
        System.out.println("cantidad de nodos: "+lista.size());
        System.out.println("");
        
        System.out.println("la lista esta vacia: "+lista.isEmpty());
        System.out.println("");
        
        System.out.println("lista despues de eliminar un nodo");
           try{//elimina un nodo
            lista.eliminar(4);
            }catch(Exception e){
                e.printStackTrace();
            }
           System.out.println("Lista en orden original");
           lista.PrintList();
           System.out.println("Lista en orden inverso");
           lista.PrintListInverso();
           System.out.println("cantidad de nodos: "+lista.size());
           System.out.println("");
        
           try{
            lista.findKth(4);
            }catch(Exception e){
                e.printStackTrace();
            }
        
        
    }
    
}
