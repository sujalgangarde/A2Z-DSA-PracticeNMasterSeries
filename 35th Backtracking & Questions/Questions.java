import java.util.ArrayList;

public class Questions {

    static int count(int r, int c){
        if(r == 1 || c ==1){
            return 1;
        }

        int left = count(r-1, c);
        int right = count(r, c-1);

        return left + right;
    }


    static void paths(String p, int r, int c){
        if(r == 1 && c == 1){
            System.out.println(p);
            return;
        }

        if(r > 1){
            paths(p + 'D', r-1, c);
        }

        if(c > 1){
            paths(p + 'R', r, c-1);
        }

    }

    static ArrayList<String> pathsRet(String p, int r, int c){
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if(r > 1){
            list.addAll(pathsRet(p + 'D', r-1, c));
        }

        if(c > 1){
            list.addAll(pathsRet(p + 'R', r, c-1));
        }

        return list;

    }

    static ArrayList<String> pathsRetDiagonal(String p, int r, int c){
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if(r > 1){
            list.addAll(pathsRetDiagonal(p + 'D', r-1, c));
        }

        if(r > 1 && c > 1){
            list.addAll(pathsRetDiagonal(p + 'V', r-1, c-1));
        }

        if(c > 1){
            list.addAll(pathsRetDiagonal(p + 'R', r, c-1));
        }

        return list;

    }


    static void pathsObstacle(String p, boolean[][] maze, int r, int c){
        if(r == maze.length - 1 && c == maze[0].length - 1){
            System.out.println(p);
            return;
        }

        if(maze[r][c] == false){
            return;
        }

        if(r < maze.length - 1){
            pathsObstacle(p + 'D', maze, r+1, c);
        }

        if(c < maze[0].length - 1){
            pathsObstacle(p + 'R', maze, r, c+1);
        }

    }

    static ArrayList<String> pathsRetObstacle(String p, boolean[][] maze, int r, int c){
        if(r == maze.length - 1 && c == maze[0].length - 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if(maze[r][c] == false){
            return list;
        }

        if(r < maze.length - 1){
            list.addAll(pathsRetObstacle(p + 'D', maze, r+1, c));
        }

        if(c < maze[0].length - 1){
            list.addAll(pathsRetObstacle(p + 'R', maze, r, c+1));
        }
        return list;

    }

    public static void main(String[] args) {
        
// Q. MAZE Problem : there is 2d maze 3x3. person is at(0,0) and want to go at (2, 2) and only go in right or down dirction
/*
        3   2   1
    3 |   |   |   |
    2 |   |   |   |
    1 |   |   |   |
*/
    // Return count of no of ways
        System.out.println("No. of ways to get there: "+count(3, 3));
        System.out.println();
    // Return all ways/paths
        paths("",3,3);
        System.out.println();
    // return Arraylist of paths
        System.out.println(pathsRet("",3,3));
        System.out.println();

// Q. in above question only add a direction diagonally
        System.out.println(pathsRetDiagonal("",3,3));
        System.out.println();

// Q. Maze with obstacles from (0, 0) to (2, 2) only with two directions right and down
/*
        0    1   2
    0 |   |    |   |
    1 |   |Rock|   |
    2 |   |    |   |

Obstacle is rock. can not go over that. false condition.
so check for every step is it rock condition if yes then not crt path.
if land on rock dont go forward just return.
*/
    // Return all ways/paths with obstacle
        boolean[][] maze = {
            {true, true, true},
            {true, false, true},
            {true, true, true}
        };
        pathsObstacle("", maze,0,0);
        System.out.println();
    // return Arraylist of paths with obstacle
        System.out.println(pathsRetObstacle("", maze,0,0));
        System.out.println();
    

    }

}
