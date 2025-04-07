
package eva2_3_linked_list;

import eva2_3_linked_list.Nodo;

public class Lista {
    private Nodo inicio;
    private Nodo fin;
    
    public Lista(){
        inicio = null;//significa que no hay nodos en la lista
        fin=null;
    }
////ingresar un nodo al final de la lista///////////////////////////////////////
    public void add(int valor){
        //crear un nodo con ese valor
        Nodo nuevo = new Nodo(valor);
        if (inicio == null) {
            inicio = nuevo;//nuevo nodo si la lista esta vacia 
            fin=nuevo;
        }else{
            //movernos hasta el ultimo nodo si la lista no esta vacia
//           Nodo temp = inicio;
           //O(n)
           //con la mejora, ahora es o(1)
//           while(temp.getSiguiente()!= null){
//            temp = temp.getSiguiente();
//            }
//            //temp ya se encuentra en el ultimo nodo
//            temp.setSiguiente(nuevo);//añadir un nodo al final de la lista
            fin.setSiguiente(nuevo);
            //movemos fin al nuevo nodo
            fin=nuevo;
        } 
    }
////imprime los valores de la lista/////////////////////////////////////////////
    public void PrintList(){
    Nodo temp = inicio;
        //O(n)
        while(temp != null){
            System.out.print("["+ temp.getValor() + "]"); //TEMP BRINCA DE OBJETO 1 AL SIGUEINTE OBJETO
            temp = temp.getSiguiente();
        } 
        System.out.println("");
    }
////determina el tamaño de la lista/////////////////////////////////////////////
    public int size(){
        int cont=0;
        Nodo temp = inicio;
//        cont++;
        while(temp != null){
            cont++;
            temp = temp.getSiguiente();
        }
        return cont;
    }
////inserta un nodo con su valor en una posicion////////////////////////////////
    public void insertAt(int valor,int posicion)throws Exception{
        //verificar el estado de la lista //verificar si la posicion es valida //0(cero-->primer nodo)
        //N-1 (cantidad de nos¿dos de la lista)
        //lo primero es verificar si la lista tiene nodos(no se puede insertar si la lista esta vacia)
        if (inicio==null)
            //lanzar una excepcion(la lista esta vacia
            throw new Exception("La lista esta vacia");
        else{//hay nodos podeos insertar nuevos nodos a la lista
//            if(posicion==0){
            if(posicion<0||posicion>=size()){
                throw new Exception("La posicion "+posicion+" no es valida, tiene que estar entre 0 y "+size());//Lanza una excepcion de que la posicion no es valida
            }else{//Todo bien:
                Nodo nuevo = new Nodo(valor);
                if (posicion==0) {
                    nuevo.setSiguiente(inicio);
                    inicio=nuevo;
                }else{
                //mover el nodo una posicion previa a la sinsercion
                    Nodo temp = inicio;
                    int cont =0;
                   while(cont<(posicion-1)){
    //               while(temp.getSiguiente()!= null){
                    cont++;
                    temp = temp.getSiguiente();
                    nuevo.setSiguiente(temp.getSiguiente());
                    }//se hace la reconexion de los nodos
    //                nuevo.setSiguiente(temp.getSiguiente());
                    temp.setSiguiente(nuevo);
                }
            }
        }
        System.out.println("se agregara un nodo en la pocision "+posicion+" con el valor "+valor);
    }
/////vaciar la lista, elmina todos los nodos////////////////////////////////////
     public void clear(){//0(1)
         inicio=null;
         fin=null;
     }
////verifica si la lista esta vacia o no////////////////////////////////////////
     //regresar si la lista no tiene nodos
     //regresa false si la lista tiene nodos
     //o(1)-->solo se ejecuta una ves la instruccion 
     public boolean isEmpty(){
         if (inicio==null) {
             return true;
         }else return false;
     }
////elimina un nodo de la lista/////////////////////////////////////////////////
    public void deleteAt(int posicion) throws Exception {
    if (inicio == null) {//lo primero es verificar si la lista tiene nodos(no se puede eliminar nada si la lista esta vacia)
        throw new Exception("La lista esta vacia");
    }
        int tama = size();
        if (posicion < 0 || posicion >= tama) {
            throw new Exception("La posicion " + posicion + " no es valida, tiene que estar entre 0 y " + (tama - 1));//Lanza una excepcion de que la posicion no es valida
        }
            if (posicion == 0) {//elimina el primer nodo
                inicio = inicio.getSiguiente();
                if (inicio == null) { //si la lista queda vacía
                    fin = null;
                }
                return;
            }
                Nodo temp = inicio;//elimina un nodo en cualquier posicion
                for (int i = 0; i < posicion - 1; i++) {
                    temp = temp.getSiguiente();
                }
                //temp apunta al nodo anterior al que se va a eliminar
                    Nodo nodoAEliminar = temp.getSiguiente();
                    temp.setSiguiente(nodoAEliminar.getSiguiente());
                
                if (nodoAEliminar == fin) {
                    fin = temp;// Si el nodo a eliminar es el último fin=temp
//                Nodo temp = inicio;
//                    for (int i = 0; i < posicion-1; i++) {
//                        temp=temp.getSiguiente();
//                       temp.setSiguiente(temp.getSiguiente().getSiguiente());
//                        if (temp.getSiguiente()==null) {
//                            fin=temp;
                    
    }
                System.out.println("el nodo a eliminar se encuentra en la posicion: "+posicion);
}
////regresa el valor de nodo////////////////////////////////////////////////////
    //debe regresar el valor almacenado en la posicion 
    public void findKth(int posicion) throws Exception {
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
        /*
        for (int i = 0; i < inicio.getValor(); i++) {
                        System.out.println(inicio.getValor());
                    }
        */
            System.out.println("el valor en la posicion "+posicion+" es: "+temp.getValor());
//        return temp.getValor();// devuelve el valor del nodo 
    }
    
    

   
}

    
