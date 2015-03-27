package nyc.c4q.AnthonyFermin;

import java.util.Scanner;

/**
 * Class for Encoding and Decoding CaesarCiphers
 */
public class CaesarCipher {

    public static String decode(String enc, int offset) {
        return encode(enc, 26-offset);
    }

    public static String encode(String enc, int offset) {
        offset = offset % 26 + 26;
        StringBuilder encoded = new StringBuilder();
        for (char i : enc.toCharArray()) {
            if (Character.isLetter(i)) {
                if (Character.isUpperCase(i)) {
                    encoded.append((char) ('A' + (i - 'A' + offset) % 26 ));
                } else {
                    encoded.append((char) ('a' + (i - 'a' + offset) % 26 ));
                }
            } else {
                encoded.append(i);
            }
        }
        return encoded.toString();
    }

    //checks to see if both encoded strings were originally the same but encoded with different offsets of Caesar Cipher
    public static boolean codeBreaker(String encoded1, String encoded2){

        //nested for loops check every possible offset for caesar cipher and compares the two strings
        for (int i = 1; i <= 26; i++){
            for(int j = 1; j <= 26; j++){

                if(CaesarCipher.decode(encoded1,i).equals(CaesarCipher.decode(encoded2,j)) ){
                    return true; //this statement runs when both encoded strings get decoded to the same string
                }
            }
        }

        return false;
    }

    // method lists decoded versions of an encoded string using all possible offsets for Caesar Cipher
    public static void listAllDecodes(String encoded1){

        // This loop iterates from 1 to 26
        for(int i = 1; i <= 26; i ++){

            System.out.println(" " + i + ": " + decode(encoded1, i));

        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter a string to encode");
        String input = sc.nextLine();

        System.out.println("Enter the offset to encode with:");
        int offset = sc.nextInt();

        String encodedStr = CaesarCipher.encode(input, offset);
        System.out.println("Your encoded string is: \n" + encodedStr);

        System.out.println("Do you want to run the code breaker? [y/n]");
        char response = sc.next().charAt(0);
        sc.nextLine(); // This line is here so that the next sc.nextLine() works properly.

        if(response == 'y' || response == 'Y'){

            System.out.println("Enter the first encoded string: ");
            String firstEncoded = sc.nextLine();

            System.out.println("Enter the second encoded string: ");
            String secondEncoded = sc.nextLine();

            boolean hasMatch = codeBreaker(firstEncoded, secondEncoded); //storing result of codeBreaker method for later use

            // if the codeBreaker method finds a match, tells user that the two strings match the same decoded message.
            // then asks if the user wants to see all possible decoded versions of the strings (total of 26)
            if(hasMatch){
                System.out.println("Your two encoded strings match the same decoded message");

                System.out.println("Would you like to see all possible decoded messages? [y/n]");
                char response1 = sc.next().charAt(0);
                sc.nextLine(); // This line is here so that the next sc.nextLine() works properly.

                if(response1 == 'y' || response1 == 'Y'){
                    System.out.println();
                    listAllDecodes(firstEncoded);
                }

            }else{
                System.out.println("No match was found!");
            }

            System.out.println("\nHave a nice day!");
        }





    }
}