public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,9,12,14,56,78};
        int target = 56;
        int index = Search(arr,target);
        System.out.println(index);
    }
    static int Search(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
             int mid = start + (end-start)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            else if(arr[mid]>target)
            {
                end= mid;
            }
            else if(arr[mid]<target) {
                start= mid+1;
            }
        }
        return -1;
    }
}
