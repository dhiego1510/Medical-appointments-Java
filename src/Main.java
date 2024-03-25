import model.Doctor;
import model.Patient;
import model.User;

import java.util.Date;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
  public static void main(String[] args) {

    Doctor myDoctor = new Doctor("Esteban", "este@oelopues");
    myDoctor.addAvaibleAppoiment(new Date(), "4pm");
    myDoctor.addAvaibleAppoiment(new Date(), "10pm");
    myDoctor.addAvaibleAppoiment(new Date(), "1pm ");


    User user1 = new User("ANdres", "a@aa.com") {
      @Override
      public void showDataUser() {
        System.out.println("DOctor\n");
        System.out.println("Hospital : cruz verde ");
        System.out.println("Departamento: Cirujno");
      }
    };
    user1.showDataUser();

   /* for (model.Doctor.AvailableAppointment aA:myDoctor.getAvailableAppointments()) {
      System.out.println(aA.getDate() + " " + aA.getTime());
    }*/

    Patient patient = new Patient("Alejadra socorro", "a@mamadas.com");
    System.out.println(myDoctor);
  }
}
