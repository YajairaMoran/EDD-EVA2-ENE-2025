
package eva2_3_linked_list;

/*
 */
public class EVA2_3_LINKED_LIST {

    public static void main(String[] args) {
        /*int datos[] = new int[1000000];
        long inicio = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            datos[i]=(int)(Math.random()*1000);
        }
        long fin = System.nanoTime();
        long tiempo=fin-inicio;
        System.out.println("Tiempo arreglo: "+tiempo);
        
        //o(n2)
        Lista lista=new Lista();
        inicio = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            lista.add((int)(Math.random()*1000));
        }
        fin = System.nanoTime();
        tiempo=fin-inicio;
        System.out.println("Tiempo arreglo: "+tiempo);
//        lista.add(100);
//        lista.add(200);
//        lista.add(300);
//        lista.add(400);
//        lista.add(500);
//        lista.PrintList();
        
        System.out.println("Tamaño de la lista: " +lista.size());*/
        Lista lista = new Lista();
        System.out.println("lista original:");
        lista.add(100);//0
        lista.add(200);//1
        lista.add(300);//2
        lista.add(400);//3
        lista.add(500);//4
        lista.PrintList();
        System.out.println("cantidad de nodos: "+lista.size());
        System.out.println("");
        
        System.out.println("lista despues de agregar un nodo");
            try{//agrega un nodo
            lista.insertAt(350, 3);
            }catch(Exception e){
                e.printStackTrace();
            }
           lista.PrintList();//imprime la lista
           System.out.println("cantidad de nodos: "+lista.size());
//           lista.clear();
//           lista.PrintList();
//           System.out.println("cantidad de nodos: "+lista.size());
           System.out.println("");
           System.out.println("la lista esta vacia: "+lista.isEmpty());

           System.out.println("");
           System.out.println("lista despues de eliminar un nodo");
           try{//elimina un nodo
            lista.deleteAt(1);
            }catch(Exception e){
                e.printStackTrace();
            }
           lista.PrintList();
           System.out.println("cantidad de nodos: "+lista.size());
           
           System.out.println("");
           try{//elimina un nodo
            lista.findKth(4);
            }catch(Exception e){
                e.printStackTrace();
            }
    }
    
}
