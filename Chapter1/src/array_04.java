public class array_04 {
    public static void main(String args[]){
        //2D array with 3 rows and 4 columns
        int[][] twoD_array = new int[3][4];

        //visiting each row
        for(int row=0; row<twoD_array.length; row++){
            //each column for a given row
            for(int col =0; col<twoD_array[row].length; col++){
                //storing row number + column number
                twoD_array[row][col] = row + col;
            }
        }
        //printting resultant array
        for(int[] tem: twoD_array){
            for(int val: tem){
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }
    
}
