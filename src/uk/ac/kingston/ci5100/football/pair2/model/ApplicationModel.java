package uk.ac.kingston.ci5100.football.pair2.model;

import java.util.ArrayList;
import uk.ac.kingston.ci5100.football.pair2.Football;

/**
 *
 * @author Hassan Azimi
 */
public class ApplicationModel {

    private static ArrayList<Football> football;
    private static ArrayList<Matches> dataModel;
    private static ArrayList<LeagueMatches> leagueMatch;
    private static ArrayList<CupMatches> cupMatch;

    /**
     * @return the cupMatch
     */
    public static ArrayList<CupMatches> getCupMatch() {
        return cupMatch;
    }

    /**
     * @param aCupMatch the cupMatch to set
     */
    public static void setCupMatch(ArrayList<CupMatches> aCupMatch) {
        cupMatch = aCupMatch;
    }

    /**
     * @return the leagueMatch
     */
    public static ArrayList<LeagueMatches> getLeagueMatch() {
        return leagueMatch;
    }

    /**
     * @param aLeagueMatch the leagueMatch to set
     */
    public static void setLeagueMatch(ArrayList<LeagueMatches> aLeagueMatch) {
        leagueMatch = aLeagueMatch;
    }

    /**
     * Get the value of dataModel
     *
     * @return the value of dataModel
     */
    @SuppressWarnings("ReturnOfCollectionOrArrayField")
    public static ArrayList<Matches> getDataModel() {
        return dataModel;
    }

    /**
     * Set the value of dataModel
     *
     * @param dataModel
     */
    @SuppressWarnings("AssignmentToCollectionOrArrayFieldFromParameter")
    public static void setDataModel(ArrayList<Matches> dataModel) {
        ApplicationModel.dataModel = dataModel;
    }

    /**
     * Get the value of football
     *
     * @return the value of football
     */
    @SuppressWarnings("ReturnOfCollectionOrArrayField")
    public static ArrayList<Football> getFootball() {
        return football;
    }

    /**
     * Set the value of football
     *
     * @param football new value of football
     */
    @SuppressWarnings("AssignmentToCollectionOrArrayFieldFromParameter")
    public static void setFootball(ArrayList<Football> football) {
        ApplicationModel.football = football;
    }

    /**
     * Gets all league names
     *
     * @return the total Conference leagues
     */
    public static int getConferenceCoaches() {
        int conferenceCoaches = 0;
        for (Football f : ApplicationModel.getFootball()) {
            if (f.getLeague().equals("Conference")) {
                int coachLength = f.getCoachesNumber();
                conferenceCoaches += coachLength;
            }
        }
        return conferenceCoaches;
    }

    /**
     * Gets all league names
     *
     * @return the total National leagues
     */
    public static int getNationalCoaches() {
        int nationalCoaches = 0;
        for (Football f : ApplicationModel.getFootball()) {
            if (f.getLeague().equals("National")) {
                int coachLength = f.getCoachesNumber();
                nationalCoaches += coachLength;
            }
        }
        return nationalCoaches;
    }

    /**
     *
     * @return total number of coaches
     */
    public static int getAllCoaches() {
        int totalCoaches = 0;
        for (Football f : ApplicationModel.getFootball()) {
            int coachLength = f.getCoachesNumber();
            totalCoaches += coachLength;
        }
        return totalCoaches;
    }

    /**
     * Gets Matches Object
     *
     * @return all result in a String
     */
    public static String dataModelListToString() {
        String result = "";
        for (Matches one : dataModel) {
            result += one.toString();
        }
        return result;
    }

    /**
     *
     * @param attendance gets team name
     * @return average attendance for each team
     */
    public static int getAveAttendance(String attendance) {
        ArrayList<Matches> footballAttendance = new ArrayList<Matches>();
        for (Matches dataModel1 : dataModel) {
            if (dataModel1 != null && dataModel1.getTeamname().equalsIgnoreCase(attendance)) {
                footballAttendance.add(dataModel1);
            }
        }
        int total = 0;
        for (Matches dataModel2 : footballAttendance) {
            total += dataModel2.getAttendance() / footballAttendance.size();
        }
        return total;
    }

