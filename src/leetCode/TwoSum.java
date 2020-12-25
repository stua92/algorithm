package leetCode;

public class TwoSum {
	public static void main(String[] args) {
		
		int[] result;
		
		int[] nums = {2, 7, 11, 15};
		int target = 9;
		
		result = twoSum(nums, target);
		System.out.println(result[0] + result[1]);
	}
	
	public static int[] twoSum(int[] nums, int target) {
		
		for(int i = 0; i < nums.length; i++) {
			for(int j = i + 1; j < nums.length; j++) {
				if(nums[i] + nums[j] == target) {
					int[] answer = { nums[i], nums[j] };
					return answer;
				}
			}
		}
		return null;
    }
}

