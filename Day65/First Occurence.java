class Solution {
    int firstOccurence(String txt, String pat) {
        int n=txt.length();
        int m=pat.length();
        for(int i=0;i<=n-m;i++)
        {
            int j=0;
            while(j<pat.length() && txt.charAt(i+j)==pat.charAt(j))
            {
                j++;
            }
            if(j==m)
            {
                return i;
            }
        }
        return -1;
    }
}
