import java.util.Arrays;
import java.util.stream.IntStream;

// https://leetcode.com/problems/median-of-two-sorted-arrays/
// LeetCode ques-4
public class ArrayMedian {
    public static void main(String[] args) {
        int[] nums1 = {1,3};
        int[] nums2 = {2};
        double median =  findMedianSortedArrays(nums1, nums2);
        System.out.println(median);
        //findMedianSortedArrays(nums1, nums2);
    }
    static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] result = IntStream.concat(Arrays.stream(nums1),Arrays.stream(nums2)).toArray();
        Arrays.sort(result);
        //System.out.println(Arrays.toString(result));
        Arrays.toString(result);
        //System.out.println(result[2]);
        if(result.length==0)
        {
            return -1;
        }
        else if(result.length%2!=0)
        {
            return result[(result.length-1)/2];
        }
        else {
            int index = result.length/2;
            return (double) (result[index] + result[index - 1]) /2;
        }
    }
}
