class Solution {
    public void transpose (int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0; j<=i;j++){
                int temp = arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }
        
    public void rowreverse (int [][]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0; j<arr.length/2;j++){
                int temp = arr[i][j];
                arr[i][j]=arr[i][arr.length-j-1];
                arr[i][arr.length-j-1]=temp;
            }
    }
    }

    public void rotate(int[][] matrix) {
        //transpose and reverse
        //transpose
        transpose(matrix);  
        rowreverse(matrix);
    }
}