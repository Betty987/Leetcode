class Solution:
    def minDistance(self, word1: str, word2: str) -> int:
        # Get the lengths of the two strings
        m, n = len(word1), len(word2)
        
        # Initialize a (m+1) x (n+1) DP table
        dp = [[0] * (n + 1) for _ in range(m + 1)]
        
        # Base cases: converting empty strings
        for i in range(m + 1):
            dp[i][0] = i  # Deleting all characters from word1
        for j in range(n + 1):
            dp[0][j] = j  # Inserting all characters into word1
        
        # Fill the DP table
        for i in range(1, m + 1):
            for j in range(1, n + 1):
                if word1[i - 1] == word2[j - 1]:
                    dp[i][j] = dp[i - 1][j - 1]  # Characters match, no operation needed
                else:
                    dp[i][j] = 1 + min(
                        dp[i - 1][j],    # Delete
                        dp[i][j - 1],    # Insert
                        dp[i - 1][j - 1] # Replace
                    )
        
        # Return the final answer
        return dp[m][n]

