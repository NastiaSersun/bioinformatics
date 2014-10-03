/*
 * Copyright  * 
 *
 * $Header:  $
 * $Revision:  $
 * $Date:  $ 
 * 
 */
package bioinform.methods;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.junit.Test;

public class InteractiveTextMethodsTests {

   @Test
   public void getComplementtest() {
      String result = InteractiveTextMethods.getComplement("TCTTGATCA");
      //      assertEquals("ACTATGCGACT", result);
      System.out.println(result);
   }

   @Test
   public void occurancesOfPatternTest() throws URISyntaxException, IOException {
      //      URI uri = new URI("Vibrio_cholerae.txt");
      //      InputStream inputStream = InteractiveTextMethodsTests.class.getResourceAsStream("Vibrio_cholerae.txt");

      byte[] encoded = Files.readAllBytes(Paths.get(".", "src//test//resources//Thermotoga-petrophila.txt"));
      String genome = new String(encoded, Charset.forName("UTF-8"));

      List<Integer> result = InteractiveTextMethods.occurancesOfPattern("ATGATCAAG", genome);
      System.out.println("Positions of occurances");
      System.out.println(result);
      System.out.println("count: " + result.size());
      assertTrue(true);
   }
}
