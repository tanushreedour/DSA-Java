//https://leetcode.com/problems/richest-customer-wealth/
public class RichestCustomerWealth
{
    public static void main(String[] args) {
        int[][] accounts={{1,2,3},{3,2,1}};
        int wealth = maximumWealth(accounts);
        System.out.println(wealth);
    }
    static int maximumWealth(int[][] accounts) {
        int[] rowSums = new int[accounts.length];
        for(int i=0;i<accounts.length;i++)
        {
            int sum=0;
            for(int j=0;j<accounts[i].length;j++)
            {
                sum = sum + accounts[i][j];
            }
            rowSums[i]= sum;
        }
        int max= rowSums[0];
        for(int i=0;i<rowSums.length;i++)
        {
            if(rowSums[i]>max)
            {
                max= rowSums[i];
            }
        }
        return max;
    }
}
