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
public class Queue <T>{
    /*
    Normal
    */
    
    private Node<T> header;
    private int size=0;

    public int getSize() {
        return size;
    }
    
    //add last
    void enqueue(T data){
        Node<T> newNode=new Node(data);
        if (this.header==null) {
            header=newNode;
        }
        else{
            Node<T> temp=header;
            while (header!=null) {                
                temp=temp.next;
            }
            temp.next=newNode;
        }
        size++;
    }
    
    // Remove first
    T dequeue(){
        if (header!=null) {
            Node<T> temp=header;
            header=header.next;
            temp.next=null;
            return temp.getData();
        }
        else{
            System.out.println("Queue is empty ! ");
            return null;
        }
    }
    
    //Show elemants
    void printList(){
        if (header==null) {
            System.out.println("Queue is empty ! ");
        }
        else{
            Node<T> temp=header;
            while (temp!=null) {                
                System.out.print(temp.getData()+" --> ");
                temp=temp.next;
            }
            System.out.println("null");
        }
    }
}
