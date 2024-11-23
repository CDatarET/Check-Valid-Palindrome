class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^\\p{IsAlphabetic}\\p{IsDigit}]", "");
        s = s.toLowerCase();
        String n = "";

        for(int i = s.length()-1; i >=0; i--){
            n = n + s.charAt(i);
        }

        if(s.equals(n)){
            return(true);
        }
        else{
            return(false);
        }
    }
}
