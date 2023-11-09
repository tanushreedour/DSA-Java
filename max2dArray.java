public class max2dArray {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{2,4,5},{6,8}};
        int max = max(arr);
        System.out.println(max);
    }
    static int max(int[][] arr)
    {
        int max= Integer.MIN_VALUE;
        if(arr.length==0)
            System.out.println("Array not exist");
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                }
            }
        }
        return max;
    }
}
