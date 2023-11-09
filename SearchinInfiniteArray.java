public class SearchinInfiniteArray {
    public static void main(String[] args) {
        int[] arr= {2,3,5,8,10,12,14,17,18,20,23,25,31,36,42,45,56,79,98,101};
        int target= 42;
        int index= search(arr,target);
        System.out.println(index);
    }
    static int search(int[] arr, int target)
    {
        int start=0;
        int end=1;
        while(target>arr[end])
        {
            int temp= start;
            end= end + (end-(start-1))*2;
            start= temp;
        }
        return BinarySearch(arr,target,start,end);
    }
    static int BinarySearch(int[] arr, int target, int start, int end)
    {
        while(start<=end)
        {
            int mid= start+ (end-start)/2;
            if(target>arr[mid])
            {
                start= mid+1;
            }
            else if(target<arr[mid])
            {
                end=mid-1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
}
