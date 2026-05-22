class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        // colBegin, colEnd
        // rowBegin, rowEnd
         List<Integer> result = new ArrayList<>();
         int colBegin =0 ,rowBegin  = 0;
         int colEnd = matrix[0].length -1 , rowEnd = matrix.length - 1;

         while(colBegin <= colEnd && rowBegin <= rowEnd){
               // Traverse left to right
               for(int i = colBegin;  i <= colEnd; i++){ 
                    result.add(matrix[rowBegin][i]);
               } 
               rowBegin++;

               //Traverse top to bottom
               for(int i = rowBegin; i <= rowEnd; i++){
                    result.add(matrix[i][colEnd]);
               } 
               colEnd--;

               //Traverse right to left
               if(rowBegin <= rowEnd){
                for(int i = colEnd; i >= colBegin; i--){
                    result.add(matrix[rowEnd][i]);
                }
                rowEnd--;
               }

               //Traverse bottom to top
               if(colBegin <= colEnd){
                for(int i = rowEnd; i >= rowBegin; i--){
                    result.add(matrix[i][colBegin]);
                }
                colBegin++;
               }
         }
         return result;
    }
}