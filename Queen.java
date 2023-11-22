import java.util.*;
public class Queen {
    public static boolean issafe(char board[][],int raw, int col){
        for(int i=raw-1; i>=0; i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        for(int i=raw-1,j=col-1; i>=0 &&j>=0; i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
      }
    for(int i=raw-1,j=col+1; i>=0 &&j<board.length; i--,j++){
        if(board[i][j]=='Q'){
            return false;
        }
        }
     return true;
    }
public static void nQueens(char board[][],int raw){
    if(raw == board.length){
       // printBoard(board);
        count++;
        return;
    }
    for(int i=0; i<board.length; i++){
        if(issafe(board,raw,i)){
           board[raw][i] = 'Q';
           nQueens(board, raw+1);
           board[raw][i] = 'x';
        }
    }

}
public static void printBoard(char board[][]){
    System.out.println("................chess board..........");
    for(int i=0; i<board.length; i++){
        for(int j=0; j<board.length; j++){
            System.out.print(board[i][j]+" ");
        }
        System.out.println();
    }
}
static int count = 0;
public static void main(String args[]){
int n=4;
char board[][] = new char[n][n];
         for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] ='x';
            }
        }
        nQueens(board,0);
    System.out.println("total way of Queen = " + count);
    }
    
}