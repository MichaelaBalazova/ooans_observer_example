import java.util.Calendar;

public class Company implements Observer {

    String companyName;

    public Company(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public void update(Calendar time) {
        System.out.println(companyName + " - My company mail has arrived at " + time.getTime() + ".");
    }
}
