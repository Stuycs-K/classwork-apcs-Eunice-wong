import java.util.ArrayList;
public class ArrayListPractice{
  public static ArrayList<String>createRandomArray(int size){
    ArrayList<String> result = new ArrayList<String>(size);
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
    for(int i = 0; i < original.size(); i++){
      if (original.get(i).equals("")){
        original.set(i, "Empty");
      }
    }
    return original;
  }
  public static ArrayList<String> makeReversedList( ArrayList<String> original){
    ArrayList<String> reversed = new ArrayList<>();
    for(int i = original.size() - 1; i >= 0 ; i --){
        reversed.add(original.get(i));
    }
    return reversed;
  }
  public static ArrayList<String> mixLists( ArrayList<String> a,  ArrayList<String> b){
    ArrayList<String>result = new ArrayList<String>(a.size() + b.size());
    int minSize = Math.min(a.size(), b.size());
    for(int i = 0; i < minSize; i++){
        result.add(a.get(i));
        result.add(b.get(i));
    }
    if (a.size() > minSize){
        result.addAll(a.subList(minSize, a.size()));
    }
    if (b.size() > minSize){
        result.addAll(b.subList(minSize, b.size()));
    }
    return result;
  }
  public static void main(String[] args){
    System.out.println(createRandomArray(30));
    System.out.println(replaceEmpty(createRandomArray(300000)));
  }
}
