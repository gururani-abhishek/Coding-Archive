public class binary_search {
    public static void main(String[] args) {
        int[] nums = new int[6];
        for (int idx = 1; idx < 6; idx++) {
            nums[idx] = idx * 2;
        }
        int len = nums.length;
        int left = 0, right = len - 1;
        int target = 3;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                System.out.println(mid);
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
