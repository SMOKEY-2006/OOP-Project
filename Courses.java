package com.mycompany.main;

public class Courses extends DMAP {

    String [] courses2 = new String [20]; //Array for courses
    
    {
    courses2[0] = "Mathematics";
    courses2[1] = "Physics";
    courses2[2]="English";
    courses2[3]="Arabic";
    courses2[4]="Computer Programming";
    courses2[5]="Object Oriented Programming";
    courses2[6]="Mathematics for Computer Science";
    courses2[7]="Game Programming";
    courses2[8]="Web Programming";
    courses2[9]="Multimedia Systems";
    courses2[10]="Database";
    courses2[11] = "Human Computer Interaction";
    }
    
    public Courses(){}

    public Courses(String name, String Address, String Email, int ID, int age){
        super(name, Address, Email, ID, age); }
    
    protected int z=0;
    protected int y=0;
    protected int CRSE;
    protected int i=12;
    
    int [] IDsLect = new int [10]; // Array for IDs of Lecturers
    int [] IDs = new int [10]; // Array for IDs of Students
    String [] coursesLects = new String [7]; // Courses taken by Lecturers
    String [] coursesIDs = new String [7]; // Courses taken by Students

    public void Add_Course_Student(int ID, int CRSE){ // Add Coourse for a Student by Manager
        switch(CRSE){
            case 1:   
                System.out.println("Mathematics Course has been added to Student of ID "+ID);
                
                if(IDs[ID]==0){
                    IDs[ID]=ID;}
                else{
                    IDs[ID]=ID+1;}
                
                    if (coursesIDs[z]==null){
                        coursesIDs[z]=courses2[0];
                    }
                    else{
                        z++;
                        coursesIDs[z]=courses2[0];
                    }
            break;

            
            case 2:
                System.out.println("Physics Course has been added to Student of ID "+ID);
                
                if(IDs[ID]==0){
                    IDs[ID]=ID;}
                else{
                    IDs[ID]=ID+1;}
                
                 if (coursesIDs[z]==null){
                        coursesIDs[z]=courses2[1];
                    }
                    else{
                        z++;
                        coursesIDs[z]=courses2[1];
                    } 
            break;
            
            case 3:
                System.out.println("English Course has been added to Student of ID "+ID);
                
                if(IDs[ID]==0){
                    IDs[ID]=ID;}
                else{
                    IDs[ID]=ID+1;}
                
                 if (coursesIDs[z]==null){
                        coursesIDs[z]=courses2[2];
                    }
                    else{
                        z++;
                        coursesIDs[z]=courses2[2];
                    }
            break;
            
            case 4:
                System.out.println("Arabic Course has been added to Student of ID "+ID);
                
                if(IDs[ID]==0){
                    IDs[ID]=ID;}
                else{
                    IDs[ID]=ID+1;}
                
                 if (coursesIDs[z]==null){
                        coursesIDs[z]=courses2[3];
                    }
                    else{
                        z++;
                        coursesIDs[z]=courses2[3];
                    }
            break;
            
            case 5:
                System.out.println("Computer Programming Course has been added to Student of ID "+ID);
                
                if(IDs[ID]==0){
                    IDs[ID]=ID;}
                else{
                    IDs[ID]=ID+1;}
                
                 if (coursesIDs[z]==null){
                        coursesIDs[z]=courses2[4];
                    }
                    else{
                        z++;
                        coursesIDs[z]=courses2[4];
                    }
            break;
            
            case 6:
                System.out.println("Object Oriented Programming Course has been added to Student of ID "+ID);
                
                if(IDs[ID]==0){
                    IDs[ID]=ID;}
                else{
                    IDs[ID]=ID+1;}
                
                 if (coursesIDs[z]==null){
                        coursesIDs[z]=courses2[5];
                    }
                    else{
                        z++;
                        coursesIDs[z]=courses2[5];
                    }
            break;
            
            case 7:
                System.out.println("Mathematics for Computer Science Course has been added to Student of ID "+ID);
                
                if(IDs[ID]==0){
                    IDs[ID]=ID;}
                else{
                    IDs[ID]=ID+1;}
                
                 if (coursesIDs[z]==null){
                        coursesIDs[z]=courses2[6];
                    }
                    else{
                        z++;
                        coursesIDs[z]=courses2[6];
                    }
            break;
            
            case 8:
                
                System.out.println("Game Programming Course has been added to Student of ID "+ID);
                
                if(IDs[ID]==0){
                    IDs[ID]=ID;}
                else{
                    IDs[ID]=ID+1;}
                
                 if (coursesIDs[z]==null){
                        coursesIDs[z]=courses2[7];
                    }
                    else{
                        z++;
                        coursesIDs[z]=courses2[7];
                    }
            break;
            
            case 9:
                
                System.out.println("Web Programming Systems Course has been added to Student of ID "+ID);
                
                if(IDs[ID]==0){
                    IDs[ID]=ID;}
                else{
                    IDs[ID]=ID+1;}
                
                 if (coursesIDs[z]==null){
                        coursesIDs[z]=courses2[8];
                    }
                    else{
                        z++;
                        coursesIDs[z]=courses2[8];
                    }
            break;
            
            case 10:
                
                System.out.println("Multimedia Systems Course has been added to Student of ID "+ID);
                
                if(IDs[ID]==0){
                    IDs[ID]=ID;}
                else{
                    IDs[ID]=ID+1;}
                
                 if (coursesIDs[z]==null){
                        coursesIDs[z]=courses2[9];
                    }
                    else{
                        z++;
                        coursesIDs[z]=courses2[9];
                    }
            break;
            
            case 11:
                
                System.out.println("Database Course has been added to Student of ID "+ID);
                
                if(IDs[ID]==0){
                    IDs[ID]=ID;}
                else{
                    IDs[ID]=ID+1;}
                
                 if (coursesIDs[z]==null){
                        coursesIDs[z]=courses2[10];
                    }
                    else{
                        z++;
                        coursesIDs[z]=courses2[10];
                    }
            break;
            
            case 12:
                
                System.out.println("Human Computer Interaction Course has been added to Student of ID "+ID);
                
                if(IDs[ID]==0){
                    IDs[ID]=ID;}
                else{
                    IDs[ID]=ID+1;}
                
                 if (coursesIDs[z]==null){
                        coursesIDs[z]=courses2[11];
                    }
                    else{
                        z++;
                        coursesIDs[z]=courses2[11];
                    }
            break;
            
            default:
                System.out.println("Invalid Course Number. Please Try Again!");
            break;
        }  
    }
    
