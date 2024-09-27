public class MyArrays{
  public static String aryToString(int[] nums){
    String result = "";
    for (int i = 0; i < nums.length; i++){
      if (i == nums.length - 1){
        result = result + nums[i];
      }
      result = result + nums[i] + ",";
    }
    return "[" + result + "]";
  }
  public static int[] returnCopy(int[]ary){
    int copy = 0;
    int[] duplicate = new int[ary.length];
    for (int i = 0; i < ary.length; i++){
      copy = ary[i];
      duplicate[i] = copy;
    }
    return duplicate;
  }
  public static int[] concatArray(int[]ary1, int[]ary2){
    return ary1;
    }
  }
