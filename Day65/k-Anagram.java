class Solution {
    public boolean areKAnagrams(String s1, String s2, int k) {
        if(s1.length()!=s2.length())
        {
            return false;
        }
        int[] freq=new int[26];
        for(int i=0;i<s1.length();i++)
        {
            freq[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<s2.length();i++)
        {
            if(freq[s2.charAt(i)-'a']>0)
            {
                freq[s2.charAt(i)-'a']--;
            }
        }
        int c=0;
        for(int i=0;i<26;i++)
        {
            c+=freq[i];
        }
        return c<=k;
    }
}
