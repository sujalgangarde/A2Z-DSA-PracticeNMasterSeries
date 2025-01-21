
public class RecurPattern{

    static void patt1(int r, int c){
        if(r==0){
            return;
        }
        if(c<r){
            System.out.print("*");
            patt1(r, c+1);
        } else{
            System.out.println();
            patt1(r-1, 0);
        }
    }

    static void patt2(int r, int c){
        if(r==0){
            return;
        }
        if(c<r){
            patt2(r, c+1);
            System.out.print("*");
        } else{
            patt2(r-1, 0);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
/*

 * * * *
 * * *
 * *
 * 

 */
        patt1(4,0);
/*

 * 
 * *
 * * *
 * * * *

 */
        patt2(4, 0);

    }

}