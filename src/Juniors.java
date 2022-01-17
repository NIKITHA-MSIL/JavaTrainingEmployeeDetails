import java.util.ArrayList;
import java.util.HashMap;

public class Juniors {
    ArrayList<Pojo1>juniors = new ArrayList<>();
    HashMap<Integer,ArrayList> FresherEmployee = new HashMap<>();
    int count = 0;

    public void addEmployees()
    {

        juniors.add(new Pojo1("Sharuk","26","male","chennai","500","HR","active"));
        juniors.add(new Pojo1("Shalini","26","Female","chennai","501","developer","active"));
        juniors.add(new Pojo1("Pavithra","26","female","chennai","502","QA","active"));
        juniors.add(new Pojo1("Kiran","26","male","chennai","503","developer","active"));
        juniors.add(new Pojo1("Ishan","25","male","chennai","504","QA","active"));
        juniors.add(new Pojo1("Hari","26","male","chennai","505","HR","active"));
        juniors.add(new Pojo1("Hithesh","26","male","chennai","506","developer","active"));
        count = juniors.size();
    }

    public void storeEmployee()
    {
        for(int i = 0;i<count;i++)
        {
            FresherEmployee.put(i,juniors);
        }
    }
    public void alldisplayemployees()
    {
        for(int i = 0;i<count;i++)
        {
            System.out.println(juniors.get(i).name+"\t"+juniors.get(i).empid);
        }
    }
    public void displayEmployee(String id)
    {
        for(int i = 0;i<count;i++)
        {
            if(juniors.get(i).empid.equalsIgnoreCase(id)) {
                System.out.println(juniors.get(i).name);
                System.out.println(juniors.get(i).dateofjoining);
                System.out.println(juniors.get(i).gender);
                System.out.println(juniors.get(i).place);
                System.out.println(juniors.get(i).designation);
                System.out.println(juniors.get(i).status);


            }}

            }
}
