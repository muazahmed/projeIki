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
// Node s type is integer
public class Node <T>{
    /*
    There is will be next, down, data(0 OR 1), x, y and visited 
    */
    protected Node<T> next;
    protected Node<T> previous;
    protected Node<T> down;
    protected Node<T> up;
    private  T data;
    private int x;
    private int y;
    protected boolean visited=false;

    public Node(T data) {
        this.data = data;
    }

    public Node() {
        
    }
    
      
    // will be used in stack and queue calsses
     public Node(T  data,int x,int y) {
        this.data = data;
        this.next=null;
        this.previous=null;
        this.down=null;
        this.up=null;
        this.x=x;
        this.y=y;
    }
    // set the value of Y (?,x)
    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    // set the value of Y (?,x)
    public void setY(int y) {
        this.y = y;
    }
    
    
    //return the statue of the node is visited or not 
    public boolean isVisited() {
        return visited;
    }
    
    // return the location of the node (x,y) 0.index is x and 1. is y (remember the locations start from 0)
    public int [] location(){
        int [] location=new int [2];
        location[0]=this.y;
        location[1]=this.x;
        return location;
    }
    
    // return the data of a node 
    public T getData() {
        return data;
    }
    
}
