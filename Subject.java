import java.util.ArrayList;
import java.util.List;

abstract class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void Attach(Observer o) {
        observers.add(o);
    }

    public void Detach(Observer o) {
        observers.remove(o);
    }

    public void Notify(FlightFeed ff) {
        for (Observer o:observers) {
            o.Update(ff);
        }
    }
}
