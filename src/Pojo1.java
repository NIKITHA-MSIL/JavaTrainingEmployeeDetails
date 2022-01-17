public class Pojo1 {
    String name,dateofjoining,gender,place,empid,designation,status,exp,years;
    Pojo1(String name,String doj,String gender,String place,String empid,String designation,String status)
    {
        this.name = name;
        this.dateofjoining = doj;
        this.gender = gender;
        this.place = place;
        this.empid = empid;
        this.designation=designation;
        this.status = status;
    }
    Pojo1(String name,String doj,String gender,String place,String empid,String designation,String status,String exp,String years)
    {
        this.name = name;
        this.dateofjoining = doj;
        this.gender = gender;
        this.place = place;
        this.empid = empid;
        this.designation=designation;
        this.status = status;
        this.exp=exp;
        this.years=years;

    }

}
