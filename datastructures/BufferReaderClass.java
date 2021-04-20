/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datastructures;

import java.io.*;
import java.util.*;
/**
 *
 * @author sahil
 */
public class BufferReaderClass {
    public static void main(String[] args) throws IOException {
       
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int c=br.read();
        System.out.println((char)c);
       String[] s=br.readLine().trim().split(" ");
       String e=s[1];
       
           System.out.println(Integer.parseInt(e));
           System.out.println(Float.parseFloat(e));
           System.out.println(Long.parseLong(e));
           
           
       
        
    }
}
