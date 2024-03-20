package LeetCode;
// Not Completed 
public class SearchInsertPosition_Easy {
    public int searchInsert(int[] nums, int target) {
    	int positionFound = 0;
    	if (target > nums[nums.length-1]) {
    		 positionFound = nums.length;
    	 }else {
    	
    	for (int i = 0; i < nums.length; i++) {
    		if (nums[i] > target || nums[i] == target) {
    			 positionFound = i;
    		}
    	}
    }

    	return positionFound;
    }
}
