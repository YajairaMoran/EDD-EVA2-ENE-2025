/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_5_queue;

/**
 *
 * @author usuario
 */
public class EVA2_5_QUEUE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyQueue queue= new MyQueue();
        System.out.println("lista original:");
        queue.add(100);//0
        queue.add(200);//1
        queue.add(300);//2
        queue.add(400);//3
        queue.add(500);//4
        
        try{
            while(queue.size()>1){
            System.out.println("STACK: "+queue.pop());
            queue.PrintList();
            }
//            System.out.println("Peek: "+queue.pop());
        }catch(Exception e){
                e.printStackTrace();
            }
        queue.PrintList();
        
        
        
        
        
    }
    
}
