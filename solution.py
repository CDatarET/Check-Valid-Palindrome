class Solution:
    def isPalindrome(self, s):
        s = re.sub(r'[^A-Za-z0-9]', '', s)
        s = s.lower()
        return(s == s[::-1])
