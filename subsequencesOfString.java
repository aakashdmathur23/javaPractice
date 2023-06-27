public class subsequencesOfString {

    public static void subsequences(String str, int idx, String newString) {

        if(idx == str.length()){
            System.out.println(newString);
            return;
        }


        char currChar = str.charAt(idx);
        
        //to be included

        subsequences(str, idx+1, newString+currChar);

        //not to be included

        subsequences(str, idx+1, newString);
        
    }
    
    public static void main(String args[]) {

        String str = "aaa";
        subsequences(str, 0, "");
        
    }
}
