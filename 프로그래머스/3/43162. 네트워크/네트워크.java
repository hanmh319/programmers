class Solution {
    public int solution(int n, int[][] computers) {
        /* 탐색 문제 
            전에 풀었던 N-queen 문제의 하위호환
            0과 1 그리고 0과 2가 연결된 경우에는 0-1-2가 연결된 하나의 네트워크임을 체크
            
            1. 방문한 컴퓨터인지 확인한다.
            boolean
            2. 
        */
        boolean[] visit = new boolean[n];
        int answer = 0;
        
        for(int i = 0 ; i<n; i++){
            if (!visit[i]) {
                dfs(i, computers, visit);
                answer++;
            }
        }
        
        return answer;
    }
    
    public void dfs(int start, int[][] computers, boolean[] visit){
        visit[start] = true;

        for (int i = 0; i < computers.length; i++) {
            if (computers[start][i] == 1 && !visit[i]) {
                dfs(i, computers, visit);
            }
        }
    }
}