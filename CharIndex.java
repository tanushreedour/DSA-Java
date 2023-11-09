//Finding the last occurence of a character in a character array.
public class CharIndex {
    public static void main(String[] args) {
        char[] arr={'a','e','r','d','t','a','e','t'};
        char target='a';
        int index = Search(arr,target);
        System.out.println(index);
    }
    static int Search(char[] arr, char target)
    {
        int last_index=-1;
        if(arr.length==0)
            return -1;
        for (int index = 0; index < arr.length; index++) {
            if(arr[index]==target) {
                last_index= index;
            }
        }
        return last_index;
    }
}