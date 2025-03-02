package String;

import java.util.*;

public class LongestCommonPrefix {
    // Function jo longest common prefix find karega

    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return ""; // Edge case: Agar array empty hai, return "".
        }
        StringBuilder result = new StringBuilder(); // Common prefix store karne ke liye ek StringBuilder banaya.

        Arrays.sort(strs); // Sorting karne se similar prefix wale words ek saath aa jate hain.

        // First and Last word ko character array me convert kar rahe hain
        char[] first = strs[0].toCharArray(); // Sorted array ka first word
        char[] last = strs[strs.length - 1].toCharArray(); // Sorted array ka last word

        // Dono words ko compare karenge character by character
        for (int i = 0; i < first.length && i < last.length; i++) { // Shortest string tak loop chalega
            if (first[i] != last[i]) { // Agar character match nahi karta
                break; // Loop ko wahi stop kar do
            }
            result.append(first[i]); // Jo match ho raha hai, usko result me append karo
        }

        return result.toString(); // Final common prefix return karo
    }

    public static void main(String[] args) {
        LongestCommonPrefix obj = new LongestCommonPrefix(); // Solution class ka object banaya

        String[] words = {"flower", "flow", "flight"}; // Input array

        System.out.println("Longest Common Prefix: " + obj.longestCommonPrefix(words)); // Output print karenge
    }

}
