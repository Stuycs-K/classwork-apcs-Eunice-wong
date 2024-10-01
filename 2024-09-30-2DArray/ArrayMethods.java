//Jessie Wang jessiew27@nycstudents.net
//Eunice Wong eunicew4@nycstudents.net
//Axel Stahl axels21@nycstudents.net

public class ArrayMethods {
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

  public static void main(String[] args){
    int[] test1d = new int[]{1, 2, 3, 4};
    int[][] test2d = new int[4][2];
    System.out.println("expected: [1, 2, 3, 4]\nresult: " + aryToString(test1d));
    System.out.println("expected: [[0, 0], [0, 0], [0, 0], [0, 0]]\nresult: " + arrToString(test2d));
    int[][] tester = new int[][] {{2, 4, 5}, {3, 4, 9}, {9, 19, 21}};
    int[][] empty = new int[4][2];
    System.out.println("expected: 76\nresult: " + arr2DSum(tester));
    System.out.println("expected: 0\nresult: " + arr2DSum(empty));
    int[][] tester1 = new int[][] {{2, 3, 4}, {6, 7, 8}};
    System.out.println("expected: [[2, 6], [3, 7], [4, 8]]\nresult: " + arrToString(swapRC(tester1)));
  }
}
