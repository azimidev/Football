package uk.ac.kingston.ci5100.football.pair2.model;

import uk.ac.kingston.ci5100.football.pair2.utils.Convertors;

/**
 *
 * @author Hassan Azimi
 */
public abstract class Matches implements Comparable<Matches> {

    protected String teamname;
    protected String result;
    protected String date;
    protected String opponent;
    protected int attendance;

    /**
     * Default Constructor
     */
    public Matches() {
    }

    /**
     * Default Constructor with 5 parameters
     *
     * @param teamname gets and sets teamname
     * @param result gets and sets result
     * @param date gets and sets date
     * @param opponent gets and sets opponent
     * @param attendance gets and sets attendance
     */
    public Matches(String teamname, String result, String date, String opponent, int attendance) {
        this.teamname = teamname;
        this.result = result;
        this.date = date;
        this.opponent = opponent;
        this.attendance = attendance;
    }

    /**
     *
     * @param csvString gets the file separated by comma and sets it to an array
     */
    public Matches(String csvString) {
        String[] attribute = Convertors.getStringAsArray(csvString, ",");
        for (int i = 0; i < attribute.length; i++) {
            String value = attribute[i];
            switch (i) {
                case 0:
                    this.setTeamname(value);
                    break;
                case 1:
                    this.setResult(value);
                    break;
                case 2:
                    this.setDate(value);
                    break;
                case 3:
                    this.setOpponent(value);
                    break;
                case 4:
                    this.setAttendance(Integer.parseInt(value));
                    break;
            }
        }
    }

    /**
     * @return the team name
     */
    protected String getTeamname() {
        return teamname;
    }

    /**
     * @param teamname the team name to set
     */
    protected void setTeamname(String teamname) {
        this.teamname = teamname;
    }

    /**
     * @return the result
     */
    protected String getResult() {
        return result;
    }

    /**
     * @param result the result to set
     */
    protected void setResult(String result) {
        this.result = result;
    }

    /**
     * @return the date
     */
    protected String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    protected void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the opponent
     */
    protected String getOpponent() {
        return opponent;
    }

    /**
     * @param opponent the opponent to set
     */
    protected void setOpponent(String opponent) {
        this.opponent = opponent;
    }

    /**
     * @return the attendance
     */
    protected int getAttendance() {
        return attendance;
    }

    /**
     * @param attendance the attendance to set
     */
    protected void setAttendance(int attendance) {
        this.attendance = attendance;
    }

    /**
     * This method overrides the 'toString' method organizing the data in an easier read layout
     *
     * @return attributes of each team as a string
     */
    @Override
    public String toString() {
        return "       " + teamname + "  \t\t" + result + "\t" + date + "\t" + opponent + "            \t" + attendance + "\n";
    }

    /**
     * Compares team names without being case sensitive
     *
     * @param o Matches object to be compared
     * @return a negative integer, 0 or a positive integer
     */
    @Override
    public int compareTo(Matches o) {
        return this.getTeamname().compareToIgnoreCase(o.getTeamname());
    }
}
