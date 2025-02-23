
package Array_dsa;

public class Find_duplicate_leet {
    // Duplicate number find karne ke liye function

    public static int findDuplicate(int[] nums) {
        int slow = nums[0];  // Slow pointer ko first element par set kiya
        int fast = nums[0];  // Fast pointer ko bhi first element par set kiya

        // Pehle phase me cycle detect karne ka try karenge
        do {
            slow = nums[slow];         // Slow ek step aage badh raha hai
            fast = nums[nums[fast]];   // Fast do steps aage badh raha hai
        } while (slow != fast);        // Jab tak slow aur fast equal nahi hote, tab tak loop chalega

        // Second phase: Duplicate number find karna
        fast = nums[0];  // Fast pointer ko wapas start position par le aaye

        while (slow != fast) { // Jab tak slow aur fast ek nahi ho jaate, tab tak loop chalega
            slow = nums[slow];  // Slow ek step aage badh raha hai
            fast = nums[fast];  // Fast bhi ek step aage badh raha hai
        }

        return slow; // Jab slow == fast ho jaaye, wahi duplicate number hai
    }

    public static void main(String[] args) {
        int nums[] = {1, 3, 4, 2, 2};
        System.out.println(findDuplicate(nums));
    }
}
