package Student;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
public class StudentWithTimer implements Learner {
    private Learner learner;
    SimpleDateFormat timeS = new SimpleDateFormat ("H.mm.ss");
    Date time = new Date();
    Calendar calendar = Calendar.getInstance();
    public StudentWithTimer(Learner learner) {
        this.learner = learner;
    }

    @Override
    public void learn() {
        
        learner.learn();
        System.out.print("Текущее время: " + timeS.format(calendar.getTime()));
      
    }
}
