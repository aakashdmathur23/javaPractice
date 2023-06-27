import java.util.HashSet;

public class noRepeatedSubsequences {

        public static void subsequences(String str, int idx, String newString, HashSet<String> set) {
    
            if(idx == str.length()){
                if(set.contains(newString)){
                    return;
                }else{
                    System.out.println(newString);
                    set.add(newString);
                    return;
                }
            }
    
    
            char currChar = str.charAt(idx);
            
            //to be included
    
            subsequences(str, idx+1, newString+currChar, set);
    
            //not to be included
    
            subsequences(str, idx+1, newString, set);
            
        }
        
        public static void main(String args[]) {
    
            String str = "aaa";
            HashSet<String> set = new HashSet <>();
            subsequences(str, 0, "", set);
            
        }
}
