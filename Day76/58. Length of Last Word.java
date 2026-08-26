class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        if(s.length()==1)
        {
            return 1;
        }
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)==' ')
            {
                if(count>0)
                {
                    return count;
                }
            }
            else
            {
                count++;
            }
        }
        return count;
    }
}
