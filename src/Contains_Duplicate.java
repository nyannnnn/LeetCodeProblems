class Contains_Duplicate {
    public boolean containsDuplicate(int[] nums) {
    	
    	//creates a hashset to store all nums values
        HashSet<Integer> set = new HashSet<Integer>();
		
        //using .contains to see if there are any duplicates
		for(int i = 0; i < nums.length; i++) {
			
			//if there is then return true
			if(set.contains(nums[i])) {
				return true;
			}
			
			set.add(nums[i]);
			
		}
		
		//if no duplicates were found then return false
		return false;
    }
}