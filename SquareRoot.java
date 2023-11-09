public class SquareRoot
{
    public static void main(String[] args) {
        int n = 8;
        int value= sqrt(n);
        System.out.println(value);
    }
    static int sqrt(int x)
    {
        if(x==0 || x==1)
        {
            return x;
        }
        int start=1;
        int end=x;
        int ans=0;
        while(start<=end) {
            int mid = start + (end - start) / 2;
            if (mid <= x / mid) {
                start = mid + 1;
                ans = mid;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
}
