import java.util.Arrays;
import java.util.Collections;
class Solution
{
    public long solution(int []A, int []B)
    {
        long answer =0;
        // int index = -1;
        // int min = -1;
        // int temp = -1;
        // for(int i=0; i<A.length; i++){
        //     index = i;
        //     min = A[i];
        //     for(int j=i; j<A.length; j++){
        //         if(min>A[j]){
        //             index = j;
        //             min = A[j];
        //         }
        //     }
        //     temp = A[i];
        //     A[i] = min;
        //     A[index] = temp;           
        // }
        // //B는 최대로
        // for(int i=0; i<B.length; i++){
        //     index = i;
        //     min = B[i];
        //     for(int j=i; j<B.length; j++){
        //         if(min<B[j]){
        //             index = j;
        //             min = B[j];
        //         }
        //     }
        //     temp = B[i];
        //     B[i] = min;
        //     B[index] = temp;           
        // }
        
        Arrays.sort(A);
        Arrays.sort(B);
        
        for(int j=0; j<B.length; j++){
            answer+=(long) (B[j]*A[A.length-1-j]);
         }
        return answer;
    }
    
}