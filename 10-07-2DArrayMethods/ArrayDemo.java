public class ArrayDemo{
  public static void main(String[] args){
    return 1;
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
      for (int k = 0; k < nums[i].length; i++){
        if (nums[i][k] == 0){
          count += 1;
        }
      }
    }
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
}
