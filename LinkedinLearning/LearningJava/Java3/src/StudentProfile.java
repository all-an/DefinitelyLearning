public class StudentProfile {
    String firstName;
    String lastName;
    String declaredMajor;
    double gpa;
    int expectedYearToGraduate;

    public StudentProfile(String firstName, String lastName,  //parameters of a class that will match back to attributes
                          String declaredMajor, double gpa, int expectedYearToGraduate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.declaredMajor = declaredMajor;
        this.gpa = gpa;
        this.expectedYearToGraduate = expectedYearToGraduate;
    }

    public void incrementExpectedGraduationYear(){    //without parameters
        this.expectedYearToGraduate = this.expectedYearToGraduate + 1; // this access the value of a variable
    }
}
