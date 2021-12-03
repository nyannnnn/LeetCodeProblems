class Rotate_Array {
	
	//rotates the array by using three step strategy and the reverse method
    public void rotate(int[] nums, int k) {
        
    	//finds the point of the array to reverse
		k %= nums.length;
		//reverses the entire array
		reverse(nums, 0, nums.length-1);
		//reverses the first part of the array up to k-1
		reverse(nums, 0, k-1);
		//reverses the second part of the array from k to the end
		reverse(nums, k, nums.length-1);
		
    }
	
    //reverses the array at a given starting point and end point
	public void reverse(int [] nums, int start, int end) {
		
		int temp;
		
		//simple while loop to reverse the array
		while(start < end) {
			
			temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
			
		}
		
	}
}