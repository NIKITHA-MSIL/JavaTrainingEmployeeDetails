import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Fresher {
ArrayList<Pojo1>freshers = new ArrayList<>();
HashMap<Integer,ArrayList> FresherEmployee = new HashMap<>();
private int count = 0;

public void addEmployees()
{
    freshers.add(new Pojo1("Ammu","20","Female","chennai","486","HR","active"));
    freshers.add(new Pojo1("Karthik","26","male","chennai","487","developer","active"));
    freshers.add(new Pojo1("Aswin","26","male","chennai","488","HR","active"));
    freshers.add(new Pojo1("Aishu","26","Female","chennai","489","QA","active"));
    freshers.add(new Pojo1("Diya","26","Female","chennai","490","Developer","active"));
    freshers.add(new Pojo1("Ishitha","26","Female","chennai","491","HR","active"));
    freshers.add(new Pojo1("Ishani","26","Female","chennai","492","QA","active"));
    count = freshers.size();
}

public void storeEmployee()
{
    for(int i = 0;i<count;i++)
    {
        FresherEmployee.put(i,freshers);
    }
}
    public void alldisplayemployees()
    {
        for(int i = 0;i<count;i++)
        {
            System.out.println(freshers.get(i).name+"\t"+freshers.get(i).empid);
        }
    }
    public void displayEmployee(String id)
    {
        for(int i = 0;i<count;i++)
        {
            if(freshers.get(i).empid.equalsIgnoreCase(id))
            {
                System.out.println(freshers.get(i).name);
                System.out.println(freshers.get(i).dateofjoining);
                System.out.println(freshers.get(i).gender);
                System.out.println(freshers.get(i).place);
                System.out.println(freshers.get(i).designation);
                System.out.println(freshers.get(i).status);




            }
        }
    }
}

