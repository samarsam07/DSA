package backTracking;

public class CountingPaths {
    public static void main(String[] args) {
        System.out.println(countPath(3, 4));
    }
    static int countPath(int row,int col){
        if(row<=1||col<=1){
            return 1;
        }
        int down=countPath(row-1, col);
        int right=countPath(row, col-1);
        return down+right;
    }
}
