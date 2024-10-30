class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> triangle = new ArrayList<>();
        if(numRows == 0) return triangle;

        List<Integer> row = new ArrayList<>();
        row.add(1);
        triangle.add(row);

        List<Integer> prevRow = row;

        for(int i=1; i<numRows; i++){
            List<Integer> currentRow = new ArrayList<>();
            currentRow.add(1);
            for(int j=1; j<i; j++){
                currentRow.add(prevRow.get(j) + prevRow.get(j-1));
            }
            currentRow.add(1);
            triangle.add(new ArrayList<>(currentRow));
            prevRow = currentRow;
        }
        return triangle;
    }
}