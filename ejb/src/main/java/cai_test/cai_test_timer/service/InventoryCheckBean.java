package cai_test.cai_test_timer.service;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;
import java.util.logging.Logger;

import javax.ejb.Schedule;
import javax.ejb.Stateless;

@Stateless
public class InventoryCheckBean {
  private static final String PRODUCT_URL = "http://www.amazon.com/dp/B002BSA298/";
  private static final String IN_STOCK = "In Stock";

  @SuppressWarnings("unused")
  @Schedule(dayOfWeek = "0-5", hour = "7-17", minute = "*", timezone = "America/Los_Angeles")
  private void checkInventory() {
	  System.out.println("***************output every minute***************");
      /*
	  BufferedReader br = null;
      try {
          String line = null;
          URL url = new URI(PRODUCT_URL).toURL();
          br = new BufferedReader(new InputStreamReader(url.openStream()));
          while ((line = br.readLine()) != null) {
              if(line.indexOf(IN_STOCK) >= 0) {
                  //email notify
                  Logger.getLogger("").info(line);
                  break;
              }
          }
      } catch (Exception e) {
          throw new RuntimeException(e);
      } finally {
          if(br != null) {
              try {
                  br.close();
              } catch (IOException e) { //ignore
              }
          }
      }
      */
  }
}