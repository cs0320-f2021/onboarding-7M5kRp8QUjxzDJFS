package edu.brown.cs.student.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * This class stores star data and finds neighbors.
 */
public class StarData {

  private final List<Star> stars;

  /**
   * Constructor for a StarData object.
   * @param filename - The path to the CSV containing the star data.
   */
  public StarData(String filename) {
    this.stars = this.parseFile(filename);
  }

  /**
   * A method that reads the CSV and parses the star info.
   * @param filename - The path to the CSV containing the star data.
   * @return - An array list of star objects.
   */
  private List<Star> parseFile(String filename) {
    List<Star> output = new ArrayList<>();
    try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
      String line = br.readLine();
      if (!checkHeader(line)) {
        throw new IOException("Error: The header of the given file does not have the"
            + "correct columns.");
      } else {
        while (line != null) {
          try {
            String[] data = line.split(",");
            if (data[0].equals("StarID")) {
              line = br.readLine();
            } else {
              int id = Integer.parseInt(data[0]);
              Double x = Double.parseDouble(data[2]);
              Double y = Double.parseDouble(data[3]);
              Double z = Double.parseDouble(data[4]);
              Star star = new Star(id, data[1], x, y, z);
              output.add(id, star);
            }
          } catch (Exception e) {
            System.out.println("Error: Something went wrong processing your input.");
            System.out.println(e.getMessage());
          }
        }
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return output;
  }

  /**
   * A method that checks that the header of the CSV is correct.
   * @param header - The header of the CSV.
   * @return - True if correct, else false.
   */
  private boolean checkHeader(String header) {
    String[] data = header.split(",");
    return (data[0].equals("StarID") && data[1].equals("ProperName") && data[2].equals("X")
        && data[3].equals("Y") && data[4].equals("Z")) || (data.length != 5);
  }

  /**
   * Gets the stars field.
   * @return - The star field.
   */
  public List<Star> getStars() {
    return this.stars;
  }

}
