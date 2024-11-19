import java.util.ArrayList;
public class ArrayListPractice{
  public static ArrayList<String>createRandomArray(int size){
    ArrayList<String>result = new ArrayList<String>(size);
    String stored = "";
    for(int i = 0; i < size; i++){
      stored += (int)(Math.random() * 11);
      if (stored.equals("0")){
        stored = "";
      }
      result.add(stored);
      stored = "";
    }
    return result;
  }
  public static void replaceEmpty(ArrayList<String> original){
    for(int i = 0; i < original.length; i++){
      original.add(original.indexOf(""), "Empty");
    }
    return original;
  }
  public static ArrayList<String> makeReversedList( ArrayList<String> original){
    for (int i = 0; i < original.length; i++){
        original.set(i, original.get(original.length - i));
    }
    return original;
  }
  public static ArrayList<String> mixLists( ArrayList<String> a,  ArrayList<String> b){
    ArrayList<String>result = new ArrayList<String>(a.length + b.length);
    int length = b.length * 2;
    int total = b.length + a.length;
    int reset = b.length;
  if (a.length < b.length){
    for (int i = 0; i < length; i++){
        result.set(i, a.get(i));
        i++;
        result.set(i, b.get(i));
    }
    for (int i = length; i < total; i++){
        result.set(i, b.get(reset));
        reset++;
    }
    return result;
  }
    if (a.length > b.length){
    for (int i = 0; i < length; i++){
        result.set(i, a.get(i));
        i++;
        result.set(i, b.get(i));
    }
    for (int i = length; i < total; i++){
        result.set(i, a.get(reset));
        reset++;
    }
    return result;
  }
} 
  public static void main(String[] args){
    System.out.println(createRandomArray(30));
    System.out.println(replaceEmpty(createRandomArray(300000)));
  }
}
