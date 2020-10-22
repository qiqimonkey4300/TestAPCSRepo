public class Demo {
  public static void main(String args[]) {
    if (args.length != 0) {
      printLoop(Integer.valueOf(args[0]));
    } else {
      printLoop(5);
    }
    int[] zero = {};
    int[] one = {1};
    int[] two = {1, 2};
    int[] three = {1, 2, 3};
    int[] four = {1, 2, 3, 4};
    int[][] d = new int[5][];
    d[0] = zero;
    d[1] = one;
    d[2] = two;
    d[3] = three;
    d[4] = four;
    System.out.println(arrayDeepToString(d));
  }
  public static void printLoop(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = n; j >= i; j--) {
        System.out.print(i);
      }
      System.out.println();
    }
  }
  public static String arrToString(int[] arr) {
    String x = "{";
    for (int i = 0; i < arr.length - 1; i++) {
      x = x + String.valueOf(arr[i]) + ", ";
    }
    if (arr.length > 0) {
      x = x + String.valueOf(arr[arr.length - 1]);
    }
    x = x + "}";
    return x;
  }
  public static String arrayDeepToString(int[][] arr) {
    String y = "{";
    for (int i = 0; i < arr.length - 1; i++) {
      y = y + arrToString(arr[i]) + ", ";
    }
    if (arr.length > 0) {
      y = y + String.valueOf(arrToString(arr[arr.length - 1]));
    }
    y = y + "}";
    return y;
  }
}
