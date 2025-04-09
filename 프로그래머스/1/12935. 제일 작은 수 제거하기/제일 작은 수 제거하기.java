class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1){
            int[] answer = new int[1];
            answer[0] = -1;
            return answer;
        }
        else{
            int[] answer = new int[arr.length-1];
            int min = arr[0];
            for(int i=0; i<arr.length; i++){
                if(arr[i]<min)
                    min = arr[i];
            }
            
            int newidx = 0;
            System.out.println(min);
            for(int j=0; j<arr.length; j++){
                if(min != arr[j]){
                    answer[newidx++] = arr[j];
                }
            }
            return answer;
            }
        }
    }
