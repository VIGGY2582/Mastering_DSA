/*Hint:
Since array elements are in the range [1, n], each value can be mapped to an index.
Use the value as an index (value − 1).
Mark visited numbers by making the value at that index negative.
If you encounter an already negative value, it means the number is a duplicate.
This approach runs in O(n) time and uses O(1) extra space.*/

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        /*
         Hint:
         - Elements are in range [1, n]
         - Use index = abs(nums[i]) - 1
         - If nums[index] is negative → duplicate found
         - Else mark nums[index] as negative
        */

        for (int i = 0; i < n; i++) {
            int index = Math.abs(nums[i]) - 1;

            if (nums[index] < 0) {
                System.out.print((index + 1) + " ");
            } else {
                nums[index] = -nums[index];
            }
        }
    }
}