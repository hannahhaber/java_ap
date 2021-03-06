import java.util.Scanner;

class Assignment4 {
  public static void main(String[] args) {
        
    Scanner scan = new Scanner(System.in);
    System.out.println("Type the message to be shortened");
    String message = scan.nextLine();
    message = message.toLowerCase();

    
    // Algorithm 1
    
    String currentChar;
    String vowels = "aeiou";
    int countVow = 0;
    int countReps = 0;
    String msg = "";
    String previChar = "";
    Boolean AllowVowel;
    
    for (int i = 0; i < message.length(); i++ ){
      currentChar = message.substring(i,i+1);

      AllowVowel = !(i == 0 || previChar.equals(" "));
      
      if(vowels.contains(currentChar) && AllowVowel){
        countVow = countVow + 1;
      
      }else if (currentChar.equals(previChar)){
        countReps = countReps + 1;
        
      }else{
        msg = msg + currentChar;
      }
      
      previChar = currentChar;
    }
    System.out.println("");
    System.out.println("Algorithm 1");
    System.out.println("Vowels removed: "+ countVow);
    System.out.println("Repeats removed: " + countReps);
    System.out.println("Algorithm 1 message: " + msg);
    System.out.println("Algorithm 1 characters saved: " + (message.length()- msg.length()));
    
    
    // Algorithm 2
    Boolean seenChar;
    String checkChar;
    msg = "";
    int countLetter;
    int uniCharCount = 0;

    for(int i = 0; i < message.length(); i++) {
      
      //Get the currentChar we're working on
      currentChar = message.substring(i,i+1);

      //Skip the spaces
      if(!(currentChar.equals(" "))){

        //Check if we've seen currentChar before up to the letter we are at
        seenChar = false;
        for(int j = 0; j < i; j++){
          checkChar = message.substring(j,j+1);
          if(currentChar.equals(checkChar))
          {
            seenChar = true;     
          }
        }
        //If we have not, go through the rest of the string and check for it
        
        if(seenChar == false){
          countLetter = 0;
          uniCharCount = uniCharCount + 1;
          for (int j = i; j< message.length(); j++){
            checkChar = message.substring(j,j+1);
            if(currentChar.equals(checkChar)){
              countLetter = countLetter + 1;
            }
          }
          msg = msg + countLetter + currentChar;
        }
      
      
      }
    }//for(int i = 0; i < message.length(); i++)
    System.out.println("");
    System.out.println("Alogirthm 2");
    System.out.println("Unique characters found: " + uniCharCount);
    System.out.println("Algorithm 2 message: " + msg);
    System.out.println("Algorithm 2 characters saved: " + (message.length()- msg.length()));
     
  }
}