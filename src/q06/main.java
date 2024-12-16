package q06;

public class main {
    public static void main(String[] args) {
        Staff drSaman = new Staff("1111","Dr. Saman Perera","sasasa@sasa.ss",725196700,"U001",2500,"Computer Science");

        Student nilanka = new Student("9999","Ms. Nilanka Silva","nils@stu.kln.ac.lk",726677555,"PS/2016/001", (short) 2,5,"Royal");

        drSaman.displayStaffInfo();
        System.out.println();
    drSaman.sallaryIncrement();
        System.out.println();
    drSaman.displayStaffInfo();
        System.out.println();
        System.out.println("--------------------------");
        System.out.println();
        nilanka.displayStaffInfo();
        System.out.println();
        nilanka.GpaIncrease();
        nilanka.displayStaffInfo();
    }
}
