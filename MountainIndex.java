public class MountainIndex
{
    public static void main(String[] args) {
        int[] arr= {1,2,4,6,4,3,2,1};
        int target = 1;
        int index= findInMountainArray(arr,target);
        System.out.println(index);
    }
    static int findInMountainArray(int[] arr, int target) {
        int peak = MountainPeak(arr);
        int firstIndex= OrderAgnosticBS(arr,target,0,peak);
        if(firstIndex!= -1)
        {
            return firstIndex;
        }
        return OrderAgnosticBS(arr, target, peak+1, arr.length-1);
    }
    static int MountainPeak(int[] arr)
    {
        int start= 0;
        int end= arr.length-1;
        while(start<end)
        {
            int mid= start+(end-start)/2;
            if(arr[mid]>arr[mid+1])
            {
                end=mid;
            }
            else
            {
                start=mid+1;
            }
        }
        return start; // we can return end or mid also ass they all pointing the only element remaining
    }
    static int OrderAgnosticBS(int[] arr, int target, int start, int end)
    {
        while(start<=end)
        {
            int mid= start+(end-start)/2;
            if(target==arr[mid])
            {
                return mid;
            }
            boolean isAsc = arr[start]<arr[end];
            if(isAsc)
            {
                if(target<arr[mid])
                {
                    end=mid-1;
                }
                else {
                    start=mid+1;
                }
            }
            else {
                if(target<arr[mid])
                {
                    start=mid+1;
                }
                else {
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}

