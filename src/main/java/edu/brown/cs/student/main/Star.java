package edu.brown.cs.student.main;

/**
 * A class that stores an individual star's info.
 */
public class Star {

  private final int id;
  private final String name;
  private final Double x;
  private final Double y;
  private final Double z;

  /**
   * Constructor for a star object.
   * @param id - The unique id of the star.
   * @param name - The name of the star.
   * @param x - The x value of the star's position.
   * @param y - The y value of the star's position.
   * @param z - The z value of the star's position.
   */
  public Star(int id, String name, Double x, Double y, Double z) {
    this.id = id;
    this.name = name;
    this.x = x;
    this.y = y;
    this.z = z;
  }

  /**
   * Calculates the distance between the star and a given point.
   * @param xCoord - The x coordinate of the given point.
   * @param yCoord - The y coordinate of the given point.
   * @param zCoord - The z coordinate of the given point.
   * @return - The distance.
   */
  public Double getDistance(Double xCoord, Double yCoord, Double zCoord) {
    return Math.sqrt(Math.pow(this.x - xCoord, 2) + Math.pow(this.y - yCoord, 2)
        + Math.pow(this.z - zCoord, 2));
  }

  /**
   * Gets the position of the star as an array with [x, y, z].
   * @return - The star's coordinates in an array.
   */
  public Double[] getPosition() {
    return new Double[]{this.x, this.y, this.z};
  }

  /**
   * Gets the name of the star.
   * @return - The name of the star.
   */
  public String getName() {
    return this.name;
  }
}
