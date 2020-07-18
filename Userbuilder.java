package Creational;

public class Userbuilder {

	public static void main(String[] args) {
			    Userdetails user1 = new Userdetails.Userbuilder("A")
			    .age(30)
			    .phone("1234567")
			    .address("Fake address 1234")
			    .build();
			 
			    System.out.println(user1);
			 
			    Userdetails user2 = new Userdetails.Userbuilder("B")
			    .age(40)
			    .phone("5655")
			    .build();
			 
			    System.out.println(user2);
			 
			    Userdetails user3 = new Userdetails.Userbuilder("C")
			    .build();
			 
			    System.out.println(user3);
			}
			 

		}