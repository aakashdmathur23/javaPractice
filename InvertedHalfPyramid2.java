public class InvertedHalfPyramid2 {
    

    public static void main(String args[]) {

        int n=5;

        for(int i=1; i<=n; i++) {
            
            //for numbers

            for(int j=1; j<=n-i+1; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
}
}
