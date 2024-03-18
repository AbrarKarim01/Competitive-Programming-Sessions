package LeetCode;

public class SearchInsertPosition_Easy {
    public int searchInsert(int[] nums, int target) {
    	int positionFound = 0;
    	for (int i = 0; i < nums.length; i++) {
    		if (nums[i] > target || nums[i] == target) {
    			 positionFound = i;
    			 break;
    		}
    	}
    	return positionFound;
    }
}
