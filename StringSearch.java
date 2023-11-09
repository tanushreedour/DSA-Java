public class StringSearch {
    public static void main(String[] args) {
        String s= "Tanushree";
        char c= 'a';
        int count = Search(s,c);
        System.out.println(count);
    }
    static int Search(String s, char c)
    {
        int count=0;
        if(s==null)
        {
            return -1;
        }
        for(int index=0;index<s.length();index++)
        {
            if(s.charAt(index)==c) {
                count++;
            }
        }
        return count;
    }
}
