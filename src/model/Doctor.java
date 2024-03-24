package model;

import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {
  //Atributo
  private String speciality;

  public Doctor(String name, String email){
    super(name,email);
    System.out.println("El nombre del model.Doctor asignado es: " + name);
    this.speciality = speciality;
  }

  public String getSpeciality() {
    return speciality;
  }

  public void setSpeciality(String speciality) {
    this.speciality = speciality;
  }
  @Override
  public String toString() {
  return super.toString() + "\nSpeciality: " + speciality + "\nAvailable: " + availableAppointments.toString();
  }



  ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
  //creo una arraylist de clase AvaibleAppoiment que es la clase interno que tengo en esta clase model.Doctor
  //arraylist tiene distintos metodos entre ellos .add que añade un objeto lo crea y guarda en avaibleAppoimentsList

  public void addAvaibleAppoiment(Date date, String time){
    availableAppointments.add(new Doctor.AvailableAppointment(date,time));
  }

  public ArrayList<AvailableAppointment> getAvailableAppointments(){
    return availableAppointments;
  }


  public static class AvailableAppointment{
    private int id;
    private Date date;
    private String time;

    public AvailableAppointment(Date date, String time) {
      this.date = date;
      this.time = time;
    }

    public int getId() {
      return id;
    }

    public void setId(int id) {
      this.id = id;
    }

    public Date getDate() {
      return date;
    }

    public void setDate(Date date) {
      this.date = date;
    }

    public String getTime() {
      return time;
    }

    public void setTime(String time) {
      this.time = time;
    }
    @Override
    public String toString(){
      return "Available Appointments \nDate: " + date + "\nTime: " + time;
    }
  }


}