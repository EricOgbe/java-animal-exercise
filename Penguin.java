package com.qa.animal;

public class Penguin extends Animal{
 private boolean swim = true;
 private boolean fly = false;
 
 public void swimming(Animal a) {
System.out.println("The "+ a.getType() +" is swimming.");
 }
 public void walking(Animal a) {
System.out.println("The "+ a.getType() +" is walking.");
 }
public boolean isSwim() {
return swim;
}
public void setSwim(boolean swim) {
this.swim = swim;
}
public boolean isFly() {
return fly;
}
public void setFly(boolean fly) {
this.fly = fly;
}
 
 
}
