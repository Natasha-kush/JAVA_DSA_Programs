/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pattern_print;

/**pattern -9 printing X
 *
 * @author kushn
 */
public class pattern_9 {
   public static void main(String[]args){
     int n=10;
     for(int i=0; i<n; i++){
      for(int j=0; j<n; j++){
       if(i==j||i+j==n-1){
         System.out.print("*");
       }else{
       System.out.print(" ");
       }
      }
      System.out.println();
     }
    }  
}
