class Solution {

    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map1 = new HashMap<>();

        for(int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(int i = 0; i < magazine.length(); i++) {
            char ch = magazine.charAt(i);
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }

        for(int i = 0; i < ransomNote.length(); i++) {

            char ch = ransomNote.charAt(i);

            if(!map1.containsKey(ch)) {
                return false;
            }

            if(map1.get(ch) < map.get(ch)) {
                return false;
            }
        }

        return true;
    }
}
