/*
 * Copyright  * 
 *
 * $Header:  $
 * $Revision:  $
 * $Date:  $ 
 * 
 */
package bioinform.methods;

import org.junit.Test;

public class InteractiveTextMethodsTests {

   //   Logger LOGGER = LoggerFactory.getLogger(InteractiveTextMethods.class);

   @Test
   public void getComplementtest() {
      String result = InteractiveTextMethods.getComplement("TCTTGATCA");
      //      LOGGER.info(result);
      //      assertEquals("ACTATGCGACT", result);
      System.out.println(result);
   }
}
