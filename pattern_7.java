/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pattern_print;

/**
 *
 * @author kushn
 */
public class pattern_7 {
     public static void main(String[]args){
     int n=5;
     for(int i=0; i<n; i++){
      for(int j=0; j<n; j++){
       if(i==0&&j<(n-1)/2 || j==0  ||i== n-1 && j<(n-1)/2 || j==(n-1)/2 && i>0 && i< n-1){
         System.out.print("*");
       }else{
       System.out.print(" ");
       }
      }
       System.out.print(" ");//for spacing //and printing d in same line
       for(int j=0; j<n; j++){
       if(i==0&&j<(n-1)/2 || j==0  ||i== n-1 && j<(n-1)/2 || j==(n-1)/2 && i>0 && i< n-1){
         System.out.print("*");
       }else{
       System.out.print(" ");
       }
      }
      System.out.println();
     }
    }
}
