package DoctorsAbstract;

public class Oncologist extends Doctor {
    public Oncologist(String name) {
        super(name);
    }

    public String getSchedule() {
        return "Everyday - 10 AM to 2 PM";
    }
}