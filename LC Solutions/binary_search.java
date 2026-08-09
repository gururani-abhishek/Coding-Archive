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
            System.out.println("mid element is : " + nums[mid] + " cut at " + (mid+1));
            sc.nextLine();
            if (nums[mid] == target) {
                break;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else { // nums[mid] < target
                left = mid + 1;
            }
        }

        System.out.println("not found");
    }
}
