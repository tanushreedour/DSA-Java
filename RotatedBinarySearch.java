public class RotatedBinarySearch
{
    public static void main(String[] args) {
        int[] nums = {3,5,1};
        System.out.println(search(nums, 1));
    }
    static int search(int[] nums, int target)
    {
        int pivot= findPivot(nums);
        if(pivot == -1)
        {
            return BinarySearch(nums, target, 0, nums.length-1);
        }
        if(nums[pivot]==target)
        {
            return pivot;
        }

        if(target>=nums[0])
        {
            return BinarySearch(nums, target, 0, pivot-1);
        }
        return BinarySearch(nums, target, pivot+1, nums.length-1);
    }
    static int findPivot(int[] nums)
    {
        int start=0;
        int end= nums.length-1;
        while(start<=end)
        {
            int mid = start+(end-start)/2;
            if(mid<end && nums[mid]>nums[mid+1])
            {
                return mid;
            }
            if(mid>start && nums[mid]<nums[mid-1])
            {
                return mid-1;
            }
            if(nums[start]>=nums[mid])
            {
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1; // array is not rotated because pivot can be the first element but not the last element
    }
    static int BinarySearch(int[] nums, int target, int start, int end)
    {
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target==nums[mid])
            {
                return mid;
            }
            else if(target>nums[mid])
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return -1; // element is not present in the array
    }
}
