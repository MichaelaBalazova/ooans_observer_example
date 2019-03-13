import java.util.Calendar;

public class Person implements Observer {

    String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void update(Calendar time) {
        System.out.println(name + " - My personal mail has arrived at " + time.getTime() + ".");
    }
}
