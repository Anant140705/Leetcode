class Solution {
    public String longestPalindrome(String s) {
        String max = "";
        for(int i=0;i<s.length();i++){
            String oddstring = Expansion(s,i,i);
            String evenstring = Expansion(s,i,i+1);
            if(max.length()<oddstring.length()) max = oddstring;
            if(max.length()<evenstring.length()) max = evenstring;
        }
        return max;
    }
    static String Expansion(String s, int L, int R){
        while(L>=0 && R<s.length() && s.charAt(L)==s.charAt(R)){
            L--;
            R++;
        }
        return s.substring(L+1,R);
    }
}