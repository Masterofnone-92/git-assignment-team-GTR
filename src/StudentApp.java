public class StudentApp {
    public static void main(String[] args) throws Exception {
        Student student1 = new Student("pekka Niemi", "543626");

        student1.bePresent();
        student1.addStudyRecord(15);
        student1.addStudyRecord(25);

        student1.printInfo();

    }
} // End of the studentAPP

class Student {
    public String name;
    public String studentNumber;
    public int credits;
    public boolean attendanceStatus;

    public Student() {
        name = "";
        studentNumber = "";
        credits = 0;
        attendanceStatus = false;
    }

    public Student(String name, String studentNumber) {
        this.name = name;
        this.studentNumber = studentNumber;
        credits = 0;
        attendanceStatus = false;
    }

    public Student(String name, String studentNumber, int credits, boolean attendanceStatus) {
        this.name = name;
        this.studentNumber = studentNumber;
        this.credits = credits;
        this.attendanceStatus = attendanceStatus;
    }

    public void addStudyRecord(int creditAmount) {
        if (attendanceStatus) {
            credits = credits + creditAmount;
        } else {

            System.out.println("Student is absent.Can't add study record.");
        }
    }

    public void printCreditinfo() {
        System.out.println("Has  " + credits + " credits");

    }

    public void bePresent() {
        attendanceStatus = true;

    }

    public void beAbsent() {
        attendanceStatus = false;

    }

    public void printInfo() {
        System.out.println("Name:  " + name);
        System.out.println("Student number: " + studentNumber);
        printCreditinfo();
        if (attendanceStatus) {

            System.out.println("Student is present.");
        } else {
            System.out.println("Student is absent.");
        }

    }

}
