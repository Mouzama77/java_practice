// Student class definition
class Student {
    // Static variables (shared among all objects)
    static String collegeName = "ABC Technical College";
    static int totalStudents = 0;

    // Instance variables (unique for each object)
    int rollNumber;
    String name;
    String branch;
    double sscMarks;
    double interMarks;

    // Constructor to initialize student details
    Student(int rollNumber, String name, String branch, double sscMarks, double interMarks) {
        // Using 'this' keyword to differentiate instance variables from parameters
        this.rollNumber = rollNumber;
        this.name = name;
        this.branch = branch;
        this.sscMarks = sscMarks;
        this.interMarks = interMarks;
        
        // Increment total student count whenever a new object is created
        totalStudents++;
    }

    // Method to display individual student details
    void displayStudentDetails() {
        System.out.println("Roll: " + this.rollNumber + 
                           ", Name: " + this.name + 
                           ", Branch: " + this.branch + 
                           ", SSC: " + this.sscMarks + 
                           ", Inter: " + this.interMarks + 
                           ", College: " + collegeName);
    }

    // Static method to display total number of students
    static void displayTotalStudents() {
        System.out.println("---------------------------------");
        System.out.println("Total Students Admitted: " + totalStudents);
        System.out.println("---------------------------------");
    }
}

// Main class to run the application
public class CollegeSystem {
    public static void main(String[] args) {
        // Creating student objects
        Student s1 = new Student(101, "Alice", "CSE", 90.5, 92.0);
        Student s2 = new Student(102, "Bob", "ECE", 85.0, 88.5);
        Student s3 = new Student(103, "Charlie", "CSE", 88.0, 91.0);
        Student s4 = new Student(104, "David", "Mech", 78.0, 82.0);

        // Display individual details
        System.out.println("Student Records:");
        s1.displayStudentDetails();
        s2.displayStudentDetails();
        s3.displayStudentDetails();
        s4.displayStudentDetails();

        // Display total students using static method
        Student.displayTotalStudents();

        // Display branch-wise count without using Hash
        System.out.println("Branch-wise Count:");
        System.out.println("CSE: " + getBranchCount(new Student[]{s1, s2, s3, s4}, "CSE"));
        System.out.println("ECE: " + getBranchCount(new Student[]{s1, s2, s3, s4}, "ECE"));
        System.out.println("Mech: " + getBranchCount(new Student[]{s1, s2, s3, s4}, "Mech"));
    }

    // Static method to count students in a specific branch (non-hash approach)
    static int getBranchCount(Student[] students, String branchName) {
        int count = 0;
        for (Student s : students) {
            if (s.branch.equalsIgnoreCase(branchName)) {
                count++;
            }
        }
        return count;
    }
}