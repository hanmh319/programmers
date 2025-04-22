class Solution {
    public String solution(String s) {
        String answer = "";
        String[] answers = s.split(" ");
        int[] forAnswer = new int[answers.length];
        for(int i=0; i<answers.length; i++){
             System.out.println(answers[i]);
        }
       
        
        for(int i = 0; i<forAnswer.length; i++){
            forAnswer[i] = Integer.parseInt(answers[i]);
        }
        int max = forAnswer[0];
        int min = forAnswer[0];
        
        for (int i=0; i<forAnswer.length; i++){
            if(max<forAnswer[i]){
                max = forAnswer[i];
            }
            if(min>forAnswer[i]){
                min = forAnswer[i];
            }
        }
        answer = "" + min + " " + max;
        return answer;
    }
}