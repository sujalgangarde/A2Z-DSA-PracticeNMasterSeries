import java.util.ArrayList;
import java.util.Arrays;

public class Backtracking {
    
    // static ArrayList<String> allPathsRet(String p, boolean[][] maze, int r, int c){
    //     if(r == maze.length - 1 && c == maze[0].length - 1){
    //         ArrayList<String> list = new ArrayList<>();
    //         list.add(p);
    //         return list;
    //     }

    //     ArrayList<String> list = new ArrayList<>();

    //     if(maze[r][c] == false){
    //         return list;
    //     }

    //     if(r < maze.length - 1){
    //         list.addAll(allPathsRet(p + 'D', maze, r+1, c));
    //     }

    //     if(c < maze[0].length - 1){
    //         list.addAll(allPathsRet(p + 'R', maze, r, c+1));
    //     }

    //     if(r > 0){
    //         list.addAll(allPathsRet(p + 'U', maze, r-1, c));
    //     }

    //     if(c > 0){
    //         list.addAll(allPathsRet(p + 'L', maze, r, c-1));
    //     }

    //     return list;

    // }

    static ArrayList<String> allPathsRetmark(String p, boolean[][] maze, int r, int c){
        if(r == maze.length - 1 && c == maze[0].length - 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if(maze[r][c] == false){
            return list;
        }

        // considering cell in path
        maze[r][c] = false;

        if(r < maze.length - 1){
            list.addAll(allPathsRetmark(p + 'D', maze, r+1, c));
        }

        if(c < maze[0].length - 1){
            list.addAll(allPathsRetmark(p + 'R', maze, r, c+1));
        }

        if(r > 0){
            list.addAll(allPathsRetmark(p + 'U', maze, r-1, c));
        }

        if(c > 0){
            list.addAll(allPathsRetmark(p + 'L', maze, r, c-1));
        }

        // returning line so remove changes made by this recursion
        maze[r][c] = true;
        
        return list;

    }

    static void allPathMatrix(String p, boolean[][] maze, int r, int c, int[][] path, int step){
        if(r == maze.length - 1 && c == maze[0].length - 1){
            path[r][c] = step; // this is also a step so add step at last
            System.out.println(p);
            for (int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println();
            return;
        }

        if(maze[r][c] == false){
            return;
        }

        // considering cell in path
        maze[r][c] = false;
        path[r][c] = step;

        if(r < maze.length - 1){
            allPathMatrix(p + 'D', maze, r+1, c, path, step+1);
        }

        if(c < maze[0].length - 1){
            allPathMatrix(p + 'R', maze, r, c+1, path, step+1);
        }

        if(r > 0){
            allPathMatrix(p + 'U', maze, r-1, c, path, step+1);
        }

        if(c > 0){
            allPathMatrix(p + 'L', maze, r, c-1, path, step+1);
        }

        // returning line so remove changes made by this recursion
        maze[r][c] = true;
        path[r][c] = 0;

    }

    public static void main(String[] args) {
        
// Need : In maze problem if we can move in all four direction then might sometime we cant reach goal.
        boolean[][] maze = {
            {true,true,true},
            {true,true,true},
            {true,true,true}
        };
        // System.out.println(allPathsRet("", maze, 0, 0));
        System.out.println();
    // This above give stack overflow error.
    // Problem : In this it comes back where it was started endless loop. so it throws error of stackoverflow
    // solution : Dont go back to same path. by marking cells(like visited) as false

// Backtracing : (WHAT IF i had not taken this path) Changes in a recursion must available only in that recursion Only. not for recursion before it.
    // Problem (Prablem of getting original data(maze) modified): when cells are marked in first recursion while returning it does not unmarking it so it will arise problem for next recursions.
    // Solution : while returning(going back) Restore data in maze at it was
        System.out.println(allPathsRetmark("", maze, 0, 0));
        System.out.println();

// Q. print the matrix of all paths
    // add a new argument step variable
    // update path 
    // print in base condition
    // backtrack
        int[][] path = new int [maze.length][maze[0].length];
        allPathMatrix("", maze, 0, 0, path, 1);

    }

}
