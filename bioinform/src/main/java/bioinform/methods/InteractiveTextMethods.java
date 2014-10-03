/*
 * Copyright  * 
 *
 * $Header:  $
 * $Revision:  $
 * $Date:  $ 
 * 
 */
package bioinform.methods;

import java.util.ArrayList;
import java.util.List;

public class InteractiveTextMethods {

   public static String getComplement(String dna) {
      dna = dna.toLowerCase();
      char[] complementDNA = new char[dna.length()];
      char[] arrayDNA = dna.toCharArray();
      int length = arrayDNA.length;
      for (int i = 0; i < length; i++) {
         int index = length - i - 1;
         switch (arrayDNA[i]) {
            case 'a':
               complementDNA[index] = 't';
               break;
            case 't':
               complementDNA[index] = 'a';
               break;
            case 'g':
               complementDNA[index] = 'c';
               break;
            case 'c':
               complementDNA[index] = 'g';
               break;
         }
      }

      return (new String(complementDNA)).toUpperCase();
   }

   public static List<Integer> occurancesOfPattern(String pattern, String genome) {
      int length = genome.length() - pattern.length();
      if (length < 0)
         return null;
      if (length == 0) {
         if (genome.equals(pattern)) {
            List<Integer> occurancePositions = new ArrayList<Integer>();
            occurancePositions.add(new Integer(0));
            return occurancePositions;
         }
         else
            return null;
      }

      List<Integer> occurancePositions = new ArrayList<Integer>();

      int index = 0;

      while (index <= length) {
         int i = genome.indexOf(pattern, index);
         if (i > -1) {
            occurancePositions.add(new Integer(i));
            if (i < length)
               index = i + 1;
            else
               break;
         }
         else
            break;
      }
      return occurancePositions;
   }

   public static List<String> test() {
      return null;
   }
}
