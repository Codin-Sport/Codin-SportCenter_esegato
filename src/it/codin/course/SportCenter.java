package it.codin.course;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import it.codin.course.model.Customer;
import it.codin.course.model.Field;
import it.codin.course.model.FieldType;
import it.codin.course.model.Reservation;

public class SportCenter
{
  public static void main (String args[])
  {
    System.out.println("Benvenuto nel centro sportivo Codin");
    
    //1 Creare una lista di campi da gioco
    List<Field> fieldsList = new ArrayList<>();
    
    fieldsList.add(new Field("Campo - Est", FieldType.ERBA));
    fieldsList.add(new Field("Campo - Ovest", FieldType.TERRA));
    fieldsList.add(new Field("Campo - Nord", FieldType.SABBIA));
    fieldsList.add(new Field("Campo - Sud", FieldType.SINTETICO));
        
    //1a Stampare una lista di campi da gioco
    System.out.println();
    System.out.println("Campi disponibili: ");
    for (Field f : fieldsList)
    {
      System.out.println(f.toString());
    }
    
    //2 Creare una lista di utenti
    List<Customer> customersList = new ArrayList<>();
    customersList.add(new Customer("Emanuele", "Segato", "emanuele.segato@alice.it"));
    customersList.add(new Customer("Cristiana", "Cipriani", "cristiana.cipriani@gmail.com"));
    
    //2a Stampare una lista di utenti
    System.out.println();
    System.out.println("Utenti registrati: ");
    for (Customer c : customersList)
    {
      System.out.println(c.toString());
    }
    
    //3 Creare una prenotazione
    List<Reservation> reservationsList = new ArrayList<>();
    
    Customer c = customersList.get(0);
    Field f = fieldsList.get(2);
    LocalDateTime startEvent = LocalDateTime.of(2017,12,25,20,00);
    LocalDateTime endEvent = LocalDateTime.of(2017,12,25,21,30);
    
    Reservation reservation = new Reservation(f, c, startEvent, endEvent);
    
    reservationsList.add(reservation);
    
    //3a Stampare una lista di utenti
    System.out.println();
    System.out.println("Registrazioni attive: ");
    for (Reservation r : reservationsList)
    {
      System.out.println(r.toString());
    }
    
    //ToDo
    //Aggiungi un'altra prenotazione
    //Cancella la prima prenotazione
    //Modifica il campo da gioco dell'ultima prenotazione
    //Ristampa la lista aggiornata delle prenotazioni
    
  }
}
