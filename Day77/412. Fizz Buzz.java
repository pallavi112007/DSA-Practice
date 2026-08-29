class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> list=new ArrayList<>();
        int count=0;
        for(int i=1;i<=n;i++)
        {
            count++;
            if(i%3==0 && i%5==0)
            {
                list.add("FizzBuzz");
            }
            else if(i%3==0)
            {
                list.add("Fizz");
            }
            else if(i%5==0)
            {
                list.add("Buzz");
            }
            else
            {
                String s=String.valueOf(count);
                list.add(s);
            }
        }
        return list;
    }
}
