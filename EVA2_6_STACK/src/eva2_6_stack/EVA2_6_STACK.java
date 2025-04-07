/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_6_stack;

/**
 *
 * @author usuario
 */
public class EVA2_6_STACK {

    public static void main(String[] args) {
        MyStack stack= new MyStack();
        System.out.println("lista original:");
        stack.add(100);//0
        stack.add(200);//1
        stack.add(300);//2
        stack.add(400);//3
        stack.add(500);//4
        stack.PrintList();
        
        
        try{
            while(stack.size()>0){
            System.out.println("STACK: "+stack.pop());
            stack.PrintList();
            }
        }catch(Exception e){
                e.printStackTrace();
            }
        stack.PrintList();
    }
    
}
