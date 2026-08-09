public class LC_153_Find_Minimum_in_Rotated_Sorted_Array {
    public int findMin(int[] nums) {
        int len = nums.length; // good to have length stored in a variable

        // appying binary search, to find the boundary element
        int left = 0, right = len - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;

            // slicing the binary search on
            // if the mid element is greater than right => discard the left half
            // or the mid element is equal to or less than right => discard the right, but
            // the mid element can be your minimum boundary element too
            if (nums[mid] > nums[right]) left = mid + 1;
            else right = mid;
        }

        return nums[left];
    }
}
