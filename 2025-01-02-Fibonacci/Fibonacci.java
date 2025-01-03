public class Fibonacci{
  public static int fib(int n){
    if (n > 1){
      return fib(n-1) + fib(n-2);
    }
    return n;
  }
  public static void main(String[] args){
    System.out.println(fib(46));
  }
}
