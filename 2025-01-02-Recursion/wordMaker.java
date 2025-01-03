public class wordMaker{
  public static void makeWords(int remainingLetters, String result, String alphabet){
    for(int i = 0; i < alphabet.length(); i++){
      if (alphabet.equals("")){
        return result;
      }
      if(remainingLetters > 1){
        return makeWords(remainingLetters - 1, result + alphabet.charAt(i), alphabet)
      }
      else return result + alphabet;
    }
  }
}
