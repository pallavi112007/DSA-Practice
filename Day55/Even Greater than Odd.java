class Solution {
    // Method to rearrange the array
    public ArrayList<Integer> rearrangeArray(ArrayList<Integer> arr) {

        for (int i = 1; i < arr.size(); i++) {

            if (i % 2 == 0) {
                // Even index: arr[i] >= arr[i-1]
                if (arr.get(i) > arr.get(i - 1)) {
                    int temp = arr.get(i - 1);
                    arr.set(i - 1, arr.get(i));
                    arr.set(i, temp);
                }
            } else {
                // Odd index: arr[i] <= arr[i-1]
                if (arr.get(i) < arr.get(i - 1)) {
                    int temp = arr.get(i - 1);
                    arr.set(i - 1, arr.get(i));
                    arr.set(i, temp);
                }
            }
        }

        return arr;
    }
}
