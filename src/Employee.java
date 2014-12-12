// class to represent an emplayee - inherits Person
public class Employee extends Person
{
  private double hourlyWage;
  private int hoursWorked;
  private String jobTitle;
  private Manager man;
  public Employee(String nameF, String nameL, int agee, double wage, int hours, String title)
  {
    super(nameF, nameL, agee);;
    hourlyWage=wage;
    hoursWorked=hours;
    jobTitle=title;
  }
  public double getWage()
  {
    return hourlyWage;
  }
  public int hoursWorked()
  {
    return hoursWorked;
  }
  public double getWeeklySalary()
  {
  return  hoursWorked*=hourlyWage;
  }
  public double getYearlySalary()
  {
    double yearlySalary=    hoursWorked*hourlyWage;
    yearlySalary*=52;
    return yearlySalary;
  }
  public String getJobTitle()
  {
     return jobTitle;
  }
  public String toString()
  {
    return super.toString()+" :"+jobTitle+"@ "+getYearlySalary();
  }
  public void setWage(double newWage)
  {
    hourlyWage=newWage;
  }
  public void setHours(int h)
  {
    hoursWorked=h;
  }
  public void setJobTitle(String title)
  {
    jobTitle=title;
  }
  public void giveRaise()
  {
    hourlyWage+=1;
  }
  public void setManager(Manager newManager)
  {
    man=newManager;
  }
}
  
