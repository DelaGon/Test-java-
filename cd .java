 class cd202 {
   public static void main(String[] args) {
       int[][] matrix = {
    {1, 2, 3, 4},
    {5, 6, 7, 8},
    {8, 7, 6, 5},
    {4, 3, 2, 1}
};
      for (int i = 0; i < matrix.length; i++) { 
         for (int j = 0; j < matrix[i].length; j++){
         System.out.print(matrix[i][j]);
         if(j<3) { 
            System.out.print(" "); 
         }
      }
         System.out.println(); 
      }
   }
}