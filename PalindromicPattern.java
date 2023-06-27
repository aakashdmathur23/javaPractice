public class PalindromicPattern {
    
    public static void main(String args[]) {

        int n=9;

        for(int i=1; i<=n; i++) {

            //for Spaces

            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            //for Part 1
            for(int j=i; j>=1; j--) {
                System.out.print(j);
            }

            //for Part 2

            for(int j=2; j<=i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
}
}
