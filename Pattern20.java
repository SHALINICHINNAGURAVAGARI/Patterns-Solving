class Solution {
  public boolean isArmstrong(int n) {
    int temp = n;
    int r;
    int numDigits = String.valueOf(n).length();
    int sum = 0;
    while (n > 0) {
      r = n % 10;
      sum += Math.pow(r, numDigits);;
      n = n / 10;
    }
    return (temp == sum);
  }
}
