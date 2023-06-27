public class Butterfly {
    
    public static void main(String args[]) {
    int n=5;

    for(int i=1; i<=n; i++) {
        //1st Part

        for(int j=1; j<=i; j++) {

            System.out.print("*");
        }

        //for spaces
        int spaces = 2 * (n-i);

        for(int j=1; j<=spaces; j++) {
            System.out.print(" ");
        }

        //for 2nd Part
        for(int j=1; j<=i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }

    //for lower half

    for(int i=n; i>=1; i--) {
        //1st Part

        for(int j=1; j<=i; j++) {

            System.out.print("*");
        }

        //for spaces
        int spaces = 2 * (n-i);

        for(int j=1; j<=spaces; j++) {
            System.out.print(" ");
        }

        //for 2nd Part
        for(int j=1; j<=i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }    
}
}
