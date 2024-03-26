package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {
  //Atributo
  private String speciality;

  public Doctor(String name, String email){
    super(name,email);
  }
  @Override
  public void showDataUser() {
    System.out.println("Hospital: cruz roja");
    System.out.println("Departamento: Oncología");
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

  public void addAvaibleAppoiment(String date, String time){
    availableAppointments.add(new Doctor.AvailableAppointment(date,time));
  }

  public ArrayList<AvailableAppointment> getAvailableAppointments(){
    return availableAppointments;
  }


  public static class AvailableAppointment{
    private int id;
    private Date date;
    private String time;
    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");


    public AvailableAppointment(String date, String time) {
      try {
        this.date = format.parse(date);
      } catch (ParseException e) {
        throw new RuntimeException(e);
      }
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
    public String getDate(String DATE) {
      return format.format(date);
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