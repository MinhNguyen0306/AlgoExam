class Solution {
    public String toGoatLatin(String sentence) {
        StringBuilder result = new StringBuilder();
        String[] arr = sentence.split(" ");
        String conStr = "maa";
        int sSize = arr.length;
        for(int i = 0; i < sSize; i++) {
            if(isVowel(arr[i].charAt(0))) 
                result.append(arr[i] + conStr + " ");
            else 
                result.append(arr[i].substring(1) + arr[i].charAt(0) + conStr + " ");
            conStr += 'a';
        }
        return result.toString().trim();
    }
    
    boolean isVowel(char c) {
        return (c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u'|| c=='A'|| c=='E'|| c=='I'|| c=='O'|| c=='U');
    }
}