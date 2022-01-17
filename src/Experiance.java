import java.beans.FeatureDescriptor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Experiance {
    ArrayList<Pojo1> seniors = new ArrayList<>();
    HashMap<Integer, ArrayList> FresherEmployee = new HashMap<>();
    HashMap<String, HashMap> seniorexp = new HashMap<>();
    HashMap<String,String>exp = new HashMap<>();
    int count = 0;

    public void addEmployees() {

        seniors.add(new Pojo1("Pavan", "26", "male", "chennai", "600", "HR", "active","Tcs","2"));
        seniors.add(new Pojo1("Sreya", "26", "Female", "chennai", "601", "HR", "active","7","Accenture"));
        seniors.add(new Pojo1("Daksh", "26", "male", "chennai", "602", "QA", "active","5","Wipro"));
        seniors.add(new Pojo1("Shika", "26", "Female", "chennai", "603", "developer", "active","4","Infosys"));
        seniors.add(new Pojo1("Ajay", "26", "male", "chennai", "604", "HR", "active","4","STS"));
        seniors.add(new Pojo1("Vikas", "26", "male", "chennai", "605", "QA", "active","5","CTS"));
        seniors.add(new Pojo1("Vyshak", "26", "male", "chennai", "606", "developer", "active","3","UST"));



        count = seniors.size();
    }
public void showexperiance()
{
        seniorexp.put(seniors.get(0).empid,exp);
        System.out.println("Enter the id to show the previous experiance of the employee");
    Scanner sc=new Scanner(System.in);
    String input = sc.nextLine();
    for(int i = 0; i < count;i++)
    {
                if(seniors.get(i).empid.equalsIgnoreCase(input))
                {
                    System.out.println("Previous experiance of employee is" +seniors.get(i).exp+ "years"+"in"+ seniors.get(i).years);}

        }
    }
}

