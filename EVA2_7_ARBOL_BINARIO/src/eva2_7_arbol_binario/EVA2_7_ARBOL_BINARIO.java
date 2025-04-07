/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_7_arbol_binario;

/**
 *
 * @author usuario
 */
public class EVA2_7_ARBOL_BINARIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArbolB arbolB = new ArbolB();
        arbolB.add(13);//0
        arbolB.add(10);//1
        arbolB.add(18);//2
        arbolB.add(2);//3
        arbolB.add(11);//4
        arbolB.add(17);
        arbolB.add(20);
        arbolB.add(16);
        System.out.println("LISTA INORDER");
        arbolB.inorder();
        System.out.println("LISTA POSTORDER");
        arbolB.postorder();
        System.out.println("LISTA PREORDER");
        arbolB.preorder();
    }
    
}
