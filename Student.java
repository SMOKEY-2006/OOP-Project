import java.util.ArrayList;
import java.util.Scanner;

public class Student extends DMAP {
    private String major;
    private String gender;

    public Student() {}

    public Student(String name, String address, String email, int ID, int age, String major, String gender) {
        super(name, address, email, ID, age);
        this.major = major;
        this.gender = gender;
    }

    public String getMajor() {
        return major;
    }

    public String getGender() {
        return gender;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }



