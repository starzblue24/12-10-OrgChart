// Super Class to represent a person
public class Person
{
  private String firstName;
  private String lastName;
  private int age;
  public Person()
  {
    firstName="";
    lastName="";
    age=0;
  }
  public Person(String nameF, String nameL, int agee)
  {
    firstName=nameF;
    lastName=nameL;
    age=agee;
  }
  public String getFirstName()
  {
    return firstName;
  }
  public String getLastName()
  {
    return lastName;
  }
  public int getAge()
  {
    return age;
  }
  public String toString()
  {
    return lastName+", "+firstName;
  }
  public void recordBirthday()
  {
    age+=1;
  }
   public boolean equals(Object u)
  {
    if(u instanceof Manager)
    {
      Manager f=(Manager) u;
    return f.getFirstName()==this.getFirstName() && f.getLastName()==this.getLastName() && f.getAge()==this.getAge();
    }
    return false;
}
}
