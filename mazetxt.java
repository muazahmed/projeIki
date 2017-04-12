/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projeiki;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author moaaz
 */
public class mazetxt {
    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("D:\\fsm\\bahar 2016-2017\\Veri yapıları\\dictionary.txt");
        BufferedReader br = new BufferedReader(file);
        Scanner sc = new Scanner(br);
        int data ; 
        while (sc.hasNextLine()) {
            data = sc.nextInt();
        }
        file.close();
        br.close();
        sc.close();
    }
}