    /**
     *
     * @param attendance gets team name
     * @return total attendance for each team
     */
    public static int getTotalAttendance(String attendance) {
        ArrayList<Matches> footballAttendance = new ArrayList<Matches>();
        for (Matches dataModel1 : dataModel) {
            if (dataModel1 != null && dataModel1.getTeamname().equalsIgnoreCase(attendance)) {
                footballAttendance.add(dataModel1);
            }
        }
        int total = 0;
        for (Matches dataModel2 : footballAttendance) {
            total += dataModel2.getAttendance();
        }
        return total;
    }

    /**
     *
     * @param result gets team name
     * @return League results including opponent name and the result
     */
    public static String getTeamLeagueResult(String result) {
        ArrayList<LeagueMatches> leagueList = new ArrayList<LeagueMatches>();
        for (LeagueMatches leagueMatches1 : leagueMatch) {
            if (leagueMatches1 != null && leagueMatches1.getTeamname().equalsIgnoreCase(result)) {
                leagueList.add(leagueMatches1);
            }
        }
        String l = "";
        for (LeagueMatches leagueMatches2 : leagueList) {
            l += "<html>Opponent: <b style=\"color:green;\">" + leagueMatches2.getOpponent() + "</b> | Result: <b style=\"color:red;\">" + leagueMatches2.getResult() + "</b></html>\n";
        }
        return l;
    }

    /**
     *
     * @param result gets the team name
     * @return Cup result including opponent name and the result
     */
    public static String getTeamCupResult(String result) {
        ArrayList<CupMatches> cupList = new ArrayList<CupMatches>();
        for (CupMatches cupMatches1 : cupMatch) {
            if (cupMatches1 != null && cupMatches1.getTeamname().equalsIgnoreCase(result)) {
                cupList.add(cupMatches1);
            }
        }
        String c = "";
        for (CupMatches cupMatches2 : cupList) {
            c += "<html>Opponent: <b style=\"color:green;\">" + cupMatches2.getOpponent() + "</b>\t | Result: <b style=\"color:red;\">" + cupMatches2.getResult() + "</b></html>\n";
        }
        return c;
    }

    /**
     *
     * @param income gets the team name
     * @return total income for the team
     */
    public static double getIncome(String income) {
        ArrayList<LeagueMatches> footballIncome = new ArrayList<LeagueMatches>();
        for (LeagueMatches income1 : leagueMatch) {
            if (income1 != null && income1.getTeamname().equalsIgnoreCase(income)) {
                footballIncome.add(income1);
            }
        }
        double total = 0;
        for (LeagueMatches income2 : footballIncome) {
            total += income2.getAttendance() * income2.getTicketPrice();
        }
        return total;
    }

    /**
     *
     * @param lost gets the team name
     * @return total lost for each team by getting away fans and multiplying by the ticket price
     */
    public static double getLost(String lost) {
        ArrayList<LeagueMatches> footballLost = new ArrayList<LeagueMatches>();
        for (LeagueMatches lost1 : leagueMatch) {
            if (lost1 != null && lost1.getTeamname().equalsIgnoreCase(lost)) {
                footballLost.add(lost1);
            }
        }
        double total = 0;
        for (LeagueMatches lost2 : footballLost) {
            total += lost2.getAwayFans() * lost2.getTicketPrice();
        }
        return total;
    }

    /**
     *
     * @param awayFans gets the team name
     * @return total away fans
     */
    public static int getTotalAwayFans(String awayFans) {
        ArrayList<LeagueMatches> footballAwayFans = new ArrayList<LeagueMatches>();
        for (LeagueMatches fans1 : leagueMatch) {
            if (fans1 != null && fans1.getTeamname().equalsIgnoreCase(awayFans)) {
                footballAwayFans.add(fans1);
            }
        }
        int total = 0;
        for (LeagueMatches fans2 : footballAwayFans) {
            total += fans2.getAwayFans();
        }
        return total;
    }
}
