class Solution {
    public static boolean checkPangram(String s) {
        HashSet<Character> list=new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=Character.toLowerCase(s.charAt(i));
            if(ch>='a' && ch<='z')
            {
                list.add(ch);
            }
        }
        return list.size()==26;
    }
}
