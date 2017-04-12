/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projeiki;

import java.lang.reflect.Array;
import jdk.nashorn.internal.ir.ForNode;

/**
 *
 * @author moaaz
 */
public class Game {
    int sizeofX; //the limit of x  
    int sizeofY; //the limit of y 
    int x=0;
    int y=0;
    int labirent[][];
    Node startPoint;
    Node finishPoint;
    public Game(int x,int y) {
        this.sizeofX=x;
        this.sizeofY=y;
        // it takes values of y and x (by opposite) and craet an Array with that size
         labirent = (int[][]) Array.newInstance(int.class, sizeofY, sizeofX); 
    }

    void addDataToNetwork(int data) {// add data to the labirent
        labirent[y][x] = data; // add data to our labirent at [Y,x]
        x++; // upadate x value (make it ready for next addition)
        if (x==sizeofX) { // if x break the limit go to the first endex of the next line 
            if (y+1!=sizeofY) { // if the next line exist
                x=0; // go to first endex
                y++; // update y value
            }
        }
    }
    
    // return the data at that location
    int getDataAt(int x, int y) {
        return labirent[x][y];
    }
    
    // we will use this metod to find us the road in that way
    // we will git the startPoint and find out the node are connected with
    // every node will be added had been visited will be added to a Queue 
    // and all nodes could been visited will be added to Stack 
    // taking the top of the stack to the Queue and go to the last node it can go 
    // if it fails in some node it will be dequeued from the stack and from the Queue if it there
    // then the top of the stack will be added to Queue and all connected nodes to it will be added to stack and so on....
//    Node [] lookingForTheRoad(){
//        
//    }
}
