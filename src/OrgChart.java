// main program to drive org chart
public class OrgChart
{
  public static void main(String[] args)
  {
   Manager man = new Manager("Flickerman", "Caesar", 10, 88.0, 65, "Development Manager", "HG");
    Manager man1=new Manager("Heavensbee", "Plutarch", 5, 78.0, 34, "Development Manager", "HG 2.0");
    Employee emp=new Employee("Mellark", "Peeta", 3, 100.0, 24, "SR Developer");
    Employee emp1=new Employee("Everdeen", "Katniss", 9, 61.0, 7, "JR Developer");
    Employee emp2=new Employee("Odair", "Finnick", 3, 100.0, 24, "JR Developer");
    emp.setManager(man);
    emp1.setManager(man);
    emp2.setManager(man);
    emp2.setManager(man1);
    System.out.println(man.toString() + "\n\t" + emp.toString() + "\n\t" + emp1.toString());
    System.out.println(man1.toString() + "\n\t" + emp2.toString());
  }
    public static void printInfo(Person p)
  {
    if(p instanceof Manager)
    {
      Manager m=(Manager) p;
     System.out.println(p.toString()+" ");
    }
    else if(p instanceof Person)
    {
      Person k=(Manager) p;
      System.out.println(p.toString()+" ");
    }
      
}
}
