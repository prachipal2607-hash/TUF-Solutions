class Solution {
    public void pattern17(int n) {
        for (int i = 1; i <= n; i++) {
            // 1. Print leading spaces for alignment
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            
            // 2. Print increasing characters (up to the peak)
            char ch = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(ch++);
            }
            
            // 3. Print decreasing characters (down from the peak)
            ch -= 2; // Step back from the character just past the peak
            for (int j = 1; j < i; j++) {
                System.out.print(ch--);
            }
            
            // Move to the next line
            System.out.println();
        }
    }
}