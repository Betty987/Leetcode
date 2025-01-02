class Solution:
    def vowelStrings(self, words, queries):
        # Helper function to check if a word starts and ends with vowels
        def is_vowel_string(word):
            vowels = {'a', 'e', 'i', 'o', 'u'}
            return word[0] in vowels and word[-1] in vowels

        # Precompute prefix sum array
        n = len(words)
        prefix = [0] * (n + 1)
        for i in range(n):
            prefix[i + 1] = prefix[i] + (1 if is_vowel_string(words[i]) else 0)

        # Process each query
        result = []
        for l, r in queries:
            result.append(prefix[r + 1] - prefix[l])

        return result
