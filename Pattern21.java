class Solution {
  public void pattern22(int n) {
    for (int i = 0; i < 2 * n - 1; i++) {
      for (int j = 0; j < 2 * n - 1; j++) {
        int top = i;
        int left = j;
        int right = (2 * n - 2) - j;
        int bottom = (2 * n - 2) - i;
        System.out.print(n - Math.min((Math.min(top, left)), Math.min(right, bottom))+" ");
      }
      System.out.println();
    }
  }
}
