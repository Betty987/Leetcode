class Solution:
    def countPalindromicSubsequence(self, s: str) -> int:
        # Initialize a set to store unique palindromes
        unique_palindromes = set()

        # Iterate through each character of the string as the first character of the palindrome
        for char in set(s):  # Consider each unique character as the first and last character
            # Find the first and last occurrence of the current character
            left_index = s.find(char)
            right_index = s.rfind(char)

            # If there is space for a middle character (i.e., at least two occurrences of char)
            if right_index - left_index > 1:
                # Add all unique middle characters between the left and right indices
                middle_characters = set(s[left_index + 1:right_index])
                for middle_char in middle_characters:
                    unique_palindromes.add((char, middle_char, char))

        # The number of unique palindromes is the size of the set
        return len(unique_palindromes)
