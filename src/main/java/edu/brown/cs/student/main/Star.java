package edu.brown.cs.student.main;

/**
 * A class that stores an individual star's info.
 */
public class Star {

  private int id;
  private String name;
  private Double x;
  private Double y;
  private Double z;

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
}
