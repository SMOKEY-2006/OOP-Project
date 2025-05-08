public class Courses extends DMAP {
    
    String [] courses2 = new String [20];
    
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
    
    protected int CRSE;
    protected String X1, X2, X3, X4, X5, X6, X7, X8, X9, X10, X11, X12, X13, X14, X15;
    
    
    public Courses(){}

    public Courses(String name, String Address, String Email, int ID, int age){
        super(name, Address, Email, ID, age); }
    
    
    int [] IDs = new int [10];

    public void Add_Course_Student(int ID, int CRSE){
        switch(CRSE){
            case 1:   
                this.ID=IDs[ID];
                System.out.println("Mathematics Course has been added to Student of ID "+ID);
                this.X1="Mathematics";
            break;
            
            case 2:
                this.ID=IDs[ID];
                System.out.println("Physics Course has been added to Student of ID "+ID);
                this.X2="Physics"; 
            break;
            
            case 3:
                this.ID=IDs[ID];
                System.out.println("English Course has been added to Student of ID "+ID);
                this.X3="English";
            break;
            
            case 4:
                this.ID=IDs[ID];
                System.out.println("Arabic Course has been added to Student of ID "+ID);
                this.X4="Arabic";
            break;
            
            case 5:
                this.ID=IDs[ID];
                System.out.println("Computer Programming Course has been added to Student of ID "+ID);
                this.X5="Computer Programming";
            break;
            
            case 6:
                this.ID=IDs[ID];
                System.out.println("Object Oriented Programming Course has been added to Student of ID "+ID);
                this.X6="Object Oriented Programming";
            break;
            
            case 7:
                this.ID=IDs[ID];
                System.out.println("Mathematics for Computer Science Course has been added to Student of ID "+ID);
                this.X7="Mathematics for Computer Science";
            break;
            
            case 8:
                this.ID=IDs[ID];
                System.out.println("Game Programming Course has been added to Student of ID "+ID);
                this.X8="Game Programming";
            break;
            
            case 9:
                this.ID=IDs[ID];
                System.out.println("Web Programming Systems Course has been added to Student of ID "+ID);
                this.X9="Web Programming";
            break;
            
            case 10:
                this.ID=IDs[ID];
                System.out.println("Multimedia Systems Course has been added to Student of ID "+ID);
                this.X10="Multimedia Systems";
            break;
            
            case 11:
                this.ID=IDs[ID];
                System.out.println("Database Course has been added to Student of ID "+ID);
                this.X11="Database";
            break;
            
            case 12:
                this.ID=IDs[ID];
                System.out.println("Human Computer Interaction Course has been added to Student of ID "+ID);
                this.X12="Human Computer Interaction";
            break;
            
            default:
                System.out.println("Invalid Course Number. Please Try Again!");
            break;
        }  
        }
    protected int i=12;
    
    public void Add_Course(String name){
        if (courses2[i]==null){
         this.name=courses2[12];   
        }
        else{
            i++;
            this.name=courses2[i];
        }
        System.out.println("Course "+name+" has been added successfully!");
        }

        public void Display_Courses(){
            for (int i = 0; i < courses2.length; i++) {
                System.out.println(courses2[i]);
            }

        }
    
    
    
    
    
    
    
    }
    
            
