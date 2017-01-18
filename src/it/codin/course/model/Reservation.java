package it.codin.course.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Reservation
{
  private final String id;
  private Field field;
  private final Customer customer;
  private final LocalDateTime createReservationDate;
  private LocalDateTime updateReservationDate;
  private LocalDateTime startEventDate;
  private LocalDateTime endEventDate;  
  private List<String> notes;
  
  public Reservation(Field field, Customer customer, LocalDateTime startEventDate,
      LocalDateTime endEventDate)
  {
    super();
    
    this.id = UUID.randomUUID().toString();
    
    this.field = field;
    this.customer = customer;
    this.createReservationDate = LocalDateTime.now();
    this.updateReservationDate = LocalDateTime.now();
    this.startEventDate = startEventDate;
    this.endEventDate = endEventDate;
    this.notes = new ArrayList<>();
  }

  public LocalDateTime getUpdateReservationDate()
  {
    return updateReservationDate;
  }

  public void setUpdateReservationDate(LocalDateTime updateReservationDate)
  {    
    this.updateReservationDate = updateReservationDate;
  }

  public LocalDateTime getStartEventDate()
  {
    return startEventDate;
  }

  public void setStartEventDate(LocalDateTime startEventDate)
  {
    this.notes.add(String.format("Aggiornato campo da %s a %s",
        this.startEventDate,startEventDate));
    this.updateReservationDate = LocalDateTime.now();
    this.startEventDate = startEventDate;
  }

  public LocalDateTime getEndEventDate()
  {
    return endEventDate;
  }

  public void setEndEventDate(LocalDateTime endEventDate)
  {
    this.notes.add(String.format("Aggiornato campo da %s a %s",
        this.endEventDate,endEventDate));    
    this.updateReservationDate = LocalDateTime.now();
    this.endEventDate = endEventDate;
  }

  public String getLastNote()
  {
    return notes.get(notes.size()-1);
  }

  public void addNote(String note)
  {
    this.updateReservationDate = LocalDateTime.now();
    this.notes.add(note);;
  }

  public String getId()
  {
    return id;
  }

  public Field getField()
  {
    return field;
  }
  
  public void setField(Field field)
  {
    this.notes.add(String.format("Aggiornato campo da %s a %s",
        this.field.toString(),field.toString()));
    
    this.updateReservationDate = LocalDateTime.now();
    this.field = field;
  }

  public Customer getCustomer()
  {
    return customer;
  }

  public LocalDateTime getCreateReservationDate()
  {
    return createReservationDate;
  }   
}
