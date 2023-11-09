public class MountainPeak
{
    public static void main(String[] args) {
        int[] arr= {0,10,5,2};
        int peak= arr[peak(arr)];
        System.out.println(peak);
    }
    static int peak(int[] arr)
    {
        int start =0;
        int end= arr.length-1;
        while(start<end) // start and end cannot be equal because if they get equal then I get my answer
        {
            int mid= start+(end-start)/2;

            if(arr[mid]<arr[mid+1]) {  //here I'm in ascending order and I have to search in right part of the mid in order to find an element greater than mid
                start=mid+1;
            }
            else  //I am in descending part and I have to search in left part to find an element greater than the mid element
            {
                end=mid;
            }
        }
        return start; // we can return end or mid also because all are same here at the last stage as it contains only one element in the end.
    }
}
