public abstract class DMAP {
    protected String name;
    protected String Address;
    protected int ID;
    protected int age;
    protected String Email;

    public DMAP() {

    }

    public DMAP(String name, String Address, String Email, int ID, int age) {
        this.name = name;
        this.Address = Address;
        this.Email = Email;
        this.ID = ID;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getEmail() {
        return Email;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getAddress() {
        return Address;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public void setAge(int Age) {
        this.age = Age;
    }

    public int getAge() {
        return age;
    }

}