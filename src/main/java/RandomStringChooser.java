import java.util.*;
public class RandomStringChooser
{
  /* to be implemented in part (a) */
  private ArrayList<String> words;
  public RandomStringChooser(String[] wordlist){
    for(int i=0;i<wordlist.length;i++)
      words.add(wordlist[i]);
  }
  public String getNext(){
    if(words.size()<=0)
      return "NONE";
    else{
      int indexrand=(int)(Math.random()*words.size());
      return words.get(indexrand);
      words.remove(indexrand);
    }
  }
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
}
