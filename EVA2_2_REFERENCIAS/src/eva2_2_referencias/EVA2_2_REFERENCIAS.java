/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_referencias;

/**
 *
 * @author usuario
 */
public class EVA2_2_REFERENCIAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Ejemplo obj1 = new Ejemplo();
        obj1.valor = 100; //MI OBJETO 1 VALE 100
        obj1.siguiente= new Ejemplo();
        obj1.siguiente.valor = 200; //EL VALOR QUE SIGUE
        obj1.siguiente.siguiente= new Ejemplo();
        obj1.siguiente.siguiente.valor= 300; //EL VALOR QUE SIGUE
        obj1.siguiente.siguiente.siguiente = null;//SE DETIENE CUANDO EL ULTIMO OBJETO YA NO TIENE UN OBJETO ADELANTE
        
        Ejemplo temp = obj1;
        while(temp != null){
            System.out.print("["+ temp.valor + "]"); //TEMP BRINCA DE OBJETO 1 AL SIGUEINTE OBJETO
            temp = temp.siguiente;
        
        }
    }
    
}
class Ejemplo{
    int valor;
    Ejemplo siguiente;
}
    

