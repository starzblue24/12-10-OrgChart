// class to represent a manager - inherits Emplyee
import java.util.*;
public class Manager extends Employee
{
  private ArrayList <Employee> directReports=new ArrayList<Employee>();
  private String department;
public Manager(String nameF, String nameL, int agee, double wage, int hours, String title, String dep1)
{
  super(nameF, nameL, agee, wage, hours, title);
  department=dep1;
}
public String getDepartment()
{
  return department;
}
public ArrayList<Employee> getDirectReports()
{
  return directReports;
}
public String toString()
{
return "Manager: " + super.toString();
}
public void addDirectReport(Employee employee)
{
  directReports.add(employee);
}
public void  removeDirectReport(Employee employee)
{
  directReports.remove(employee);
}
public void setDepartment(String dept)
{
  department=dept;
}
}
  

