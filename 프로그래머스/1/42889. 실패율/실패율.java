class Solution {
    public int[] solution(int N, int[] stages) {
        int[] reach = new int[N+1];
        int[] clear = new int[N+1];
        
        for(int i=0 ; i<stages.length; i++){
            for(int j=0; j<stages[i]; j++){
                reach[j]++;
            }
            
            for (int k= 0; k<stages[i]-1; k++){
                clear[k]++;
            }
        }
        
        double[] forAnswer = new double[N];
        for(int i=0; i<forAnswer.length; i++){
            if(reach[i] == 0){
                forAnswer[i] = 0;
            }
            else{
                forAnswer[i] = (double)(reach[i] - clear[i]) / reach[i];
            }
        }
        int[] answer = new int[N];
        double max = -1;
        int index = -1;
        int m;
        
        for(int i=0; i<clear.length; i++){
            System.out.print(reach[i] + " ");
        }
        System.out.println();
         for(int i=0; i<reach.length; i++){
            System.out.print(clear[i] + " ");
        }
        
        for(int i=0; i<answer.length; i++){
            max = -1;
            index = -1;
            for(m=0; m<answer.length; m++){
                if(max < forAnswer[m]){
                    max = forAnswer[m];
                    index = m;
                }
            }
            answer[i] = index+1;
            forAnswer[index] = -1;
        }
        
        /*
        제시된 N : 스테이지의 개수
        (N+1)이 배열에 제시된 경우 : 스테이지 전부 클리어
        전부 도달하지 못한 경우 : 실패율 0
        실패율 : 도달했으나 클리어하지 못한 수 / 도달한 플레이어 수
        
        (1스테이지를 세고 싶은 예시)
        배열의 값이 1인 수 > 배열의 값이 1 이상인 수
        
        */
        return answer;
    }
}