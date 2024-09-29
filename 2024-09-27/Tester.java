public class Tester{
    public static void main(String[] args){
       int[] a = {4,5,6,7};
       int[] b = {-5, 90, 9};
       System.out.println("Expected [4, 5, 6, 7] vs my function:" + MyArrays.aryToString(a));
       System.out.println("Expected [-5, 90, 9] vs my function:" + MyArrays.aryToString(b));
       System.out.println("Expected " + MyArrays.aryToString(a) + " vs my function:" + MyArrays.aryToString(MyArrays.returnCopy(a)));
       System.out.println("Expected " + MyArrays.aryToString(b) + " vs my function:" + MyArrays.aryToString(MyArrays.returnCopy(b)));
       System.out.println("Expected [4, 5, 6, 7, -5, 90, 9] vs my function:" + MyArrays.aryToString(MyArrays.concatArray(a, b)));
    }
}
