import model.Doctor;
import model.Patient;

import java.util.Date;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
  public static void main(String[] args) {

    Doctor myDoctor = new Doctor("Esteban", "este@oelopues");
    myDoctor.addAvaibleAppoiment(new Date(), "4pm");
    myDoctor.addAvaibleAppoiment(new Date(), "10pm");
    myDoctor.addAvaibleAppoiment(new Date(), "1pm ");

   /* for (model.Doctor.AvailableAppointment aA:myDoctor.getAvailableAppointments()) {
      System.out.println(aA.getDate() + " " + aA.getTime());
    }*/

    Patient patient = new Patient("Alejadra socorro", "a@mamadas.com");
    System.out.println(myDoctor);
  }
}
