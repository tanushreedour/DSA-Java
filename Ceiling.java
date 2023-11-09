public class Ceiling
{
    public static void main(String[] args) {
        int[] arr= {2,4,12,34,45,56,67,78,89,99};
        int target=36;
        int ceil= Ceil(arr,target);
        System.out.println(ceil);
    }
    static int Ceil(int[] arr, int target)
    {
        int start=0;
        int end= arr.length-1;
//        int ceil=0;
//        while(start<=end)
//        {
//            int mid = start+(end-start)/2;
//            if(target<=arr[mid])
//            {
//                end=mid-1;
//                ceil=arr[mid];
//            }
//            else {
//                start=mid+1;
//            }
//        }
//        return ceil;

        //same code of binary search, the only change here is I am returning the element of index >=target element
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target>arr[arr.length-1])
            {
                return -1;
            }
            if(target>arr[mid])
            {
                start=mid+1;
            }
            else if(target<arr[mid])
            {
                end=mid-1;
            }
            else {
                return mid;
            }
        }
        return arr[start];
    }
}
