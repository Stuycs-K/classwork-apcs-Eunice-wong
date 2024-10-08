import java.util.Arrays;
public class ArrayDemo{
  public static void main(String[] args){
    int[] test1d = new int[]{1, 2, 3, 4};
    int[][] test2d = new int[4][2];
    System.out.println("expected:" + Arrays.toString(test1d) + "\nresult: " + aryToString(test1d));
    System.out.println("expected: [[0, 0], [0, 0], [0, 0], [0, 0]]\nresult: " + arrToString(test2d));
    int[][] zeroz = new int[][] {{0, 0}, {0, 0}, {0, 2}, {0, 0}};
    System.out.println("expected: 7\nresult: " + countZeros2D(zeroz));
    int[][] tester = new int[][] {{2, 4, 5}, {3, 4, 9}, {9, 19, 21}};
    int[][] empty = new int[4][2];
    System.out.println("expected: 76\nresult: " + arr2DSum(tester));
    System.out.println("expected: 0\nresult: " + arr2DSum(empty));
    int[][] tester1 = new int[][] {{2, 3, 4}, {6, 7, 8}};
    System.out.println("expected: [[2, 6], [3, 7], [4, 8]]\nresult: " + arrToString(swapRC(tester1)));
    int[][] negatives = new int[][] {{-9, 3, -8}, {0, -3, -4, 1}};
    replaceNegative(negatives);
    System.out.println("expected: [[1, 3, 0], [0, 1, 0, 1]]\nresult: " + arrToString(negatives));
    int[][] original = new int[][] {{2, 3, 4,}, {5, 6, 7}};
    int[][] dup = copy(original);
    original[0][0] = 99;
    System.out.println("expected: [[2, 3, 4], [5, 6, 7]]\nresult: " + arrToString(copy(dup)));
  }
  public static String aryToString(int[] nums) {
    String result = "[";
    for (int i=0; i<nums.length;i++) {
        result += nums[i];
      if (i<nums.length-1) {
      result += ", ";
      }
    }
    return result+"]";
  }

  public static String arrToString(int[][] ary){
    String result = "[";
    for (int i=0; i<ary.length;i++) {
        result += aryToString(ary[i]);
      if (i<ary.length-1) {
      result += ", ";
      }
    }
    return result+"]";
  }

  public static int countZeros2D(int[][] nums){
    int count = 0;
    for (int i = 0; i < nums.length; i++){
      for (int k = 0; k < nums[i].length; k++){
        if (nums[i][k] == 0){
          count += 1;
        }
      }
    }
    return count;
  }


  public static int arr2DSum(int[][]nums){
    int sum = 0;
    for(int i = 0; i < nums.length; i++){
      for(int k = 0; k < nums[i].length; k++){
          sum += nums[i][k];
      }
    }
    return sum;
  }

  public static int[][] swapRC(int[][]nums){
    int rows = nums.length;
    int columns = nums[0].length;
    int[][] result = new int[columns][rows];
    for(int i = 0; i < columns; i++){
      for(int k = 0; k < rows; k++){
        result[i][k] = nums[k][i];
      }
    }
    return result;
  }

  public static void replaceNegative(int[][] vals) {
    for (int i = 0; i < vals.length; i++) {
      for (int j = 0; j < vals[i].length; j++) {
        if (vals[i][j] < 0) {
          if (i==j) {
            vals[i][j] = 1;
          }
          else {
            vals[i][j] = 0;
          }
        }
      }
    }
  }

  public static int[][] copy (int[][] nums){
    int[][] copy = new int[nums.length][];
    for (int i = 0; i < nums.length; i++){
      copy[i] = new int[nums[i].length];
      for (int j = 0; j < nums[i].length; j++){
        copy[i][j] = nums[i][j];
      }
    }
    return copy;
  }

  public static String htmlTable(int[][]nums){
    String result = "<table>"
    for (int i = 0; i < nums.length; i++){
      for (int k = 0; k < nums[i].length; k++){
        if (k == 0){
          result = result + "<tr>";
        }
        else result = result + "<td>" + Arrays.toString(nums[i][k]) + "</td>";
        if (k == nums[i].length - 1){
          result = result + "</t"
      }
    }
  }
  return result + "<table>"
}
