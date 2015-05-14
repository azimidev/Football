package uk.ac.kingston.ci5100.football.pair2.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import uk.ac.kingston.ci5100.football.pair2.Football;
import uk.ac.kingston.ci5100.football.pair2.model.CupMatches;
import uk.ac.kingston.ci5100.football.pair2.model.LeagueMatches;
import uk.ac.kingston.ci5100.football.pair2.model.Matches;

/**
 *
 * @author Hassan Azimi
 */
public class DataFiles {

    /**
     *
     * @param csvFile reads the file from Football object
     * @return Football class as a array list
     */
    public static ArrayList<Football> readFootballAsList(String csvFile) {
        ArrayList<Football> football = new ArrayList<Football>();
        BufferedReader infile = null;
        String fileName = "football_co2090.csv";
        String csvString;
        try {
            infile = new BufferedReader(new FileReader(csvFile));
            csvString = infile.readLine();
            while (infile.ready()) {
                football.add(new Football(infile.readLine()));
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } finally {
            if (infile != null) {
                try {
                    infile.close();
                } catch (IOException e) {
                    System.err.println(e.getMessage());
                }
            }
        }
        return football;
    }

    /**
     *
     * @param fileName reads the file from Matches object
     * @return Matches class as a array list
     */
    public static ArrayList<Matches> readMatchesAsList(String fileName) {
        ArrayList<Matches> dataModel = new ArrayList<Matches>();
        String csvString;
        BufferedReader infile = null;
        try {
            infile = new BufferedReader(new FileReader(fileName));
            csvString = infile.readLine();
            while (infile.ready()) {
                csvString = infile.readLine();
                dataModel.add(new Matches(csvString) {
                });
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            if (infile != null) {
                try {
                    infile.close();
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }
            }
        }
        return dataModel;
    }

    /**
     *
     * @param fileName reads the file from LeagueMatches object
     * @return LeagueMatches class as a array list
     */
    public static ArrayList<LeagueMatches> readLeagueMatchesAsList(String fileName) {
        ArrayList<LeagueMatches> leagueMatches = new ArrayList<LeagueMatches>();
        String csvString;
        BufferedReader infile = null;
        try {
            infile = new BufferedReader(new FileReader(fileName));
            csvString = infile.readLine();
            while (infile.ready()) {
                csvString = infile.readLine();
                leagueMatches.add(new LeagueMatches(csvString));
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            if (infile != null) {
                try {
                    infile.close();
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }
            }
        }
        return leagueMatches;
    }

    /**
     *
     * @param fileName reads the file from CupMatches object
     * @return CupMatches class as a array list
     */
    public static ArrayList<CupMatches> readCupMatchesAsList(String fileName) {
        ArrayList<CupMatches> cupMatches = new ArrayList<CupMatches>();
        String csvString;
        BufferedReader infile = null;
        try {
            infile = new BufferedReader(new FileReader(fileName));
            csvString = infile.readLine();
            while (infile.ready()) {
                csvString = infile.readLine();
                cupMatches.add(new CupMatches(csvString));
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            if (infile != null) {
                try {
                    infile.close();
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }
            }
        }
        return cupMatches;
    }
}
