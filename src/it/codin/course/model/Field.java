package it.codin.course.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Field
{
  private final String id;
  private String name; 
  private final List<String> sports;     
  private final List<Character> lockerRooms;
  private final FieldType type;
  
  public Field(String name, FieldType type)
  {
    super();    
    
    this.id = UUID.randomUUID().toString();
    this.sports = new ArrayList<>();
    this.lockerRooms = new ArrayList<>();
    
    this.name = name;    
    this.type = type;
  }

  public String getId()
  {
    return this.id;
  }
  
  public String getName()
  {
    return this.name;
  }
  
  public List<String> getSports()
  {
    return this.sports;
  }

  public String getSport(int index)
  {
    return this.sports.get(index);
  }
  
  public List<Character> getLockerRooms()
  {
    return lockerRooms;
  }

  public Character getLockerRoom(int index)
  {
    return lockerRooms.get(index);
  }
  
  public FieldType getType()
  {
    return type;
  }
  
  public void addSport(String sport)
  {
    sports.add(sport);
  }
  
  public void addlockerRoom(Character lockerRoom)
  {
    lockerRooms.add(lockerRoom);
  }

  public void setName(String name)
  {
    this.name = name;
  }

  @Override
  public String toString()
  {
    return this.name;
  }
}
