package q06;

public class Staff {
    String NIC;
    String Name;
    String Email;
    int ContactNumber;


    String UniversityID;
   private double Salary;
    String Department;

    public Staff(String NIC, String name, String email, int contactNumber, String universityID, double salary, String department) {
        this.NIC = NIC;
        Name = name;
        Email = email;
        ContactNumber = contactNumber;
        UniversityID = universityID;
        Salary = salary;
        Department = department;
    }

    public void displayStaffInfo(){
        System.out.println(NIC);
        System.out.println(Name);
        System.out.println(Email);
        System.out.println(ContactNumber);
        System.out.println(UniversityID);
        System.out.println(Salary);
        System.out.println(Department);
    }

    public void sallaryIncrement(){
        if (Department=="Computer Science"){
            this.Salary = Salary + Salary*0.05;
        }
    }

}
