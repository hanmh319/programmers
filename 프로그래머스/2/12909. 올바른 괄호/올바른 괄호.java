class Solution {
    boolean solution(String s) {
        boolean answer = false;

//         '(' 가 제시되면 count를 +1, ')'가 제시되면 count를 -1
//          '단, +1 상태에서 -1만 가능' 끝날 때 0이 아니면 boolean = false
        int count = 0;
        String[] forAnswer = s.split("");
        for(int i=0; i<forAnswer.length; i++){
            if(forAnswer[i].equals(")")){
                if(count != 0){
                    count--;
                }
                else if(count ==0 ){
                    return false;
                }
            }
            else{
                count++;
            }
        }
        if(count ==0){
            answer = true;
        }
        return answer;
    }
}