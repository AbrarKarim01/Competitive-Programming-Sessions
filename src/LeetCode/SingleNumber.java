package LeetCode;

public class SingleNumber {
    public int singleNumber(int[] nums) {
    	int check = 0;
    	for (int i = 0; i < nums.length; i++) {

    		for (int j = nums.length - 1; j > i; j--) {
    		
    			if (nums[i] == nums[j]) {
    						break;
    			}else {
    				check = i++;
				}
    		}
    	
    	}
    	
    	return check;
    }
}
