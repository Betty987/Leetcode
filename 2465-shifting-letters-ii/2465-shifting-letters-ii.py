class Solution:
    def shiftingLetters(self, s, shifts):
        n = len(s)
        diff = [0] * (n + 1)  # Difference array to track shifts

        # Step 1: Populate the difference array based on the shifts
        for start, end, direction in shifts:
            if direction == 1:  # Right shift
                diff[start] += 1
                diff[end + 1] -= 1
            else:  # Left shift
                diff[start] -= 1
                diff[end + 1] += 1

        # Step 2: Compute the prefix sum to get the net shifts
        net_shifts = [0] * n
        current_shift = 0
        for i in range(n):
            current_shift += diff[i]
            net_shifts[i] = current_shift

        # Step 3: Apply the net shifts to the string
        result = []
        for i, char in enumerate(s):
            shift = net_shifts[i]
            # Calculate the new character (handle wrapping using modulo)
            new_char = chr((ord(char) - ord('a') + shift) % 26 + ord('a'))
            result.append(new_char)

        # Join and return the result
        return ''.join(result)
