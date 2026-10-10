class Solution {
    public static void pattern18(int n) {
        for(int i=1;i<=n;i++){
                    char ch= (char)('A'+n-i);

            for(char z=ch;z<='A'+n-1;z++){
                System.out.print(z+" ");
                
            }
            System.out.println();
        }

    }
}