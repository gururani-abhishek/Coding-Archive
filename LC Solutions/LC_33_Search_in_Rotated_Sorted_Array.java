public class LC_33_Search_in_Rotated_Sorted_Array {
        public int search(int[] nums, int target) {
            int len = nums.length; // good to have len variable

            // we need to find the minimum element in the array, so that later on
            // we can apply Binary Search to find the target
            // this way we can keep the complexity of our solution as T(logN)

            // dataset increases monotonically, let's apply Binary Search
            // to find the minimum element(which is also boundary element)
            int left = 0, right = len - 1;
            // answer will lie between [left --- right]
            // keep on slicing the date till left and right become one.
            while(left < right) {
                // calculate mid
                int mid = left + (right - left)/ 2;

                // eg : nums[mid] = 4, and nums[right] = 1  => [2, 3, 4, 0, 1]
                // answer will lie to the right side of 4, excluding 4
                if(nums[mid] > nums[right]) {
                    left = mid + 1;
                } else { // nums[midx] <= nums[right]
                    // eg : nums[mid] = 1, and nums[right] = 4 => [5, 6, 7, 1, 2, 3, 4]
                    // answer will lie to the right side, and can include 1 as well,
                    right = mid; // as per above understanding mid is also included
                }
            }

            // by the end of this left == right == minimum boundary element,
            int initialElement = left;
            // now I have to cleverly apply binary search,
            left = 0; right = len - 1;

            // traditional binary search where left == right == target but we need to check
            // hence while(left <= right)
            while(left <= right) {
                int mid = left + (right - left) / 2;
                // mid is something I add to the initial element
                // I'll add mid to initialElement but it'll go beyond the array bounds
                // to sort it out, i'll use modulus( % len)
                int trueMid = (mid + initialElement) % len;

                if(nums[trueMid] > target) right = mid -1;
                else if(nums[trueMid] < target) left = mid + 1;
                else return trueMid;
            }

            return -1;
        }
}
