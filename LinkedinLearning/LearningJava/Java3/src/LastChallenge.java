public class LastChallenge {

    public static void main(String[] args){  // bellow are instances
        StudentProfile profileOne = new StudentProfile( "Sally", "Salmon", "Film", 3.7,
                2022);
        StudentProfile profileTwo = new StudentProfile("Max", "Tiffen", "Computer Science",
                3.4, 2021);

        profileTwo.incrementExpectedGraduationYear();
        System.out.println(profileTwo.expectedYearToGraduate);
    }
}