    public void Add_Course(String name){ // Manager adds a new course to the courses
        
        if (courses2[i]==null){
         courses2[i]=name;   
        }
        else{
            i++;
            courses2[i]=name;
        }
        System.out.println("Course "+name+" has been added successfully!");
        }

        public void Display_Courses(){ // Display all courses available
            for (int i = 0; i < courses2.length; i++) {
                if (courses2[i]==null){
                    break;}
                else{
                System.out.println(courses2[i]);}
            }

        }
        
        public void Display_Courses_Student(int ID){ // Display courses taken by a student
            if (ID==IDs[ID] || ID==IDs[ID+1]){
                System.out.println(coursesIDs[z]);}
            else{
              System.out.println("Invalid ID Number. Please Try Again!");}     
        }    
        
        public void Add_Course_Lecturer(int ID, int CRSE){ // Add a new course to a lecturer's ID
        switch(CRSE){
            case 1:   
                System.out.println("Mathematics Course has been added to Lecturer of ID "+ID);
                
                if(IDsLect[ID]==0){
                    IDsLect[ID]=ID;}
                else{
                    IDsLect[ID]=ID+1;}
                
                    if (coursesLects[y]==null){
                        coursesLects[y]=courses2[0];
                    }
                    else{
                        y++;
                        coursesLects[y]=courses2[0];
                    }
            break;

            
            case 2:
                System.out.println("Physics Course has been added to Lecturer of ID "+ID);
                
                if(IDsLect[ID]==0){
                    IDsLect[ID]=ID;}
                else{
                    IDsLect[ID]=ID+1;}
                
                 if (coursesLects[y]==null){
                        coursesLects[y]=courses2[1];
                    }
                    else{
                        y++;
                        coursesLects[y]=courses2[1];
                    } 
            break;
            
            case 3:
                System.out.println("English Course has been added to Lecturer of ID "+ID);
                
                if(IDsLect[ID]==0){
                    IDsLect[ID]=ID;}
                else{
                    IDsLect[ID]=ID+1;}
                
                 if (coursesLects[y]==null){
                        coursesLects[y]=courses2[2];
                    }
                    else{
                        y++;
                        coursesLects[y]=courses2[2];
                    }
            break;
            
            case 4:
                System.out.println("Arabic Course has been added to Lecturer of ID "+ID);
                
                if(IDsLect[ID]==0){
                    IDsLect[ID]=ID;}
                else{
                    IDsLect[ID]=ID+1;}
                
                 if (coursesLects[y]==null){
                        coursesLects[y]=courses2[3];
                    }
                    else{
                        y++;
                        coursesLects[y]=courses2[3];
                    }
            break;
            
            case 5:
                System.out.println("Computer Programming Course has been added to Lecturer of ID "+ID);
                
                if(IDsLect[ID]==0){
                    IDsLect[ID]=ID;}
                else{
                    IDsLect[ID]=ID+1;}
                
                 if (coursesLects[y]==null){
                        coursesLects[y]=courses2[4];
                    }
                    else{
                        y++;
                        coursesLects[y]=courses2[4];
                    }
            break;
            
            case 6:
                System.out.println("Object Oriented Programming Course has been added to Lecturer of ID "+ID);
                
                if(IDsLect[ID]==0){
                    IDsLect[ID]=ID;}
                else{
                    IDsLect[ID]=ID+1;}
                
                 if (coursesLects[y]==null){
                        coursesLects[y]=courses2[5];
                    }
                    else{
                        y++;
                        coursesLects[y]=courses2[5];
                    }
            break;
            
            case 7:
                System.out.println("Mathematics for Computer Science Course has been added to Lecturer of ID "+ID);
                
                if(IDsLect[ID]==0){
                    IDsLect[ID]=ID;}
                else{
                    IDsLect[ID]=ID+1;}
                
                 if (coursesLects[y]==null){
                        coursesLects[y]=courses2[6];
                    }
                    else{
                        y++;
                        coursesLects[y]=courses2[6];
                    }
            break;
            
            case 8:
                
                System.out.println("Game Programming Course has been added to Lecturer of ID "+ID);
                
                if(IDsLect[ID]==0){
                    IDsLect[ID]=ID;}
                else{
                    IDsLect[ID]=ID+1;}
                
                 if (coursesLects[y]==null){
                        coursesLects[y]=courses2[7];
                    }
                    else{
                        y++;
                        coursesLects[y]=courses2[7];
                    }
            break;
            
            case 9:
                
                System.out.println("Web Programming Systems Course has been added to Lecturer of ID "+ID);
                
                if(IDsLect[ID]==0){
                    IDsLect[ID]=ID;}
                else{
                    IDsLect[ID]=ID+1;};
                    
                 if (coursesLects[y]==null){
                        coursesLects[y]=courses2[8];
                    }
                    else{
                        y++;
                        coursesLects[y]=courses2[8];
                    }
            break;
            
            case 10:
                
                System.out.println("Multimedia Systems Course has been added to Lecturer of ID "+ID);
                
                if(IDsLect[ID]==0){
                    IDsLect[ID]=ID;}
                else{
                    IDsLect[ID]=ID+1;}
                
                 if (coursesLects[y]==null){
                        coursesLects[y]=courses2[9];
                    }
                    else{
                        y++;
                        coursesLects[y]=courses2[9];
                    }
            break;
            
            case 11:
                
                System.out.println("Database Course has been added to Lecturer of ID "+ID);
                
                if(IDsLect[ID]==0){
                    IDsLect[ID]=ID;}
                else{
                    IDsLect[ID]=ID+1;}
                
                 if (coursesLects[y]==null){
                        coursesLects[y]=courses2[10];
                    }
                    else{
                        y++;
                        coursesLects[y]=courses2[10];
                    }
            break;
            
            case 12:
                
                System.out.println("Human Computer Interaction Course has been added to Lecturer of ID "+ID);
                
                if(IDsLect[ID]==0){
                    IDsLect[ID]=ID;}
                else{
                    IDsLect[ID]=ID+1;}
                
                 if (coursesLects[y]==null){
                        coursesLects[y]=courses2[11];
                    }
                    else{
                        y++;
                        coursesLects[y]=courses2[11];
                    }
            break;
            
            default:
                System.out.println("Invalid Course Number. Please Try Again!");
            break;
        }  
        }
        
        public void Display_Courses_Lecturer(int ID){ // Display all courses taken by a lecturer
            if (IDsLect[ID]==ID){
                System.out.println(coursesLects[y]);}
            else{
              System.out.println("Invalid ID Number. Please Try Again!");}     
        }    
            
            }
        
    
    
    
    
    
    
    
    
    
            
