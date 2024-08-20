package org.example.String;

public class StringPrograms {

  /**
   * Reverse string
   * @param input
   */
  public static void reverseString(String input) {
    if (input.isEmpty()) {
      System.out.println("Given string is empty");
    } else {
      char[] in = input.toCharArray();
      StringBuilder sb = new StringBuilder();

      for(int i = in.length - 1; i >= 0; i--) {
        sb = sb.append(in[i]);
      }

      System.out.println("Reverse String = " + sb);
    }
  }

  /**
   * Reverse string using string builder method
   * @param input
   */
  public static void reverseString2(String input) {
    if (input.isEmpty()) {
      System.out.println("Given string is empty");
    } else {
      StringBuilder sb = new StringBuilder(input);

      System.out.println("Reverse String = " + sb.reverse());
    }
  }

  /**
   * If given string contains vowels
   * @param input
   */
  public static void containsVowels(String input) {
    if (input.isEmpty()) {
      System.out.println("Given string is empty");
    } else {
      if(input.toLowerCase().matches(".*[aeiou].*")) {
        System.out.println("Given string contains vowels");
      } else {
        System.out.println("Given string does not contains vowels");
      }
    }
  }

  /**
   * Check if word is Palindrome
   * @param word
   */
  public static void checkIfPalindrome(String word) {
    if (word.isEmpty()) {
      System.out.println("Given string is empty");
    } else {
      boolean isPalindrome = true;
      char[] arr = word.toLowerCase().toCharArray();
      for(int i = 0 ; i < word.length() ; i ++ ) {
        if (arr[i] != arr[(word.length()-1)-i]) {
          isPalindrome = false;
          System.out.println("Word is not palindrome");
          break;
        }
      }
      if(isPalindrome) {
        System.out.println("Word is palindrome");
      }
    }
  }

  /**
   * Remove spaces from String
   * @param input
   */
  public static void removeSpacesFromString(String input) {
    if (input.isEmpty()) {
      System.out.println("Given string is empty");
    } else {
      StringBuilder sb = new StringBuilder();
      char[] in = input.toCharArray();
      for(char c: in) {
        if(!Character.isWhitespace(c)) {
          sb.append(c);
        }
      }
      System.out.println(sb);
    }
  }

}
