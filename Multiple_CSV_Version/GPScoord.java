/**
 * Kien Do 300163370
 * CSI2520 - Paradigmes de programmation - Hiver 2022
 *
 * GPScoord class represents a latitude/longitude GPS coordinate on the map.
 */

public class GPScoord {

    // =========================== Attributes ==========================
    private double latitude;
    private double longitude;

    // =========================== Methods ==========================

    // ==== constructors START ====

    public GPScoord() {
        this.latitude = -1;
        this.longitude = -1;
    }

    public GPScoord(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    // ==== constructors END ====

    // ==== class methods START ====

    /**
     * Prints the LAT and LON coordinates of this GPScoord into the console in a readable format.
     * For the classic format (LAT, LON), use toString().
     */
    public void printCoordinates() {
        System.out.printf("LAT: %f\nLON: %f\n", this.latitude, this.longitude);
    }

    // ==== class methods END ====

    // ==== getters and setters START ====
    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    // ==== getters and setters END ====

    /**
     * toString() method returns the object in a string format.
     * @return Returns the GPS coordinate in the following format --> (LAT, LON)
     */
    @Override
    public String toString() {
        return String.format("(%f, %f)", this.latitude, this.longitude);
    }

} // end of GPScoord.java
