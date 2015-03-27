package nyc.c4q.AnthonyFermin;

import java.util.Scanner;

public class UniqueCharacters {

    public static String uniqueCharacters(String text){
        String uniqueText = "";

        for(int i = 0; i < text.length(); i++){
            if(uniqueText.contains(text.charAt(i) + "")){
                continue;
            }else{
                uniqueText += text.charAt(i);
            }

        }

        return uniqueText;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a string of text: ");
        String userText = in.nextLine();
        String uniqueText = uniqueCharacters(userText);
        System.out.println(userText + " ----> " + uniqueText);

    }
}
