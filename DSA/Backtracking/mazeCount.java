import java.lang.reflect.Array;
import java.util.*;
public class mazeCount {
    public static void main(String[] args) {
        // System.out.println(printString("", 3, 3));
        // path("", 3, 3);
        // System.out.println(pathRetDiagonaly("", 3, 3));
        boolean[][] maze = {
            {true, true, true},
            {true, true, true}, 
            {true, true, true} 
        };

        int[][] path = new int[maze.length][maze[0].length];
        allPathPrint("",maze,  0, 0, path, 1);



      }
    static int countWays(int r, int c){
        if(r == 1 || c == 1) return 1;


        int left = countWays(r-1, c);
        int right = countWays(r, c-1);

        return left+right;
    }

    // static ArrayList<String> printString(String path, int r, int c){
    //     if(r == 1 && c == 1){
    //         ArrayList<String> list = new ArrayList<>();
    //         list.add(path);
    //         return list;
    //     }
    //     ArrayList<String> total = new ArrayList<>();
    //     ArrayList<String> left = new ArrayList<>();
    //     ArrayList<String> right = new ArrayList<>();
    //     if(r > 1){
    //         left = printString(path + "D", r-1, c);
    //     }else{
    //         left = printString(path + "R", r, c-1);
    //     }

    //     if(c > 1){
    //         right.addAll(printString( path + "D", r-1, c));
    //     }else{
    //         right.addAll(printString( path + "R", r, c-1));
    //     }
    //     total.addAll(left);
    //     total.addAll(right);
    //     return total;
    // }

    static void path(String p, int r, int c){
        if(r == 1 && c == 1){
            System.out.println(p);
            return;
        }

        if(r > 1){
            path(p + "D", r-1, c);
        }

        if(c > 1){
            path(p + "R", r, c-1);
        }
    }


    static ArrayList<String> pathRetDiagonaly(String p, int V, int H){
        if(V == 1 && H == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> temp = new ArrayList<>();

        if(V > 1 && H > 1){
            temp.addAll(pathRetDiagonaly(p + 'D', V-1, H-1));
        }

        if(V > 1){
            temp.addAll(pathRetDiagonaly(p+'V', V-1, H));
        }

        if(H > 1){
            temp.addAll(pathRetDiagonaly(p+'H', V, H-1));
        }
        return temp;
    }

    // static void pathRestriction(String p,boolean[][] maze,  int V, int H){
    //     if(V == maze.length-1 && H == maze[0].length-1){
    //         System.out.println(p);
    //         return;
    //     }

    //     if(!maze[V][H]){
    //         return;
    //     }

    //     if(V < maze.length-1){
    //         pathRestriction(p+'V',maze,  V+1, H);
    //     }

    //     if(H < maze[0].length-1){
    //         pathRestriction(p+'H', maze, V, H+1);
    //     }
    // }



    static void pathRestriction(String p,boolean[][] maze,  int R, int C){
        if(R == maze.length-1 && C == maze[0].length-1){
            System.out.println(p);
            return;
        }


        if(!maze[R][C]){
            return;
        }

        maze[R][C] = false;

        if(R<maze.length-1){
            pathRestriction(p + 'D', maze, R+1, C);
        }

        if(C<maze[0].length-1){
            pathRestriction(p + 'R', maze, R, C+1);
        }

        if(R>0){
            pathRestriction( p + 'U', maze, R-1, C);
        }

        if(C>0){
            pathRestriction( p + 'L', maze, R, C-1);
        }

        maze[R][C] = true;
    }


        static void allPathPrint(String p,boolean[][] maze,  int R, int C, int[][] path, int step){
        if(R == maze.length-1 && C == maze[0].length-1){
            path[R][C] = step;
            for(int[] arr: path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }


        if(!maze[R][C]){
            return;
        }
        
        maze[R][C] = false;
        path[R][C] = step;
        if(R<maze.length-1){
            allPathPrint(p + 'D', maze, R+1, C, path, step+1);
        }

        if(C<maze[0].length-1){
            allPathPrint(p + 'R', maze, R, C+1, path, step+1);
        }

        if(R>0){
            allPathPrint( p + 'U', maze, R-1, C, path, step+1);
        }

        if(C>0){
            allPathPrint( p + 'L', maze, R, C-1, path, step+1);
        }

        maze[R][C] = true;
        path[R][C] = 0;
    }
}

