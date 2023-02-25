class Solution {
    public String toGoatLatin(String sentence) {
        StringBuilder result = new StringBuilder();
        String[] spl = sentence.split(" ");
        String conStr = "maa";
        int sSize = spl.length;
        for(int i = 0; i < sSize; i++) {
            StringBuilder arr = new StringBuilder(spl[i]); 
            if(!isVowel(arr.charAt(0))) {
                char temp = arr.charAt(0);
                arr.deleteCharAt(0);
                arr.append(temp);
            }
            arr.append(conStr + " ");
            result.append(arr);
                
            conStr += 'a';
        }
        return result.toString().trim();
    }
    
    public boolean isVowel(char c) {
        return c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u'|| c=='A'|| c=='E'|| c=='I'|| c=='O'|| c=='U';
    }
}