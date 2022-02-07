public class FlightObserver1 implements Observer {
    private Flight flight = null;

    public void Update(FlightFeed ff) {
        flight = ff.getFlight();

        System.out.println(flight.toString());
    }
}
