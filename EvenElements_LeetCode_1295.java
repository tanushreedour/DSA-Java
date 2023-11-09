//Count the number of elements in an array having even number of digits
// Example: arr=[23,1,45,6,3456,567]
// Output: 3  because 23,45 and 3456 are these 3 elements with even no. of digits
public class EvenElements_LeetCode_1295
{
    public static void main(String[] args) {
        int[] nums={437,315,322,431,686,264,442};
        int count = findNumbers(nums);
        System.out.println(count);
    }
    public static int findNumbers(int[] nums)
    {
        int cnt=0;
        for (int i = 0; i < nums.length; i++) {
            int count=0;
            int num= Math.abs(nums[i]);
            while(num>0)
            {
                num/=10;
                count++;
            }
            if(count%2==0)
            {
                cnt++;
            }
        }
        return cnt;
    }

}
