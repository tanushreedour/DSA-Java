public class RBS2_Min
{
    // https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/
    // LeetCode- 154
    // Find minimum in rotated sorted array2
    // This array will contain duplicate elements also

    public static void main(String[] args) {
        int[] nums = {10,1,10,10,10};
        System.out.println(findMin(nums));
    }
    static int findMin(int[] nums)
    {
        int start=0;
        int end=nums.length-1;

        while(start<end)
        {
            int mid=start+(end-start)/2;
            // check whether the first part is linearly increasing or not
            if(nums[mid]>nums[end])
            {
                start=mid+1;
            }
            else {
                if(nums[mid]<nums[end])
                {
                    end=mid;
                }
                else {
                    end--;
                }
            }
        }
        return nums[end];
    }
}
