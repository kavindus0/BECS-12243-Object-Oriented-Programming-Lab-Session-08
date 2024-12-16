package q06;

import java.sql.PseudoColumnUsage;

public class Student {
    String NIC;
    String Name;
    String Email;
    int ContactNumber;
    String UniversityID;
    short AcademicYr;
   private double GPA;
    String Path;

    public Student(String NIC, String name, String email, int contactNumber, String universityID, short academicYr, int GPA, String path) {
        this.NIC = NIC;
        Name = name;
        Email = email;
        ContactNumber = contactNumber;
        UniversityID = universityID;
        AcademicYr = academicYr;
        this.GPA = GPA;
        Path = path;
    }

    public void displayStaffInfo(){
        System.out.println(NIC);
        System.out.println(Name);
        System.out.println(Email);
        System.out.println(ContactNumber);
        System.out.println(UniversityID);
        System.out.println(AcademicYr);
        System.out.println(GPA);
        System.out.println(Path);
    }

    void GpaIncrease(){
        if (this.AcademicYr == 2){
            GPA+=0.0001;
        }
    }

}
