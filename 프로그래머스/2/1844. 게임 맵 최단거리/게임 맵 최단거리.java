import java.util.*;

public class Solution {
    public int solution(int[][] maps) {
        int rowCount = maps.length;
        int colCount = maps[0].length;
        boolean[][] visited = new boolean[rowCount][colCount];

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0, 1});
        visited[0][0] = true;

        int[][] directions = {
            {1, 0}, {-1, 0}, {0, 1}, {0, -1}  
        };

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int currentRow = current[0];
            int currentCol = current[1];
            int stepsTaken = current[2];

            if (currentRow == rowCount - 1 && currentCol == colCount - 1) {
                return stepsTaken;
            }

            for (int[] direction : directions) {
                int nextRow = currentRow + direction[0];
                int nextCol = currentCol + direction[1];

                if (nextRow >= 0 && nextRow < rowCount &&
                    nextCol >= 0 && nextCol < colCount &&
                    maps[nextRow][nextCol] == 1 && !visited[nextRow][nextCol]) {

                    visited[nextRow][nextCol] = true;
                    queue.add(new int[]{nextRow, nextCol, stepsTaken + 1});
                }
            }
        }

        return -1;
    }
}
