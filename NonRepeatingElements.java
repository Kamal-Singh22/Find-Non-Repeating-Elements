import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class NonRepeatingElements {

    public static List<Integer> findNonRepeating(int[] nums) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Count occurrences of each element
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Collect elements that appear only once
        List<Integer> nonRepeatingElements = new ArrayList<>();
        for (int num : frequencyMap.keySet()) {
            if (frequencyMap.get(num) == 1) {
                nonRepeatingElements.add(num);
            }
        }
        
        return nonRepeatingElements;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, -1, 1, 3, 1};
        System.out.println("Non-Repeating Elements: " + findNonRepeating(nums1)); // Output: [2, -1, 3]

        int[] nums2 = {1, 2, 3};
        System.out.println("Non-Repeating Elements: " + findNonRepeating(nums2)); // Output: [1, 2, 3]
    }
}
