public class Diamond {
    
    public static void main(String args[]) {

        int n=5;

        for(int i=1; i<=n; i++){
            // For Spaces 
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            //for Upper Half Stars

            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();


        }

        //Lower Half

        for(int i=n; i>=1; i--){
            // For Spaces 
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            //for Upper Half Stars

            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();


        }

}
}