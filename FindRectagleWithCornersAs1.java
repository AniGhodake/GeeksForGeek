class Solution {
    public boolean ValidCorner(int matrix[][]) {
        int rows = matrix.length;
        if(rows == 0) return false;
        int cols = matrix[0].length;
        
        Set<String> seenPairs = new HashSet<>();
        
        for(int row[] : matrix){
            List<Integer> ones = new ArrayList<>();
            for(int col = 0; col < cols; col++){
                if(row[col] ==  1){
                    ones.add(col);
                }
            }
            
            for(int i = 0; i < ones.size(); i++){
                for(int j = i + 1; j < ones.size(); j++){
                    int col1 = ones.get(i);
                    int col2 = ones.get(j);
                    String pair = col1 + "," + col2;
                    
                    
                    if(seenPairs.contains(pair)){
                        return true;
                    }
                    seenPairs.add(pair);
                }
            }
            
        }
        return false;
        
    }
}