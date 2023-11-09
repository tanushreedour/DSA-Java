public class RBS_Min
{
    // LeetCode- 153
    // https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
    // Find minimum in rotated sorted array
    public static void main(String[] args) {
        int[] nums = {5,1};
        System.out.println(findMin(nums));
    }
    static int findMin(int[] nums)
    {
        int min= nums[0];
        int start=0;
        int end=nums.length-1;
        if(nums.length==2 && nums[0]>nums[1])
        {
            return nums[1];
        }
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            // check whether the first part is linearly increasing or not
            if(nums[start]<=nums[mid])
            {
                if(nums[mid]<=min)
                {
                    min=nums[mid];
                    end=mid-1;
                }
                else {
                    start =mid+1;
                }
            }
            else if(nums[mid+1]<=nums[end]) {
                if(nums[mid]<=min)
                {
                    min=nums[mid];
                    end=mid-1;
                }
                else {
                    start =mid+1;
                }
            }
        }
        return min;
    }
}
