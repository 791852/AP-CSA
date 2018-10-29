
/**
 * Veronica Pratt
 */
public class Student extends StudListRunner
{
    private String firstName;
    private String middleName;
    private String lastName;
    private int stuNumber;
    private double GPA;
    public Student(){
        firstName = "Veronica";
        middleName = "Grace";
        lastName = "Pratt";
        stuNumber = 791852;
        GPA = 4.38;
    }
    public void setfirstName(String sn){
        firstName = sn;
    }
    public void setmiddleName(String sn){
        middleName = sn;
    }
    public void setlastName(String sn){
        lastName = sn;
    }
    public String getfullName(){
        return lastName + ", " + firstName + middleName;
    }
    public void setGPA(double sn){
        GPA = sn;
    }
    public double getGPA(){
        return GPA;
    }
    public int getstuNumber(){
        return stuNumber;
    }
}
