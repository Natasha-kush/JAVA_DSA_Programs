/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recursion;

/**
 *
 * @author kushn
 */
public class Binary_Search_recursion {

    public static void main(String[] args) {
        int arr[] = {1, 8, 9, 10, 12, 15, 18, 55};
        int target = 10;
        System.out.println(search(arr, target, 0, arr.length - 1));
    }

    static int search(int[] arr, int target, int s, int e) {
        //base condition
        if (s > e) {
            return -1;
        }
        int m = s + (e - s) / 2;
        if (arr[m] == target) {
            return m;
        }
        if (target > arr[m]) {
            return search(arr, target, s + 1, m);
        }

        return search(arr, target, s, m - 1);

    }
}
