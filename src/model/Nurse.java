package model;

public class Nurse extends User{
  private String speciality;
  public Nurse(String name, String email) {
    super(name, email);
  }

  @Override
  public void showDataUser() {
    System.out.println("Hospital: Cruz verde");
    System.out.println("Departamento: Pediatria");
  }

  public String getSpeciality() {
    return speciality;
  }

  public void setSpeciality(String speciality) {
    this.speciality = speciality;
  }
}
