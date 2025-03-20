import java.util.Arrays;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Arrays.sort(participant);
        Arrays.sort(completion);
        
//         for(int i=0; i<participant.length; i++){
//             System.out.print(participant[i] + " ");
//         }
//         System.out.println();
        
//         for(int i=0; i<completion.length; i++){
//             System.out.print(completion[i] + " ");
//         }
        // 1명일때를 왜 쳐 만들어 놓은거야
        if(participant.length==1){
            answer = participant[0];
            return answer;
        }
        
        for(int i=0; i<participant.length; i++){
            
            if(!participant[i].equals(completion[i])){
                answer = participant[i];
                break;
            }
            if(i==participant.length-2){
                answer = participant[i+1];
                break;
            }
        }
        
        // for(int i=0; i<participant.length; i++){
        //     if(!participant[i].equals("")){
        //         answer = participant[i];
        //         break;
        //     }
        // }
        
        return answer;
    }
}