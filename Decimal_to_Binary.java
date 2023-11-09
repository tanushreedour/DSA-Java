import java.util.*;
public class Decimal_to_Binary
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number:");
        int n= sc.nextInt();
        String s= Integer.toBinaryString(n);
        char[] arr = s.toCharArray();
        System.out.println("Binary conversion:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]=='1')
            {
                count++;
            }
        }
        System.out.println("\nNumber of ones : "+count);
    }
}
