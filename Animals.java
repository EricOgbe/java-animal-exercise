package com.qa.animal;

interface AnimalInterface {
boolean sleeping = false;
void mating(Animal a);
}
interface AnimalInterface2 {
boolean awake = true;
void resting(Animal a);
}

public class Animal implements AnimalInterface,AnimalInterface2{
  private String type;
  private String color;
  private int age;
 
public void sit(Animal a) {
System.out.println("The "+ a.getType()+ " is sitting.");
}
public void eat(Animal a) {
System.out.println("The "+ a.getType()+ " is eating.");
}
public String getType() {
return type;
}
public void setType(String type) {
this.type = type;
}
public String getColor() {
return color;
}
public void setColor(String color) {
this.color = color;
}
public int getAge() {
return age;
}
public void setAge(int age) {
this.age = age;
}
@Override
public void mating(Animal a) {
// TODO Auto-generated method stub
System.out.println(a.getType()+ " is mating.");
}
@Override
public void resting(Animal a) {
// TODO Auto-generated method stub
System.out.println(a.getType()+ " is resting.");
}
 
 
}
