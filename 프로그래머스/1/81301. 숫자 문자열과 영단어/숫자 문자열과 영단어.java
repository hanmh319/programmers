class Solution {
    public int solution(String s) {
        int answer = 0;
        // 첫번째 방법, index 값, 그리고 길이에 맞는 (글자수에 맞게) replace 하고 int로 형변환
        s = s.replaceAll("one","1");
         s = s.replaceAll("two","2");
         s = s.replaceAll("three","3");
         s = s.replaceAll("four","4");
         s = s.replaceAll("five","5");
         s = s.replaceAll("six","6");
         s = s.replaceAll("seven","7");
         s = s.replaceAll("eight","8");
         s = s.replaceAll("nine","9");
         s = s.replaceAll("zero","0");
        
        answer = Integer.parseInt(s);
        return answer;
    }
}