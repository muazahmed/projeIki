/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projeiki;

/**
 *
 * @author moaaz
 */
public class Stack <T>{
    private Node<T>header;
    private int size=0;
    
    /*
    Normal
    */
    
    // push to stack
    void push (T data){
        Node <T> newNode=new Node<>(data);
        if(this.header==null){
            header=newNode;
        }
        else{
            newNode.next=header;
            header=newNode;
        }
        size++;
    }
    
    // Pop from stack
    T pop(){
        if (header==null) {
            System.out.println("list is empty ! ");
            return null;
        }
        else{
            Node<T> temp=header;
            header=header.next;
            temp.next=null;
            size--;
            return temp.getData();
        }
    }
    
    // Read from stack
    T peek(){
        if (header==null){
            System.out.println("liste booos !!!!!!");
            return null;
        }
        else
            return header.getData();
    }
    
    //Show the elemants of stack
    void printList(){
        Node <T> temp=header;
        while(temp!=null){
            System.out.print(temp.getData()+" --> ");
        }
        System.out.println("null");
    }
    
    //Return size of stack
    public int getSize() {
        return size;
    }
    
}
