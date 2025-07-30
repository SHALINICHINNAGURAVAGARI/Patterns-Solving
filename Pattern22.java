class Solution {
  public void pattern18(int n) {
    for (int i = 0; i < n; i++) {
      char start = (char) ('A' + n - 1);
      for (char ch = (char)(start - i) ; ch <= start; ch++) {
        System.out.print(ch + " ");
      }
      System.out.println();
    }
  }
}
