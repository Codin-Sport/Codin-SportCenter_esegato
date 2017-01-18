package it.codin.course.model;

public enum FieldType
{
  TERRA ("TERRA"),
  ERBA ("ERBA"),
  SINTETICO ("SINTETICO"),
  SABBIA ("SABBIA");
  
  private String s;

  private FieldType(String s)
  {
    this.s = s;
  }

  @Override
  public String toString()
  {
    return s;
  }  
}
