package it.codin.course.model;

import java.util.UUID;

public class Customer 
{
  private final String id;		    //get 
  private final String firstname;	//get 
  private final String lastname;	//get
  private String email;	        	//get set
    
  public Customer(String firstname, String lastname, String email) 
  {
  	super();
  	
  	this.id = UUID.randomUUID().toString();
  	
  	this.firstname = firstname;
  	this.lastname = lastname;
  	this.email = email;
  }
  
  public String getId() 
  {
    return this.id;
  }
  
  public String getFirstname() 
  {
    return this.firstname;
  }
  
  public String getLastname() 
  {
    return this.lastname;
  }
  
  public String getEmail() 
  {
    return this.email;
  }
  
  public void setEmail(String email) 
  {
	this.email = email;
  }
}
