import java.util.*;
public class MatrixSpiralPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number rows::");
        int r = sc.nextInt();
        System.out.println("Enter the number columns::");
        int c = sc.nextInt();
        int  mat[][] = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        int row_start=0,row_end=r-1,col_start=0,col_end=c-1;
        while(row_start<=row_end && col_start<=col_end){
            for(int col=col_start;col<=col_end;col++){
                System.out.print(mat[row_start][col]+",");
            }
            row_start++;
            for(int row=row_start;row<=row_end;row++){
                System.out.print(mat[row][col_end]+",");
            }
            col_end--;

            //--------------------->


            if(row_start<=row_end){
                for (int col=col_end;col>=col_start;col--){
                    System.out.print(mat[row_end][col]+",");
                }
                row_end--;
            }
            if(col_start<=col_end){
                for (int row=row_end;row>=row_start;row--){
                    System.out.print(mat[row][col_start]+",");
                }
                col_start++;
            }


        }
    }
}
