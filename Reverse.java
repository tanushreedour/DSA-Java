public class Reverse {
    public static void main(String[] args) {
        int x= -123;
        System.out.println(reverse(x));
    }
    static int reverse(int x) {
        int p=0;
        while(x>0)
        {
            int a=x%10;
            p = (p*10)+a;
            x=x/10;
        }
        return p;
    }
}
