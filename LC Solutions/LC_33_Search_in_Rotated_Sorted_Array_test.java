public class LC_33_Search_in_Rotated_Sorted_Array_test {
    public static void main(String[] args) {
        int[] nums = new int[13];
        int x = 8;
        for(int idx = 0; idx < 6; idx++)
            nums[idx] = x++;

        x = 1;
        for(int idx = 6; idx < 13; idx++)
            nums[idx] = x++;

        int left = 0, right = nums.length - 1;
        while(left < right) {
            int mid = left + (right -left)/2;
            System.out.print("left - " + left + " " );
            System.out.print("right - " + right + " " );
            System.out.print("mid - " + mid + " " );
            System.out.println("element - " + nums[mid]);

            if(nums[mid] > nums[right]) left = mid + 1;
            else right = mid;
        }

    }
}
