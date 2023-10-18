class Solution {
    private boolean isCaseValid(List<Integer> currentCase, int n) {
        if(currentCase.size() == n) return true;
        return false;
    }
    
    private List<Integer> getValidPlaces(List<Integer> currentCase, int n) {
        List<Integer> currentRow = new ArrayList<>(n);
        for(int i = 0; i < n; i++) {
            currentRow.add(i);
        }
        
        if(currentCase.size() == 0 || currentCase.isEmpty()) {
            return currentRow;
        }
        
        int position = currentCase.size();
        for(int i = 0; i < currentCase.size(); i++) {
            int col = currentCase.get(i);
            currentRow.remove(Integer.valueOf(col));
            int distance = position - i;
            if(col - distance >= 0) {
                currentRow.remove(Integer.valueOf(col - distance));
            } 
            if(col + distance < n) {
                currentRow.remove(Integer.valueOf(col + distance));
            }
        }
        
        return currentRow;
    }
    
    private List<String> getStringOfValidPlace(List<Integer> validPlace, int n) {
        List<String> tvs = new ArrayList<>(n);
        StringBuilder rowString = new StringBuilder();
    
        for(int i = 0; i < validPlace.size(); i++) {
            rowString.setLength(0);
            for(int j = 0; j < n; j++) {
                if(j == validPlace.get(i)) {
                    rowString.append("Q");
                } else {
                    rowString.append(".");
                }
            } 
            tvs.add(rowString.toString());
        }
        return tvs;
    }
    
    private void placing(List<List<String>> res, List<Integer> currentCase, int n) {
        List<Integer> validPlaces = getValidPlaces(currentCase, n);
        List<String> validPlacesString = new ArrayList<>();
        
        if(isCaseValid(currentCase, n)) {
            res.add(getStringOfValidPlace(currentCase, n));
            return;
        }
        
        for(Integer i : validPlaces) {
            currentCase.add(i);
            placing(res, currentCase, n);
            currentCase.remove(Integer.valueOf(i));
        }
    }
        
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        List<Integer> currentCase = new ArrayList<>();
        placing(res, currentCase, n);
        return res;
    }
}