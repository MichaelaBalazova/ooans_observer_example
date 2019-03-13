import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        // creating observers
        Person person1 = new Person("John");
        Person person2 = new Person("Becky");
        Person person3 = new Person("Robin");
        Company company1 = new Company("AwesomeClothing");
        Company company2 = new Company("Steel&Steel");

        // creating subject
        PostOffice postOffice = new PostOffice();

        // observers added to subject
        postOffice.attach(person1);
        postOffice.attach(person2);
        postOffice.attach(person3);
        postOffice.attach(company1);
        postOffice.attach(company2);

        // arrived mail at post office
        postOffice.newMailArrived();

        // some observers removed
        postOffice.dettach(person3);
        postOffice.dettach(company2);

        waitOneSecond();
        // arrived mail at post office
        postOffice.newMailArrived();
    }

    private static void waitOneSecond() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
