# Find-Non-Repeating-Elements
Given an array of integers, find all elements that appear only once. The order of the output does not matter.
Explanation:
Count Occurrences: We use a HashMap to store the frequency of each element in the array.
Find Non-Repeating Elements: We check each entry in the map, adding elements with a frequency of 1 to the result list.
Example Outputs:

For nums1 = [1, 2, -1, 1, 3, 1], the output is [2, -1, 3].
For nums2 = [1, 2, 3], the output is [1, 2, 3].
