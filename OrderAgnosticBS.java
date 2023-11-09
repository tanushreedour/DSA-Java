public class OrderAgnosticBS
{
    public static void main(String[] args) {
        //int[] arr= {12,34,56,67,89,99};
        int[] arr= {99,89,78,56,23,12};
        int target= 56;
        int index = Search(arr,target);
        System.out.println(index);
    }
    static int Search(int[] arr, int target)
    {
        int start = 0;
        int end= arr.length-1;
        while(start<=end)
        {
            int mid = start + (end - start)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            // Checking whether the array is sorted in ascending or descending order
            boolean isAsc = arr[start]<arr[end];
            if(isAsc)
            {
                if(target < arr[mid])
                {
                    end = mid-1;
                }
                else {
                    start = mid+1;
                }
            }
            else {
                if(target<arr[mid])
                {
                    start = mid+1;
                }
                else {
                    end= mid-1;
                }
            }
        }
        return -1; // Element not found
    }
}
