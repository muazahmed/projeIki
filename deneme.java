/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projeiki;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author moaaz
 */
public class deneme {
  
    public static void main(String[] args) throws IOException {
        Game g1 = new Game(4, 3); // set the (x,y)
        FileReader file = new FileReader("D:\\fsm\\bahar 2016-2017\\Veri yapıları\\deneme.txt");
        BufferedReader br = new BufferedReader(file);
        Scanner sc = new Scanner(br);

        while (sc.hasNextInt()) {
            int g=sc.nextInt();
            g1.addDataToNetwork(g);
        }
        for (int i = 0; i < g1.sizeofY; i++) {
            for (int j = 0; j < g1.sizeofX ; j++) {
                System.out.print(" [" + i + "," + j + "] --> " + g1.getDataAt(i, j));
            }
            System.out.println("");
        }
        file.close();
        br.close();
        sc.close();
    }
}
