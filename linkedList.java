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
public class linkedList <T>{
    private Node<T>header;
    private Node<T>tail;
    private int currentX=0; // the x of temp
    private int currentY=0; // the y of temp
    private int LimitOfX; //we take the limit of x of the coordinate from the file
    private int LimitOfY; //we take the limit of y of the coordinate from the file

    public linkedList(int x,int y) {
        header = null;
        this.LimitOfX=x;
        this.LimitOfY=y;
    }
    
    // make notwork 
    void makeNetwork(int data){
        Node<T> newNode=new Node(data,currentX,currentY);
        if (header==null) { // there is no elemant in our network
            header=newNode;
        }
        else{
            Node<T>temp=header;
            while (temp.next!=null) {
                if (currentY>=this.LimitOfY) {
                    return;
                }
                if (currentX<this.LimitOfX) {
                    temp = temp.next;
                    currentX++;
                }
                else{
                    if (currentY<this.LimitOfY) {
                        currentY++;
                        currentX =0;
                    }
                    
                }
            }
            if (currentY == 0) {
                temp.next = newNode;
                newNode.previous=temp;
            }
            else{
                temp.next=newNode;
                newNode.previous=temp;
                // find a node in the location (currentX , y-1) for up 
                // find a node in the location (currentX , y+1) for down 
            }
        }
    }
    
    
    Node Find (int x,int y){
        Node<T>temp=header; // search in the line for location 
        Node<T>subTemp=temp; // temp of the first node of each line 
        while (temp != null) {
            if (currentX < LimitOfX) {
                temp = temp.next; // move to the right searching for the node
                currentX++; // update the value of x
                if (temp.getX()==x && temp.getY()==y) // node found 
                    return temp;
            } else { // the line ends
                currentY++; // go to a new line 
                currentX = 0; // go to the first node on the left
                if (subTemp.down == null) { // it is over
                    return null;
                }
                temp = subTemp.down; // the first node at the old line is our new node 
                subTemp = temp; // update subTemp
                if (temp.getX()==x && temp.getY()==y) // node found
                    return temp;
            }
        }
        return null;
    }
    void addLast(T data){
        Node<T> newNode=new Node(data,currentX,currentY);
        if (header==null) {
            header=newNode;
        }
        else{
            Node<T>temp=header;
            while (temp!=null) {                
                temp=temp.next;
            }
            temp.next=newNode;
            newNode.previous=temp;
        }
    }
}
