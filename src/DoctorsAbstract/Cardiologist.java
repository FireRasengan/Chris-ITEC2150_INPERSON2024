package DoctorsAbstract;

public class Cardiologist extends Doctor {
    public Cardiologist(String name) {
        super(name);
    }

    public String getSchedule() {
        return "M,W,F - 9 AM to 6 PM";
    }
}
