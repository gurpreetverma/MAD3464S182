
import static java.lang.System.in;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macstudent
 */
public class Person {
    String name;
    String address;
    int age;
    Scanner in= new Scanner(System.in);
    //default constructor
    Person(){
        name ="unknown";
        address ="unknown";
        age=1;
    }
    Person(Person anotherPerson){
        this.name = anotherPerson.name;
        this.address=anotherPerson.address;
        this.age=anotherPerson.age;
    }
    Person(String name,String address,int age){
        this.name = name;
        this.address=address;
        this.age=age;
    }
   
    void setName(){
        
        System.out.println("Enter Name:");
        name = in.nextLine();
    }
    String getName(){
        return name;
    
}
    void setAddress(){
        System.out.println("Enter Address:");
        address =in.nextLine();
    }
    String getAddress(){
        return address;
    }
    void setAge(){
        System.out.println("Enter Age:");
        age =Integer.parseInt(in.nextLine());
    }
    int getAge(){
        return age;
    }
    void setData()
    {
        setName();
        setAge();
        setAddress();
    }
    @Override
    public String toString(){
        String data ="Name:" +name+"\n Address:"+address+"\n Age:"+age;
        return data;
        
    }
    }

