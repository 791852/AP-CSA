
/**
 *Veronica Pratt
 */
public class StudListRunner extends StudentList
{
   public StudListRunner(){
    StudentList studentListObject = new StudentList();
   }
   public static void main(){
    int loopEnd = 1;
    while(loopEnd != 0){
        int loopVar = menuNumber();
        System.out.println(loopVar);
        if(loopVar == 0){
            loopEnd = 0;
        }
        if(loopVar ==1){
            System.out.print(addStudent());
        }
        if(loopVar ==2){
            System.out.print(deleteStudent());
        }
        if(loopVar ==3){
            System.out.print(editStudentList());
        }
        if(loopVar ==4){
            System.out.print(clearList());
        }
        if(loopVar ==5){
            System.out.print(printList());
        }
        if(loopVar ==6){
            System.out.print(printStudent());
        }
    }
    }
}
