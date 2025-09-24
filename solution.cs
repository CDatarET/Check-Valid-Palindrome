using static System.Text.RegularExpressions.Regex;

public class Solution {
    public bool IsPalindrome(string s) {
        s = Replace(s, @"[^\p{L}\p{Nd}]", "");
        s = s.ToLower();

        char[] chars = s.ToCharArray();
        Array.Reverse(chars);
        string n = new string(chars);
        
        return(s.Equals(n));
    }
}
