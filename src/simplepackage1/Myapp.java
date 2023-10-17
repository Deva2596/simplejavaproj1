package simplepackage1;

public class Myapp {

	  public static void main(String[] args) {

	    System.out.println("Hello World!");
	    
	    Person person = new Person();
	    person.setName("John");
	    person.setAge(25);

	    System.out.println(person.getName());
	    System.out.println(person.getAge());

	  }

	}

	class Person {

	  private String name;
	  private int age;

	  public String getName() {
	    return name;
	  }

	  public void setName(String name) {
	    this.name = name;
	  }

	  public int getAge() {
	    return age;
	  }

	  public void setAge(int age) {
	    this.age = age;
	  }

	}