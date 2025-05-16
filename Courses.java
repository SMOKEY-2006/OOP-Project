
public class Courses extends DMAP {
    String[] courses2 = new String[20]; // Array for all available courses
    
    // Array to store student IDs and their courses
    int[] studentIDs = new int[100]; // max 100 students
    String[][] studentCourses = new String[100][7]; // Each student can have up to 7 courses
    int studentCount = 0;
    
    // Array to store lecturer IDs and their courses
    int[] lecturerIDs = new int[50]; // max 50 lecturers
    String[][] lecturerCourses = new String[50][5]; // Each lecturer can have up to 5 courses
    int lecturerCount = 0;
    
    {
        courses2[0] = "Mathematics";
        courses2[1] = "Physics";
        courses2[2] = "English";
        courses2[3] = "Arabic";
        courses2[4] = "Computer Programming";
        courses2[5] = "Object Oriented Programming";
        courses2[6] = "Mathematics for Computer Science";
        courses2[7] = "Game Programming";
        courses2[8] = "Web Programming";
        courses2[9] = "Multimedia Systems";
        courses2[10] = "Database";
        courses2[11] = "Human Computer Interaction";
    }
    
    public Courses() {}
    
    public Courses(String name, String Address, String Email, int ID, int age) {
        super(name, Address, Email, ID, age);
    }
    int CRSE;
    private int nextCourseIndex = 12;

    public int ID;
    
    public void Add_Course_Student(int ID, int CRSE) {
        if (CRSE < 1 || courses2[CRSE]==null) {
            System.out.println("Invalid Course Number. Please Try Again!");
            return;
        }
        
        String courseName = courses2[CRSE-1];
        System.out.println(courseName + " Course has been added to Student of ID " + ID);
        
        // Find the student or add new entry
        int studentIndex=-1;
        for (int i = 0; i < studentCount; i++) {
            if (studentIDs[i] == ID) {
                studentIndex = i;
                break;
            }
        }
        
        if (studentIndex==-1) {
            // New student
            studentIDs[studentCount] = ID;
            studentIndex = studentCount;
            studentCount++;
        }
        
        // Add the course if not already present
        boolean courseExists = false;
        for (int i = 0; i < studentCourses[studentIndex].length; i++) {
            if (studentCourses[studentIndex][i]==null) {
                studentCourses[studentIndex][i]=courseName;
                System.out.println(courseName + " Course has been added to Student of ID " + ID);
                break;
            } else if (studentCourses[studentIndex][i] == courseName) {
                courseExists = true;
                break;
            }
        }
        
        if (courseExists) {
            System.out.println("Student is already registered for this course");
        }
    }
    
    public void Add_Course(String name) {
        if (nextCourseIndex < courses2.length) {
            courses2[nextCourseIndex] = name;
            System.out.println("Course " + name + " has been added successfully!");
            nextCourseIndex++;
        } else {
            System.out.println("Cannot add more courses. Maximum capacity reached.");
        }
    }
    
    public void Display_Courses() {
        System.out.println("Available Courses:");
        for (int i=0; i < nextCourseIndex; i++) {
            if (courses2[i] != null) {
                System.out.println((i+1) + ". " + courses2[i]);
            }
        }
    }
    
    public void Display_Courses_Student(int ID) {
        int studentIndex = -1;
        for (int i = 0; i < studentCount; i++) {
            if (studentIDs[i] == ID) {
                studentIndex = i;
                break;
            }
        }
        
        if (studentIndex == -1) {
            System.out.println("No courses found for Student ID " + ID);
            return;
        }
        
        System.out.println("Courses for Student ID " + ID + ":");
        for (int i = 0; i < studentCourses[studentIndex].length; i++) {
            if (studentCourses[studentIndex][i] != null) {
                System.out.println("- " + studentCourses[studentIndex][i]);
            }
        }
        
        
    }
    
    public void Add_Course_Lecturer(int ID, int CRSE) {
        if (CRSE < 1 || CRSE > nextCourseIndex) {
            System.out.println("Invalid Course Number. Please Try Again!");
            return;
        }
        
        String courseName = courses2[CRSE - 1];
        
        // Find the lecturer or add new entry
        int lecturerIndex = -1;
        for (int i = 0; i < lecturerCount; i++) {
            if (lecturerIDs[i] == ID) {
                lecturerIndex = i;
                break;
            }
        }
        
        if (lecturerIndex == -1) {
            // New lecturer
            lecturerIDs[lecturerCount] = ID;
            lecturerIndex = lecturerCount;
            lecturerCount++;
        }
        
        // Add the course if not already Existed.
        boolean courseExists = false;
        for (int i = 0; i < lecturerCourses[lecturerIndex].length; i++) {
            if (lecturerCourses[lecturerIndex][i] == null) {
                lecturerCourses[lecturerIndex][i] = courseName;
                System.out.println(courseName + " Course has been added to Lecturer of ID " + ID);
                break;
            } else if (lecturerCourses[lecturerIndex][i] == courseName) {
                courseExists = true;
                break;
            }
        }
        
        if (courseExists) {
            System.out.println("Lecturer is already assigned to this course");
        }
    }
    
    public void Display_Courses_Lecturer(int ID) {
        int lecturerIndex = -1;
        for (int i = 0; i < lecturerCount; i++) {
            if (lecturerIDs[i] == ID) {
                lecturerIndex = i;
                break;
            }
        }
        
        if (lecturerIndex == -1) {
            System.out.println("No courses found for Lecturer ID " + ID);
            return;
        }
        
        System.out.println("Courses for Lecturer ID " + ID + ":");
        for (int i = 0; i < lecturerCourses[lecturerIndex].length; i++) {
            if (lecturerCourses[lecturerIndex][i] != null) {
                System.out.println("- " + lecturerCourses[lecturerIndex][i]);
            }
        }
        
    }
}