class Solution {
    public String solution(String s) {
        String answer = "";
        String[] answerArr = s.split("");
        
        if(answerArr.length%2==0){
            answer+= answerArr[answerArr.length/2 -1] + answerArr[answerArr.length/2];
        }
        else{
            answer+=answerArr[answerArr.length/2];
        }
        return answer;
    }
}