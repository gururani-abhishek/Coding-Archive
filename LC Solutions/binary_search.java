import java.util.Scanner;

public class binary_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[14];
        for (int idx = 0; idx < 14; idx++) {
            nums[idx] = idx+1;
        }
        int len = nums.length;
        int left = 0, right = len - 1;
        int target = 13;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                System.out.println("the target is at index : " + mid);
                break;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else { // nums[mid] < target
                left = mid + 1;
            }
        }

    }
}
