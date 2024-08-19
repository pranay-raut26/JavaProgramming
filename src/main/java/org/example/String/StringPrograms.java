package org.example.String;

import java.util.Objects;

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


}
