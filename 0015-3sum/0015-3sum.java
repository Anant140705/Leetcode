class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            HashMap<Integer, Integer> map = new HashMap<>();

            for (int j = i + 1; j < nums.length; j++) {

                int needed = -nums[i] - nums[j];

                if (map.containsKey(needed)) {

                    List<Integer> triplet = Arrays.asList(
                        nums[i],
                        needed,
                        nums[j]
                    );

                    Collections.sort(triplet);

                    set.add(triplet);
                }

                map.put(nums[j], j);
            }
        }

        return new ArrayList<>(set);
    }
}