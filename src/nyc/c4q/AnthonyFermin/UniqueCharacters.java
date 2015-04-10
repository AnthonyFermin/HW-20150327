package nyc.c4q.AnthonyFermin;

/**
 * Anthony Fermin
 * Access Code HW3 - UniqueCharacters
 * Class contains a method to return a string of unique characters contained within a larger string of characters
 * ie: apple return aple
 */

import java.util.Scanner;

public class UniqueCharacters {

    //returns a string of unique characters based on characters within text variable
    public static String uniqueCharacters(String text){
        String uniqueText = "";

        // loops through the length of the text variable
        for( int i = 0; i < text.length(); i++ ){


            if( uniqueText.contains(String.valueOf(text.charAt(i))) ){
                continue;
            }else{
                uniqueText += text.charAt(i);
            }

        }

        return uniqueText;
    }

    // main method to test uniqueCharacters method
    public static void main( String[] args ) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a string of text: ");
        String userText = in.nextLine();
        String uniqueText = uniqueCharacters( userText );
        System.out.println(userText + " ----> " + uniqueText);

    }
}
