/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array_dsa;

public class Buy_sell_stock_ii_leet {

    public static int makeprofit(int[] prices) {  // Method jo ek integer array 'prices' leta hai
        int profit = 0;  // Total profit track karne ke liye ek variable initialize kiya

        // Loop start karte hain 1 se kyunki hum previous day ke price se compare karenge
        for (int i = 1; i < prices.length; i++) {
            // Agar current day ka price previous day se zyada hai, to profit add karenge
            if (prices[i] > prices[i - 1]) {
                profit += (prices[i] - prices[i - 1]);  // Price difference ko profit me add kar diya
            }
        }
        return profit;  // Final profit return karenge
    }

    public static void main(String[] args) {
        int arr[] = {7, 1, 5, 3, 6, 4};
        System.out.println(makeprofit(arr));
    }
}
