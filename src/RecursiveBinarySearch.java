import java.util.Arrays;

public class RecursiveBinarySearch {


    public static int search(int[] nums, int target) {
        int bottomIndex = 0;
        int topIndex = nums.length - 1;

        int middleIndex = (bottomIndex + topIndex)/2;
        if (topIndex < 0) return -1;
        else if (target == nums[middleIndex]) return middleIndex;
        else if (bottomIndex >= topIndex) return -1;
        else if (target < nums[middleIndex] ) return search(Arrays.copyOfRange(nums, 0, middleIndex ), target );
        else {
            int result = search(Arrays.copyOfRange(nums, middleIndex + 1, topIndex + 1), target);
            if (result == -1) return result;
            else return middleIndex + 1 + search(Arrays.copyOfRange(nums, middleIndex + 1, topIndex + 1), target);

        }
    }

    public static void main (String [ ] args) {
        int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
        // int[] nums = new int[]{2, 5};
        int target = 9;

        int result = search(nums, target);

        System.out.println(result);


    }
}
