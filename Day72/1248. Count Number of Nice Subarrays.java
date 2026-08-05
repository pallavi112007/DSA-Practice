class Solution {
    public int countArray(int[] nums, int k) {
        int left = 0;
        int count = 0;
        int sum = 0;

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                list.add(0);
            } else {
                list.add(1);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);

            while (sum > k) {
                sum -= list.get(left);
                left++;
            }

            count += i - left + 1;
        }

        return count;
    }

    public int numberOfSubarrays(int[] nums, int k) {
        return countArray(nums, k) - countArray(nums, k - 1);
    }
}
