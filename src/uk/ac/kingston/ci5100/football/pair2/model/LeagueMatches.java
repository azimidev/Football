package uk.ac.kingston.ci5100.football.pair2.model;

import uk.ac.kingston.ci5100.football.pair2.utils.Convertors;

/**
 *
 * @author Hassan Azimi
 */
public final class LeagueMatches extends Matches {

    private double ticketPrice;
    private int awayFans;

    /**
     *
     * @param csvString gets the file separated by comma and sets it to an array
     */
    public LeagueMatches(String csvString) {
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
                case 5:
                    this.setTicketPrice(Double.parseDouble(value));
                    break;
                case 6:
                    this.setAwayFans(Integer.parseInt(value));
                    break;
            }
        }
    }

    /**
     *
     * @return the team name
     */
    protected String getTeamname() {
        return teamname;
    }

    /**
     *
     * @param teamname sets the team name
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
     * @return the ticketPrice
     */
    protected double getTicketPrice() {
        return ticketPrice;
    }

    /**
     * @param ticketPrice the ticketPrice to set
     */
    protected void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    /**
     * @return the awayFans
     */
    protected int getAwayFans() {
        return awayFans;
    }

    /**
     * @param awayFans the awayFans to set
     */
    protected void setAwayFans(int awayFans) {
        this.awayFans = awayFans;
    }

    /**
     * This method overrides the 'toString' method organizing the data in an easier read layout
     *
     * @return
     */
    @Override
    public String toString() {
        return "       " + teamname + "  \t\t" + result + "\t" + date + "\t" + opponent + "            \t" + attendance + "\t" + ticketPrice + "\t" + awayFans + "\n";
    }

    /**
     * Compares team names without being case sensitive
     *
     * @param o LeagueMatches object to be compared
     * @return a negative integer, 0 or a positive integer
     */
    public int compareTo(LeagueMatches o) {
        return this.getTeamname().compareToIgnoreCase(o.getTeamname());
    }
}
