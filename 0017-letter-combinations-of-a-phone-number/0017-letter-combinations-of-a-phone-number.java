class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if(digits.equals("")) {
            return res;
        }
        
        Map<Integer, String> mapping = new HashMap<Integer, String>();
        mapping.put(2, "abc");
        mapping.put(3, "def");
        mapping.put(4, "ghi");
        mapping.put(5, "jkl");
        mapping.put(6, "mno");
        mapping.put(7, "pqrs");
        mapping.put(8, "tuv");
        mapping.put(9, "wxyz");

        String letter = "";
        combine(0, res, mapping, digits, letter);
        return res;
    }
    
    private boolean isValidLetter(String digits, String letter) {
        return digits.length() == letter.length();
    }
    
    void combine(int i, List<String> res, Map<Integer, String> mapping, String digits, String letter) {
        if(isValidLetter(digits, letter.toString())) {
            res.add(letter.toString());
            return;
        }
        
        int digitNumber = Character.getNumericValue(digits.charAt(i));
        String mappingOfDigit = mapping.get(digitNumber);
        for(int j = 0; j < mappingOfDigit.length(); j++){
            combine(i+1, res, mapping, digits, letter + mappingOfDigit.charAt(j));
        }
        
        letter = "";
    }
}