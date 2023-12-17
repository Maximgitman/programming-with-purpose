public class GreatCircle {
    public static void main(String[] args) {
        // Const
        double R = 6.371;

        // Read parameters and conver degrees into radians
        double lat1 = Math.toRadians(Double.parseDouble(args[0]));
        double long1 = Math.toRadians(Double.parseDouble(args[1]));
        double lat2 = Math.toRadians(Double.parseDouble(args[2]));
        double long2 = Math.toRadians(Double.parseDouble(args[3]));

        // Calculate distance
        double deltaLat = lat2 - lat1;
        double deltaLong = long2 - long1;
        double a = (Math.sin(deltaLat / 2) * Math.sin(deltaLat / 2))
                + Math.cos(lat1) * Math.cos(lat2) * (Math.sin(deltaLong / 2) * Math.sin(deltaLong / 2));
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distance = (R * c) * 1000;

        // Print distance between 2 points in km
        System.out.println(distance + " kilometers");
    }
}