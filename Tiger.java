package com.qa.animal;

public class Tiger extends Animal{
  private String gender;
 
  public void run(Animal a) {
 System.out.println("The "+ a.getType()+" is running.");
  }
  public void hunt(Animal a) {
 System.out.println("The "+ a.getType()+" is hunting.");
  }
public String getGender() {
return gender;
}
public void setGender(String gender) {
this.gender = gender;
}
 
 
}
