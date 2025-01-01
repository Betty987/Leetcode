class Solution:
    def maxScore(self, s: str) -> int:
        # Initial counts for the right part (entire string considered initially as the right part)
        total_ones = s.count('1')
        left_zeros = 0
        right_ones = total_ones
        max_score = 0

        # Iterate through the string, excluding the last character (to ensure two non-empty parts)
        for i in range(len(s) - 1):
            if s[i] == '0':
                left_zeros += 1
            else:
                right_ones -= 1

            # Update max_score after this split
            max_score = max(max_score, left_zeros + right_ones)

        return max_score


        