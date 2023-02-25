class Solution {
    public String[] findWords(String[] words) {
        HashMap <Character , Integer> rowId = new HashMap <>();
        String temp = "qwertyuiopQWERTYUIOP";
        for(char i : temp.toCharArray())
            rowId.put(i , 1);
        temp = "asdfghjklASDFGHJKL";
        for(char i : temp.toCharArray())
            rowId.put(i , 2);
        temp = "zxcvbnmZXCVBNM";
        for(char i : temp.toCharArray())
            rowId.put(i , 3);
        boolean same_row;
        List <String> result_list = new ArrayList<String>();
        for(String word : words)
        {
            same_row = true;
            for(int i = 1 ; i < word.length() ; i++)
            {
                if(rowId.get(word.charAt(i)) != rowId.get(word.charAt(0)))
                {
                    same_row = false;
                    break;
                }
            }
            if(same_row)
                    result_list.add(word);
        }
        String[] result = new String[result_list.size()];
        for(int i = 0 ; i < result.length ; i++)
            result[i] = result_list.get(i);
        return result;
    }
}