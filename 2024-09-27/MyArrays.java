public class MyArrays{
  public static String aryToString(int[] nums){
    String result = "";
    for (int i = 0; i < nums.length; i++){
      if (i == nums.length - 1){
        result = result + nums[i];
      }
      else result = result + nums[i] + ", ";
    }
    return "[" + result + "]";
  }
  public static int[] returnCopy(int[]ary){
    int[] duplicate = new int[ary.length];
    for (int i = 0; i < ary.length; i++){
      duplicate[i] = ary[i];
    }
    return duplicate;
  }
  public static int[] concatArray(int[]ary1, int[]ary2){
    int[] dup = new int[ary1.length + ary2.length ];
    for (int i = 0; i < ary1.length; i++){
      dup[i] = ary1[i];
    }
    for (int i = 0; i < ary2.length; i++){
      dup[ary1.length + i] = ary2[i];
    }
    return dup;
    }
  }
