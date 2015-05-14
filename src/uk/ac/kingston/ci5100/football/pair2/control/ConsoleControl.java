package uk.ac.kingston.ci5100.football.pair2.control;

import uk.ac.kingston.ci5100.football.pair2.Football;
import uk.ac.kingston.ci5100.football.pair2.model.ApplicationModel;
import uk.ac.kingston.ci5100.football.pair2.model.CupMatches;
import uk.ac.kingston.ci5100.football.pair2.model.LeagueMatches;
import uk.ac.kingston.ci5100.football.pair2.model.Matches;
import uk.ac.kingston.ci5100.football.pair2.utils.DataFiles;

/**
 * @author Hassan Azimi
 */
public class ConsoleControl {

    /**
     * Display the files and results in the console
     *
     * @param args
     */
    public static void main(String[] args) {
        ApplicationModel.setFootball(DataFiles.readFootballAsList("files/football_co2090.csv"));
        ApplicationModel.setDataModel(DataFiles.readMatchesAsList("files/football-matches.csv"));
        ApplicationModel.setLeagueMatch(DataFiles.readLeagueMatchesAsList("files/football-leaguematches.csv"));
        ApplicationModel.setCupMatch(DataFiles.readCupMatchesAsList("files/football-cupmatches.csv"));

        for (Football f : ApplicationModel.getFootball()) {
            System.out.println(f);
        }
        for (Matches d : ApplicationModel.getDataModel()) {
            System.out.println(d);
        }
        for (LeagueMatches l : ApplicationModel.getLeagueMatch()) {
            System.out.println(l);
        }
        for (CupMatches c : ApplicationModel.getCupMatch()) {
            System.out.println(c);
        }
    }
}
