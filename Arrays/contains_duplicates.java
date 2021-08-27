// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> h=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            h.add(nums[i]);
            
        }
        int n=h.size();
        if(n==nums.length)
            return false;
        else 
            return true;
        
    }
}
