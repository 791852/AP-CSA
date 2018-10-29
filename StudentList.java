
/**
 * Veronica Pratt
 */
import java.util.Scanner;
import java.util.ArrayList;
public class StudentList 
{
    public StudentList(){
        ArrayList<StudentList> studentList = new ArrayList<StudentList>();;
    }
    public static int menuNumber(){
        Scanner in = new Scanner(System.in);
        int returnVar = in.nextInt();
        return returnVar;
    }
    public static void addStudenttoList(){
        Scanner scanner = new Scanner(System.in);
        String studentAdded = scanner.nextLine();
        studentList.add(studentAdded);
    }
    public static void printStudentList(){
        String studentList = "";
    }
    //placeholder methods
    public static int addStudent(){
        return 0;
    }
    public static int deleteStudent(){
        return 0;
    }
    public static int editStudentList(){
        return 0;
    }
    public static int clearList(){
        return 0;
    }
    public static int printList(){
        return 0;
    }
    public static int printStudent(){
        return 0;
    }
}
