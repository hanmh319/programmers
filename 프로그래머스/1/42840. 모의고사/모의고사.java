import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int numCount = 0;
        int forNum2 = 2;
        int[] num1 = {1,2,3,4,5};
        int[] num2 = {2,1,2,3,2,4,2,5};
        int[] num3 = {3,3,1,1,2,2,4,4,5,5};
        for(int i=0; i<answers.length; i++){
            if(answers[i]==num1[numCount++]){
                count1++;
            }
            if(numCount==(num1.length)){
                numCount = 0;
            }
        }
        numCount = 0;
        for(int i=0; i<answers.length; i++){
            if(answers[i]==num2[numCount++]){
                count2++;
            }
            if(numCount==(num2.length)){
                numCount = 0;
            }
        }
        numCount = 0;
        for(int i=0; i<answers.length; i++){
            if(answers[i]==num3[numCount++]){
                count3++;
            }
            if(numCount==(num3.length)){
                numCount = 0;
            }
        }
        System.out.println(count1 + " " + count2 + " " + count3);
        String forAnswer;
        int forAnswerNum = -1;
        int max = -1;
        if(count1 > max){
            max = count1;
            forAnswerNum = 1;
            forAnswer = "count1";
        }
        if(count2 > max){
            max = count2;
            forAnswerNum = 2;
            forAnswer = "count2";
        }
        if(count3 > max){
            max = count3;
            forAnswerNum = 3;
            forAnswer = "count3";
        }    
        ArrayList<Integer> answerList = new ArrayList<Integer>();
        answerList.add(forAnswerNum);
        
        if(max == count1 && forAnswerNum !=1){
            answerList.add(1);
        }
        if(max == count2 && forAnswerNum !=2){
            answerList.add(2);
        }
        if(max == count3 && forAnswerNum !=3){
            answerList.add(3);
        }
        int[] answer = new int[answerList.size()];
        for (int i = 0 ; i < answerList.size() ; i++){
            answer[i] = answerList.get(i).intValue();
        }
        
        
        
        return answer;
    }
}