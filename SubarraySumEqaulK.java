
package Array_dsa;

import java.util.*;

public class SubarraySumEqaulK {
    // Function jo count karega total subarrays jin ka sum 'k' ke barabar hai.

    public static int subsum(int nums[], int k) {
        Map<Integer, Integer> cnt = new HashMap<>(); // Ek HashMap jo prefix sum ka count store karega.
        cnt.put(0, 1); // Base case: Jab sum 0 ho, ek baar default count hona chahiye.

        int ans = 0, s = 0; // 'ans' subarrays ka count store karega, 's' current prefix sum hai.

        for (int x : nums) { // Array ke har element ke liye loop chalayenge.
            s += x; // Prefix sum update karenge.

            // Agar (s - k) pehle aa chuka hai, iska matlab ek valid subarray mila hai.
            ans += cnt.getOrDefault(s - k, 0);

            // Current prefix sum ka count HashMap me update karna hai.
            cnt.merge(s, 1, Integer::sum);
        }
        return ans; // Total valid subarrays return karenge.
    }

    public static void main(String[] args) {
        SubarraySumEqaulK obj = new SubarraySumEqaulK();
        int[] nums = {1, 2, 3, 1, 2}; // Input array
        int k = 3; // Target sum

        int result = obj.subsum(nums, k); // Function call kiya
        System.out.println("Total subarrays with sum " + k + " = " + result); // Output print kiya.
    }
}
