package ui;

import model.Doctor;
import model.Patient;

import javax.print.Doc;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
public class UIMenu {
  public static final String[] MONTHS = {"January","February","March","April","May","June","July","August",
          "September","October","November","December"};
  public static Doctor doctorLogged;
  public static Patient patientLogged;
   public static void showMenu(){
    System.out.println("Welcome to My Appointments");
    System.out.println("Selecciona la opción deseada");

    int response = 0;
    do {
      System.out.println("1. Doctor");
      System.out.println("2. Patient");
      System.out.println("0. Salir");

      Scanner sc = new Scanner(System.in);
      response = Integer.valueOf(sc.nextLine());

      switch (response){
        case 1:
          System.out.println("Doctor");
          response = 0;
          autUser(1);
          break;
        case 2:
          response = 0;
          autUser(2);

          break;
        case 0:
          System.out.println("Thank you for you visit");
          break;
        default:
          System.out.println("Please select a correct answer");
      }
    }while (response != 0);
  }

  private static void autUser(int userType ){

    ArrayList<Doctor> doctors = new ArrayList<>();
    doctors.add(new Doctor("Alejandro Martinez", "ale@doctor.com"));
    doctors.add(new Doctor("Karen Sosa", "karen@doctor.com"));
    doctors.add(new Doctor("Rocio Gomez", "rocio@doctor.com"));


    ArrayList<Patient> patients = new ArrayList<>();
    patients.add(new Patient("Sonia Fonseca", "sonia@gmail.com"));
    patients.add(new Patient("Carlos Valle", "carl@gmail.com"));
    patients.add(new Patient("Pedro Rios", "pedro@gmail.com"));

    boolean emailCorrect = false;
    do {
      System.out.println("Inser your email: ");
      Scanner sc = new Scanner(System.in);
      String email = sc.nextLine();
      if(userType == 1) {

        for (Doctor d: doctors){
          if(d.getEmail().equals(email)){
            emailCorrect = true;
            doctorLogged = d;
            UIDoctorMenu.showDoctorMenu();
          }
        }
      }

      if(userType == 2) {

        for (Patient p: patients) {
          if(p.getEmail().equals(email)) {
            emailCorrect = true;
            patientLogged = p;
            UIPatientMenu.showPatientMenu();
          }
        }
      }


    }while(!emailCorrect);


  }

  static void showPatientMenu(){
    int response = 0;
    do {
      System.out.println("\n\n");
      System.out.println("model.Patient");
      System.out.println("1. Book an appointment");
      System.out.println("2. My appointments");
      System.out.println("0. Return");

      Scanner sc = new Scanner(System.in);
      response = Integer.valueOf(sc.nextLine());

      switch (response){
        case 1:
          System.out.println("::Book an appointment");
          for (int i = 0; i < 3 ; i++) {
            System.out.println((i+1) + ". " + MONTHS[i]);
          }
          break;
        case 2:
          System.out.println("::My appointments");
          break;
        case 0:
          showMenu();
          break;
      }
    }while (response != 0);
  }
}
