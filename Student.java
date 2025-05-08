import java.util.Scanner;

public class  Student extends DMAP {
    private String Major;
    private String gender;
    public Student(){

    }
    public Student(String name, String Address, String Email, int ID, int age,String Major, String gender){
        super(name, Address, Email, ID, age);
        this.Major = Major;
        this.gender = gender;


    }
    public String getMajor(){
        return Major;
    }
    public void setMajor(String Major){
        this.Major = Major;
    }
    public String getGender(){
        return gender;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public void StudentInfo(){
        System.out.println("please enter your name");
        Scanner sc=new Scanner(System.in);
        String Name=sc.nextLine();
        System.out.println("please enter your address");
        String Address=sc.nextLine();
        System.out.println("please enter your email");
        String Email=sc.nextLine();
        System.out.println("please enter your ID");
        int ID=sc.nextInt();
        System.out.println("please enter your age");
        if(age<0) {
            System.out.println("invalid age");
        }
else {
        int age=sc.nextInt();}
        System.out.println("please enter your Major");
        String Major=sc.nextLine();
        System.out.println("please enter your Gender");
        String Gender=sc.nextLine();




    }


}
