/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pattern_print;

/** pattern-13-printing diamond;
***********
***** *****
****   ****
***     ***
**       **
*         *
**       **
***     ***
****   ****
***** *****
***********
 */
public class pattern_13 {
    public static void main(String[] args) {
        int n = 11;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i==0&& j<=(n-1)/2 || j==0&& i<=(n-1)/2 || i+j<=(n-1)/2 ||
                    i==0&&j>=(n-1)/2 || j==(n-1)&& i<=(n-1)/2 || j-i>=(n-1)/2  ||
                    j==0&& i>=(n-1)/2 || i-j>=(n-1)/2 || i==n-1&& j<=(n-1)/2||
                    j==(n-1)&&i>=(n-1)/2 || i+j>=(n-1)+(n-1)/2 || i==(n-1)&&j>=(n-1)/2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
