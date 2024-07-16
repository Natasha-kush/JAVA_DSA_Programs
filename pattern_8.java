/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pattern_print;

/**pattern-8- diagonal star printing
 *
 * @author kushn
 */
public class pattern_8 {
      public static void main(String[]args){
     int n=5;
     for(int i=0; i<n; i++){
      for(int j=0; j<n; j++){
       if(i==j){
         System.out.print("*");
       }else{
       System.out.print(" ");
       }
      }
      System.out.println();
     }
    }
}
