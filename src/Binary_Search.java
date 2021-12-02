class Binary_Search {
    public int search(int[] nums, int target) {
    	
    	//initalizing starting positions 
        int left = 0;
		int right = nums.length - 1;
		
		//checking whether the target is hit or not
		while(left <= right) {
			
			int mid = (left+right)/2;
			
			//if target is smaller than nums[mid], then cut the array in half to the left
			if(target < nums[mid]) {
				right = mid-1;
			}
			//if target is bigger than nums[mid], then cut the array in half to the right
			else if(target > nums[mid]) {
				left = mid+1;
			}
			//if the target is hit, return mid (index of the target)
			else {
				return mid;
			}
			
		}
		
		//if no condition is met, return -1
		return -1;
    }
}