/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301082002.p230424;

/**
 *
 * @author Bariq
 */
public class Person {
    protected String name;
    protected String address;
    
    public Person(){
        System.out.println("Student Constructor");
        name = "";
        address = "";
    }
    
    public Person (String name, String address){
        this.name = name;
        this.address = address;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(){
        this.name = name;
    }
    
    public String getAddress(){
        return address;
    }
    
    public void setAddress(){
        this.address = address;
    }
    
    
}
