package GreenFox;

public class Student extends Person {

  private String previousOrganization;
  private int skippedDays;

  public Student(String name, int age, String gender, String previousOrganization) {
    super(name, age, gender);
    this.previousOrganization = previousOrganization;
    skippedDays = 0;
  }

  public Student() {
    super("Jane Doe", 30, "female");
    previousOrganization = "The School of life";
    skippedDays = 0;
  }

  @Override
  public void getGoal() {
    System.out.println("Be a junior software developer.");
  }

  @Override
  public void introduce() {
    System.out.println(
        "Hi I'm " + super.getName() + ", a " + super.getAge() + " year old " + super.getGender() +
            " from " + this.previousOrganization + " who skipped " + this.skippedDays +
            "days from the course already.");
  }

  public int skipDays(int numberOfDays) {
    return this.skippedDays + numberOfDays;
  }
}

