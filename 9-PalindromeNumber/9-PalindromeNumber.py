# Last updated: 9/4/2025, 12:09:04 AM
class Solution:
    def isPalindrome(self, x: int) -> bool:
        return str(x) == str(x)[::-1]
        