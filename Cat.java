package com.qa.animal;

public class Cat extends Animal{
private String name;
private String breed;

public void purr(Animal a) {
System.out.println("The "+ a.getType()+" is purring." );
}
public void meow(Animal a) {
System.out.println("The "+ a.getType()+" says 'meow'." );
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public String getBreed() {
return breed;
}
public void setBreed(String breed) {
this.breed = breed;
}

}
