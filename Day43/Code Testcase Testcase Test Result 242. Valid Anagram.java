class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        ArrayList<Character> list=new ArrayList();
        for(int i=0;i<s.length();i++)
        {
            list.add(t.charAt(i));
        }
        for(int i=0;i<s.length();i++)
        {
            if(list.contains(s.charAt(i)))
            {
                list.remove(Character.valueOf(s.charAt(i)));
            }
        }
        return list.isEmpty();
    }
}
