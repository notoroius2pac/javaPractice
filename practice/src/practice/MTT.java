package practice;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.Collectors;

enum Gender {
  MAN, WOMEN
}
    
class People {
  //Write Your Code Here..
  String name;
  Integer age;
  Gender gender;
    People(){
      this.name="";
      this.age=0;
      this.gender=Gender.MAN;
    }
  People(String name,Integer age , Gender gender){
    this.name = name;
    this.age = age;
    this.gender = gender;
  }
  //Getters 
  public String getName() {
    return name;
  }
  public Integer getAge() {
    return age;
  }
  public Gender getGender() {
    return gender;
  }
  //Setters
  public void setName(String name) {
    this.name = name;
  }
  public void setAge(Integer age) {
    this.age = age;
  }
  public void setGender(Gender gender) {
    this.gender = gender;
  }
      @Override
  public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}

class PeopleImplementation {
  //Write Your Code Here..
  public People getMinimumAge(Collection<People> peoples){
    List<People> res = peoples.stream().sorted(Comparator.comparing(People::getAge)).limit(1).collect(Collectors.toList());
    return res.get(0);
  }
  public Integer getAgeOfOdestMan(Collection<People> peoples){
    List<People> res  = peoples.stream().sorted(Comparator.comparing(People::getAge)).limit(1).collect(Collectors.toList());
    Integer resInt = res.get(0).getAge();
    return resInt;
 
  }
}

public class MTT {
	public static void main(String args[] ) throws Exception {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
	}
}