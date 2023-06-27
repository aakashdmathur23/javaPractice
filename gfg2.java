import java.util.*;
public class gfg2 {
    
    class Reverse
{
    // Complete the function
    // str: input string
    public String reverseWord(String str)
    {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String b = " ";
        int ptr = a.length()-1;
        while (ptr>0){
            b = b+a.charAt(ptr);
            ptr--;
        }
        return b;
    }

    public void main(String args[]){

        reverseWord("Geeks"); 

    }
}
}
