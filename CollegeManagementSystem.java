class College {
    String collegeName;
    String collegeAddress;

    College(String name, String address) {
        this.collegeName = name;
        this.collegeAddress = address;
    }

    void displayCollegeInfo() {
        System.out.println("College Name: " + collegeName);
        System.out.println("College Address: " + collegeAddress);
    }
}

class Student extends College {
    int studentId;
    String studentName;
    String course;
    int[] marks;

    Student(String collegeName, String collegeAddress, int studentId, String studentName, String course, int[] marks) {
        super(collegeName, collegeAddress);
        this.studentId = studentId;
        this.studentName = studentName;
        this.course = course;
        this.marks = marks;
    }

    void displayStudentDetails() {
        displayCollegeInfo();
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Course: " + course);
    }

    void displayResults() {
        System.out.println("Student Results:");
        int total = 0;
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
            total += marks[i];
        }
        double percentage = (double) total / marks.length;
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
    }
}

class Faculty extends College {
    int facultyId;
    String facultyName;
    String department;

    Faculty(String collegeName, String collegeAddress, int facultyId, String facultyName, String department) {
        super(collegeName, collegeAddress);
        this.facultyId = facultyId;
        this.facultyName = facultyName;
        this.department = department;
    }

    void displayFacultyDetails() {
        displayCollegeInfo();
        System.out.println("Faculty ID: " + facultyId);
        System.out.println("Faculty Name: " + facultyName);
        System.out.println("Department: " + department);
    }
}

public class CollegeManagementSystem {
    public static void main(String[] args) {
        int[] studentMarks = {85, 90, 78, 88, 92};
        Student student1 = new Student("Greenfield College", "123 College St", 101, "Alice Johnson", "Computer Science", studentMarks);
        Faculty faculty1 = new Faculty("Greenfield College", "123 College St", 201, "Dr. Robert Smith", "Computer Science");
        System.out.println("Student Details:");
        student1.displayStudentDetails();
        student1.displayResults();
        System.out.println("\nFaculty Details:");
        faculty1.displayFacultyDetails();
    }
}
