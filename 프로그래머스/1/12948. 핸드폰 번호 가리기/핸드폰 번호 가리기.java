class Solution {
    public String solution(String answer) {
        String[] answerArr = answer.split("");
        for(int i=0; i<answerArr.length-4; i++){
            answerArr[i] = "*";
        }
        for(int i=0; i<answerArr.length; i++){
            System.out.print(answerArr[i]);
        }
        answer = String.join("", answerArr);
        return answer;
    }
}