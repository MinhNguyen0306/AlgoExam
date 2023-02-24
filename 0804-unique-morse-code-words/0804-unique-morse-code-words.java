class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        
        // Set lưu các morse khác nhau
        Set<String> setMorses = new HashSet<>();
        
        String[] morses = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    
        for(String word : words) {
            String morseString = "";
            for(char c : word.toCharArray()) {
                // Lấy vị trí tương ứng của ký tự trong morses
                morseString += morses[c - 'a'];
            }
            setMorses.add(morseString);
        }
        return setMorses.size();
    }
}