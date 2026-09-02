

class Main {
    public static void main(String[] args) {
        String s="abs";
        int sum=0;
        for(int i=1;i<s.length();i++)
        {
            int n=(s.charAt(i)-96);
            int mul=(int)Math.pow(31,i);
            sum=sum+mul*n;
        }
        System.out.println(sum+(1*s.charAt(0)-96));
    }
}
