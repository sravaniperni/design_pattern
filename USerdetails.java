package Creational;

public class Userdetails {
	   private final String Name; // required
	   private final int age; // optional
	   private final String phone; // optional
	   private final String address; // optional

	   private Userdetails(Userbuilder builder) {
	       this.Name = builder.Name;
	       this.age = builder.age;
	       this.phone = builder.phone;
	       this.address = builder.address;
	   }
	   public String getName() {
	       return Name;
	   }
	   
	   public int getAge() {
	       return age;
	   }
	   public String getPhone() {
	       return phone;
	   }
	   public String getAddress() {
	       return address;
	   }
public String toString() {
    return "User: "+this.Name+", "+this.age+", "+this.phone+", "+this.address;
}

public static class Userbuilder 
{
    private final String Name;
    private int age;
    private String phone;
    private String address;

    public Userbuilder(String Name) {
        this.Name = Name;
    }
    public Userbuilder age(int age) {
        this.age = age;
        return this;
    }
    public Userbuilder phone(String phone) {
        this.phone = phone;
        return this;
    }
    public Userbuilder address(String address) {
        this.address = address;
        return this;
    }
   
    public Userdetails build() {
    	Userdetails user =  new Userdetails(this);
        return user;
    }
       }

}