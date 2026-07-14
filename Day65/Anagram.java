class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        if(s1.length()!=s2.length())
        {
            return false;
        }
        HashMap<Character,Integer> map=new HashMap<>();
        HashMap<Character,Integer> map1=new HashMap<>();
        for(int i=0;i<s1.length();i++)
        {
            map.put(s1.charAt(i),map.getOrDefault(s1.charAt(i),0)+1);
        }
        for(int i=0;i<s2.length();i++)
        {
            map1.put(s2.charAt(i),map1.getOrDefault(s2.charAt(i),0)+1);
        }
        return map.equals(map1);
    }
}
