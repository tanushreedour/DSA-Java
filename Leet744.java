public class Leet744 {
    //https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
    public static void main(String[] args) {
        char[] letters= {'a','c','f'};
        char target='f';
        char val= Search(letters,target);
        System.out.println(val);
    }
    static char Search(char[] letters, char target)
    {
        int start=0;
        int end= letters.length-1;
        while(start<=end)
        {
            int mid= start+(end-start)/2;
            if(target<letters[mid])
            {
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return letters[start%letters.length];

//        while(start<=end)
//        {
//            int mid= start+(end-start)/2;
//            if(target>=letters[letters.length-1])
//            {
//                return letters[0];
//            }
//            if(target>letters[mid])
//            {
//                start=mid+1;
//            }
//            else if(target<letters[mid]) {
//                end = mid - 1;
//            }
//        }
//        return letters[start];
    }
}
