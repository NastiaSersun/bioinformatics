/*
 * Copyright  * 
 *
 * $Header:  $
 * $Revision:  $
 * $Date:  $ 
 * 
 */
package bioinform.methods;

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

}
