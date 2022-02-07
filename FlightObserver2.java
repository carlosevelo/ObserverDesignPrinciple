public class FlightObserver2 implements Observer {
    private Flight flight = null;

    public void Update(FlightFeed ff) {

        float deltaVelo = 0;
        float deltaAlt = 0;
        float deltaLat = 0;
        float deltaLong = 0;

        if (flight == null) {
            deltaLong = ff.getFlight().longitude - 0;
            deltaLat = ff.getFlight().latitude - 0;
            deltaVelo = ff.getFlight().velocity - 0;
            deltaAlt = ff.getFlight().geo_altitude - 0;
        }
        else {
            deltaLong = ff.getFlight().longitude - flight.longitude;
            deltaLat = ff.getFlight().latitude - flight.latitude;
            deltaVelo = ff.getFlight().velocity - flight.velocity;
            deltaAlt = ff.getFlight().geo_altitude - flight.geo_altitude;
        }

        System.out.println("Delta Long: " + deltaLong);
        System.out.println("Delta Lat: " + deltaLat);
        System.out.println("Delta Velo: " + deltaVelo);
        System.out.println("Delta Alt: " + deltaAlt);

        flight = ff.getFlight();
    }
}
