package it.codin.course.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class CustomerTest
{

  //Annotazione. In particolare, JUnit, tramite questa annotazione,
  //riconosce che il codice seguente e' di test e permette ad eclipse
  //di far comparire il 'tab' di test nel pannello a sinistra.
  @Test  
  public void test()
  {
    String firstname = "Emanuele";
    String lastname = "Segato";
    String email = "emanuele.segato@alice.it";
        
    Customer customer = new Customer(firstname, lastname, email);
    
    assertEquals(firstname, customer.getFirstname());
    assertEquals(lastname, customer.getLastname());
    assertEquals(email, customer.getEmail());
    
    assertNotNull(customer.getId());
  }
  
  @Test
  
  public void test_notsogood()
  {
    String firstname = "Cristiana";
    String lastname = "Cipriani";
    String email = "cristiana.cipriani@gmail.com.it";
        
    Customer customer = new Customer(firstname, lastname, email);
    
    assertEquals("Emanuele", customer.getFirstname());
    assertEquals(lastname, customer.getLastname());
    assertEquals(email, customer.getEmail());
    
    assertNotNull(customer.getId());
  }
}
