class Solution {
  public void pattern14(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print((char) ('A' + j));
      }
      System.out.println();
    }
  }
}
