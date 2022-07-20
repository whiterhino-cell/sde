package akm;

import java.util.LinkedList;
import java.util.Queue;

public class D14Q07_RottenOranges {
    public int orangesRotting(int[][] grid) {
        if(grid == null || grid.length == 0)
            return 0;
        int rows = grid.length;
        int cols = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int count_orange = 0;

        for(int i = 0 ; i < rows ; i++) {
            for(int j = 0 ; j < cols ; j++) {
                if(grid[i][j] == 2) {
                    queue.offer(new int[]{i , j});
                }
                if(grid[i][j] != 0) {
                    count_orange++;
                }
            }
        }

        if(count_orange == 0) return 0;

        int countMin = 0, cnt = 0;
        int dx[] = {0, 0, 1, -1};
        int dy[] = {1, -1, 0, 0};
//                  R, L,  D, U
        //bfs starting from initially rotten oranges
        while(!queue.isEmpty()) {
            int size = queue.size();
            cnt += size;
            for(int i = 0 ; i < size ; i++) {
                int[] point = queue.poll();
                for(int j = 0;j<4;j++) {
                    int x = point[0] + dx[j]; //0  0
                    int y = point[1] + dy[j]; //0  1

                    if(x < 0 || y < 0 || x >= rows || y >= cols ||  //boundry
                            grid[x][y] == 0 || grid[x][y] == 2)     //khali ya sadela
                        continue;                                   //nikal ❤️DE

                    grid[x][y] = 2;
                    queue.offer(new int[]{x , y});
                }
            }
            if(queue.size() != 0) {
                countMin++;
            }
        }
        return count_orange == cnt ? countMin : -1;
    }
    public static void main(String args[]) {
        D14Q07_RottenOranges oranges=new D14Q07_RottenOranges();
        int arr[][]={ {2,1,1} , {1,1,0} , {0,1,1} };
        int rotting = oranges.orangesRotting(arr);
        System.out.println("Minimum Number of Minutes Required "+rotting);
    }
}

