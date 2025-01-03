class Solution:
    def waysToSplitArray(self, nums):
        total_sum = sum(nums)  # Compute the total sum of the array
        left_sum = 0
        count = 0
        
        # Iterate through the array, but exclude the last index (right part must be non-empty)
        for i in range(len(nums) - 1):
            left_sum += nums[i]  # Update the left sum
            right_sum = total_sum - left_sum  # Calculate the right sum dynamically
            if left_sum >= right_sum:  # Check the condition
                count += 1
        
        return count
