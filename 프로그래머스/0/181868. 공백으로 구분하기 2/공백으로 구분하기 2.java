class Solution {
    public String[] solution(String my_string) {
        String newStr = my_string.replaceAll("\\s+", " ");
        newStr = newStr.strip();
        

        String[] answer = newStr.split(" ");
        return answer;
    }
}