class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        // 2차원 배열 photo를 돌면서 이름이랑 겹치는거 있는지 확인 
        // 겹친다 ? > yearning 점수에 따라 answer의 n번째 배열에 누적
        // 3중 포문 써도 되나 ?
        for(int k=0; k<name.length; k++){
            for(int i=0; i<photo.length; i++){
                for(int j=0; j<photo[i].length; j++){
                    if(name[k].equals(photo[i][j])){
                        answer[i] += yearning[k];
                    }
                }
            }   
        }
             
        return answer;
    }
}