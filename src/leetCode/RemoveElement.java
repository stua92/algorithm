package leetCode;

import java.util.Arrays;

public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,2,2,3};
		int val = 3;
		
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}
	
	
	public static int removeElement(int[] nums, int val) {
		int resultCount = 0;
		int count = 0;
		
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] != val) {
				nums[resultCount] = nums[i];
				resultCount++;
			} 
		}
		
		return resultCount;
    }

}
