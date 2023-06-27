import java.util.*;

class Solution
{ 
    public static int findSum(int A[],int N) 
    {
        Scanner sc = new Scanner(System.in);
        
        //input
        
        for(int i=0; i<=N; i++){
            A[i] = sc.nextInt();
        }
        
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        
        
        for(int i=0; i<A.length; i++){
            if (A[i]< min){
                min = A[i];
            }
            
            if (A[i]> max){
                max = A[i];
            }
            
        }
       return min+max;
    }

    public static void main(String args[]){
        System.out.println(min+max);
    }
}