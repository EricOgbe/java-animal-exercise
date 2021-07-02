package com.qa.animal;

public class Eagle extends Animal{
private  boolean swim = false;

public void flying(Animal a) {
System.out.println("The "+a.getType()+" is flying.");
}

public boolean isSwim() {
return swim;
}

public void setSwim(boolean swim) {
this.swim = swim;
}

}
