import java.util.Scanner;

public class Main {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        Fresher fresher = new Fresher();
        Seniors seniors = new Seniors();
        Juniors juniors = new Juniors();
        String choice,options;
        System.out.println("Freshers\n");
        fresher.addEmployees();
        fresher.storeEmployee();
        fresher.alldisplayemployees();
        System.out.println("Juniors\n");
        juniors.addEmployees();
        juniors.storeEmployee();
        juniors.alldisplayemployees();
        System.out.println("Seniors\n");
        seniors.addEmployees();
        seniors.storeEmployee();
        seniors.alldisplayemployees();
        System.out.println("Enter the type of employee");
        options = sc.nextLine();
        String input;
        switch (options)
        {
            case "Fresher":            System.out.println("Enter the employee Id");
                 input = sc.nextLine();
                fresher.displayEmployee(input);
                break;
            case "Junior":            System.out.println("Enter the employee Id");
                 input = sc.nextLine();
                juniors.displayEmployee(input);
break;
            case "Seniors": System.out.println("Enter the employee Id");
                 input = sc.nextLine();
                seniors.displayEmployee(input);
                seniors.showexperiance();
                break;
            default:break;


        }




    }
}
