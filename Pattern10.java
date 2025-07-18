class Solution {
  public void pattern10(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    for (int p = 1; p < n; p++) {
      for (int m = 1; m <= n - p; m++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
