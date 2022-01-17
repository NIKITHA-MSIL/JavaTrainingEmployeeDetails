import java.util.ArrayList;
import java.util.HashMap;

public class Seniors extends Experiance {


    public void storeEmployee() {
        for (int i = 0; i < count; i++) {
            FresherEmployee.put(i, seniors);
        }
    }

    public void alldisplayemployees() {
        for (int i = 0; i < count; i++) {
            System.out.println(seniors.get(i).name + "\t" + seniors.get(i).empid);
        }
    }

    public void displayEmployee(String id) {
        for (int i = 0; i < count; i++) {
            if (seniors.get(i).empid.equalsIgnoreCase(id)) {
                System.out.println(seniors.get(i).name);
                System.out.println(seniors.get(i).dateofjoining);
                System.out.println(seniors.get(i).gender);
                System.out.println(seniors.get(i).place);
                System.out.println(seniors.get(i).designation);
                System.out.println(seniors.get(i).status);
            }
        }
    }
}