package uk.ac.kingston.ci5100.football.pair2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Hassan Azimi
 */
public class Football implements Comparable<Football> {

    private String[] names;
    private String coaches;
    private String league;
    private String division;
    private boolean fullTime;

    public Football() {
    }

    /**
     * The Constructor assigns the values given to the attributes
     *
     * @param names
     * @param coaches
     * @param league
     * @param devision
     * @param fullTime
     */
    public Football(String[] names, String coaches, String league, String devision, boolean fullTime) {
        this.names = names;
        this.coaches = coaches;
        this.league = league;
        this.division = devision;
        this.fullTime = fullTime;
    }

    /**
     * Overloading Constructor
     *
     * @param csvString reads specified string as an array and separates it by comma
     */
    public Football(String csvString) {
        String[] attributes = csvString.split(",");
        int i = 0;
        for (String s : attributes) {
            switch (i) {
                case 0:
                    this.names = getStringAsArray(s);
                    break;
                case 1:
                    this.coaches = s;
                    break;
                case 2:
                    this.league = s;
                    break;
                case 3:
                    this.division = s;
                    break;
                case 4:
                    setFullTime(s);
                    break;
            }
            i++;
        }
    }

    /**
     * Get the value of names
     *
     * @return the value of names
     */
    public String[] getNames() {
        return names;
    }

    /**
     * Set the value of names
     *
     * @param names new value of names
     */
    public void setNames(String[] names) {
        this.names = names;
    }

    /**
     * Get the value of fullTime
     *
     * @return the value of fullTime
     */
    public boolean isFullTime() {
        return fullTime;
    }

    /**
     * Set the value of fullTime
     *
     * @param fullTime new value of fullTime
     */
    public void setFullTime(boolean fullTime) {
        this.fullTime = fullTime;
    }

    /**
     * Get the value of devision
     *
     * @return the value of devision
     */
    public String getDevision() {
        return division;
    }

    /**
     * Set the value of devision
     *
     * @param devision new value of devision
     */
    public void setDevision(String devision) {
        this.division = devision;
    }

    /**
     * Get the value of league
     *
     * @return the value of league
     */
    public String getLeague() {
        return league;
    }

    /**
     * Set the value of league
     *
     * @param league new value of league
     */
    public void setLeague(String league) {
        this.league = league;
    }

    /**
     * Get the value of coaches
     *
     * @return the value of coaches
     */
    public String getCoaches() {
        return coaches;
    }

    /**
     * Set the value of coaches
     *
     * @param coaches new value of coaches
     */
    public void setCoaches(String coaches) {
        this.coaches = coaches;
    }

    /**
     * Convert array of Strings into one String
     *
     * @param a target array of Strings
     * @return single string comprised of all the array elements separated by spaces
     */
    public static String getArrayAsString(String[] a) {
        String result = "";
        for (String s : a) {
            result += s + " ";
        }
        result = result.trim();
        return result;
    }

    /**
     * Convert a String to an array of String
     *
     * @param s a String for conversion
     * @return array of Strings, separated at the space characters
     */
    public static String[] getStringAsArray(String s) {
        String[] result = s.split(" ");
        return result;
    }

    public String[] getCoachesAsArray(String s) {
        String[] result = s.split(":");
        return result;
    }

    /**
     * Gets the number of colons for each teams from coaches attribute and adds one to them
     *
     * @return number of coaches for each teams
     */
    public int getCoachesNumber() {
        int counter = 1;
        for (Character c : coaches.toCharArray()) {
            if (c.equals(':')) {
                counter++;
            }
        }
        return counter;
    }

    /**
     * This will count the all colons in the file
     *
     * @return total number of colons in the file
     */
    public static int countColons() {
        String csvFile = "files/football_co2090.csv";
        int count = 0;
        BufferedReader in;
        try {
            in = new BufferedReader(new InputStreamReader(new FileInputStream(csvFile)));
            int c;
            while ((c = in.read()) >= 0) {
                if (c == ':') {
                    count++;
                }
            }
        } catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
        return count;
    }

    /**
     * Sets the names
     *
     * @param names as a String separated by spaces
     */
    public void setNames(String names) {
        this.names = getStringAsArray(names);
    }

    /**
     * Gets the names
     *
     * @return names as a String separated by spaces
     */
    public String getNamesAsString() {
        return getArrayAsString(names);
    }

    /**
     * Sets the full time states of the student
     *
     * @param fulltime
     */
    public void setFullTime(String fulltime) {
        this.fullTime = !fulltime.equals("no");
    }

    /**
     * Decides whether team data is full time or part time
     *
     * @return a String either full-time or part-time
     */
    public String getFullTimeAsString() {
        if (fullTime) {
            return "Full-Time";
        } else {
            return "Part-Time";
        }
    }

    /**
     * This method overrides the 'toString' method organizing the data in an easier read layout
     *
     * @return attributes of each team as a string
     */
    @Override
    public String toString() {
        return getNamesAsString() + "\t" + getCoaches() + "\t" + getCoachesNumber() + "\t" + getLeague()
                + "\t" + getDevision() + "\t" + getFullTimeAsString() + "\n";
    }

    /**
     * Compares football league names without being case sensitive
     *
     * @param o football object to be compared
     * @return a negative integer, 0 or a positive integer
     */
    @Override
    public int compareTo(Football o) {
        return this.getLeague().compareToIgnoreCase(o.getLeague());
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String csvFile = "files/football_co2090.csv";
        BufferedReader infile = null;
        // Try with Resources JAVA 7
        try {
            infile = new BufferedReader(new FileReader(csvFile));
            //Read the header file and ignore
            String csvString = infile.readLine();
            while ((csvString = infile.readLine()) != null) {
                Football f = new Football(csvString);
                System.out.println(f);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
