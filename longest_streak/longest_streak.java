import java.util.Scanner;

class longest_streak {
  public static void main(String[] args) {
        
    String str = "HHHHHOOOOOOLLLLLLLLLAAAAHAAHAHAHAHAHAHAHAHFIAUFGHIAHHHHHHHHHFHFHFFHH";

    //Letting the Doing the Big Code Begin!!!

    if (str.length() <= 0){
      System.out.print("String Empty");
      return;
    }

    int CurrentStreakLen = 1;
    String currentStreakChar = str.substring(0,1);
    int maxStreakLen = CurrentStreakLen;
    String streakChar = currentStreakChar;
    String currentChar = "";
    
    for (int i = 1; i < str.length(); i++){
      currentChar = str.substring(i,i+1);
      if(currentStreakChar.equals(currentChar)){
        CurrentStreakLen ++;
      }else {

        //if this streak is the longest, "save off" the max length
        if (CurrentStreakLen > maxStreakLen){
          maxStreakLen = CurrentStreakLen;
          streakChar = currentStreakChar;
        }

        //now reset the the current streak variables to the new letter and the streak length to one
        currentStreakChar = currentChar;
        CurrentStreakLen = 1;
      }
     

    }
    System.out.print(streakChar);
    System.out.print(" " + maxStreakLen);
  }
}