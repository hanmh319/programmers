class Solution {
    public String solution(String s, int n) {
        String answer = "";
        int notChar = 0;
        int notChar2 =0;
        char getChar = 0;
        for (int i=0; i<s.length(); i++){
            if(s.charAt(i)!=' '){
                notChar = (int)s.charAt(i);
                notChar2 = notChar + n;
                if(notChar>=65&&notChar<=90&&notChar2>90){
                    notChar2 -= 26;
                }
                if(notChar2>122){
                    notChar2 -= 26;
                }
                char ch = (char) notChar2;
                answer += ch;
            }
            else if(s.charAt(i)==' '){
                answer += s.charAt(i);
            }
           
        }
        return answer;
    }
}