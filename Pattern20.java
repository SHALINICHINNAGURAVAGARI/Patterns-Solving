class Solution {
  public void pattern19(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 1; j <= n - i; j++) {
        System.out.print("*");
      }
      for (int j = 0; j < 2 * i; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= n - i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      for (int j = 0; j < 2 * (n - i); j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
