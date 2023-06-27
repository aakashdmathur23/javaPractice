public class callGuests {

    public static int callGuests(int n){

        if(n <= 1){
            return 1;
        }


        //single calling 

        int way1 = callGuests(n-1);    //bache hue guests lo call karne ka tareeka

        //In pairs (Saiparivaar)

        int way2 = callGuests(n-2) * (n-1);

        return way1 + way2 ; 
    }

    public static void main(String args []) {

        int n=4;
        System.out.println(callGuests(n));
        
    }
    
}
