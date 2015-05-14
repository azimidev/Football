/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.kingston.ci5100.football.pair2.model;

import uk.ac.kingston.ci5100.football.pair2.utils.Convertors;

/**
 *
 * @author hasan_azimi0
 */
public final class CupMatches extends Matches {

    private int round;
    private String venue;

    /**
     *
     * @param csvString gets the file separated by comma and sets it to an array
     */
    public CupMatches(String csvString) {
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
                    this.setRound(Integer.parseInt(value));
                    break;
                case 6:
                    this.setVenue(value);
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
    protected int getRound() {
        return round;
    }

    /**
     * @param round
     */
    protected void setRound(int round) {
        this.round = round;
    }

    /**
     * @return the awayFans
     */
    protected String getVenue() {
        return venue;
    }

    /**
     * @param venue
     */
    protected void setVenue(String venue) {
        this.venue = venue;
    }

    /**
     * This method overrides the 'toString' method organizing the data in an easier read layout
     *
     * @return attributes of each team as a string
     */
    @Override
    public String toString() {
        return "       " + teamname + "  \t\t" + result + "\t" + date + "\t" + opponent + "            \t" + attendance + "\t" + round + "\t" + venue + "\n";
    }

    /**
     * Compares team names without being case sensitive
     *
     * @param o CupMatches object to be compared
     * @return a negative integer, 0 or a positive integer
     */
    public int compareTo(CupMatches o) {
        return this.getTeamname().compareToIgnoreCase(o.getTeamname());
    }
}
