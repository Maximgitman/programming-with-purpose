/* *****************************************************************************
 *  Name: Maksim Gorev
 *  Specification: The great-circle distance is the length of the shortest path 
 *                 between two points (x1,y1) and (x2,y2) on the surface of a sphere, 
 *                 where the path is constrained to be along the surface.
 *  Write a program GreatCircle.java that takes four double command-line 
 *  arguments x1, y1, x2, and y2 the latitude and longitude (in degrees) 
 *  of two points on the surface of the earth—and prints the great-circle 
 *  distance (in kilometers) between them. Use the following Haversine formula
 *  where r=6,371.0 is the mean radius of the Earth (in kilometers).
 **************************************************************************** */

public class GreatCircle {
    public static void main(String[] args) {
        // Const
        double earthRadius = 6371.0;

        // Read parameters and conver degrees into radians
        double lat1 = Math.toRadians(Double.parseDouble(args[0]));
        double long1 = Math.toRadians(Double.parseDouble(args[1]));
        double lat2 = Math.toRadians(Double.parseDouble(args[2]));
        double long2 = Math.toRadians(Double.parseDouble(args[3]));

        // Calculate distance
        double deltaLat = lat2 - lat1;
        double deltaLong = long2 - long1;
        double a = Math.min(1.0, (Math.sin(deltaLat / 2) * Math.sin(deltaLat / 2))
                + Math.cos(lat1) * Math.cos(lat2) * (Math.sin(deltaLong / 2)
                * Math.sin(deltaLong / 2)));
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distance = earthRadius * c;

        // Print distance between 2 points in km
        System.out.println(distance + " kilometers");
    }
}