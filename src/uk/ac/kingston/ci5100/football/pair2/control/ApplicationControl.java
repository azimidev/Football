package uk.ac.kingston.ci5100.football.pair2.control;

import javax.swing.UnsupportedLookAndFeelException;
import uk.ac.kingston.ci5100.football.pair2.model.ApplicationModel;
import uk.ac.kingston.ci5100.football.pair2.utils.DataFiles;
import uk.ac.kingston.ci5100.football.pair2.view.ApplicationViewer;

/**
 *
 * @author Hassan Azimi
 */
public class ApplicationControl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ApplicationModel.setFootball(DataFiles.readFootballAsList("files/football_co2090.csv"));
        ApplicationModel.setDataModel(DataFiles.readMatchesAsList("files/football-matches.csv"));
        ApplicationModel.setLeagueMatch(DataFiles.readLeagueMatchesAsList("files/football-leaguematches.csv"));
        ApplicationModel.setCupMatch(DataFiles.readCupMatchesAsList("files/football-cupmatches.csv"));

        // Java LookAndFeel
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Mac OS X".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            System.err.println(e);
        }
        new ApplicationViewer().setVisible(true);
    }
}
