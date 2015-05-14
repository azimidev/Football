package uk.ac.kingston.ci5100.football.pair2.view;

import java.awt.Color;
import java.util.Collections;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import uk.ac.kingston.ci5100.football.pair2.Football;
import uk.ac.kingston.ci5100.football.pair2.model.ApplicationModel;
import uk.ac.kingston.ci5100.football.pair2.model.CupMatches;
import uk.ac.kingston.ci5100.football.pair2.model.LeagueMatches;
import uk.ac.kingston.ci5100.football.pair2.model.Matches;

/**
 * The ApplicationViewer is create by the ApplicationControl when the application starts. If the ApplicationModel has data in it then this data is added to the viewer on creation. Currently a simple JTextArea is the only component this will be improved. The ApplicationViwer is updated whenever data is added or changed
 *
 * @author Hassan Azimi
 */
@SuppressWarnings("serial")
public class ApplicationViewer extends javax.swing.JFrame {

    private int teamNum = 0;

    /**
     * Constructor Creates a frame, sets the title, gets the football object as an array list and adds it to the frame.
     */
    public ApplicationViewer() {

        // GUI method
        initComponents();
        // Display Football
        if (ApplicationModel.getFootball() != null) {
            Collections.sort(ApplicationModel.getFootball());
            jTextArea1.append(
                    "------------------------------------------------------------------------------------------------------------------------------------------------------------\n"
                    + "#       Name\t\tCoaches\t\t\t\t\t\tTotal Coaches\tLeague\tDevision\tF/T-Time\n"
                    + "------------------------------------------------------------------------------------------------------------------------------------------------------------\n\n");
            for (Football f : ApplicationModel.getFootball()) {
                jTextArea1.append(++teamNum + ".     ");
                jTextArea1.append(f.toString());
            }
        }
        // Display Matches
        if (ApplicationModel.getDataModel() != null) {
            Collections.sort(ApplicationModel.getDataModel());
            jTextArea2.append(
                    "------------------------------------------------------------------------------------------------------------------------------------------------------------\n"
                    + "       Team Name\t\tResult\tDate\tOponents\t\tAttendance\n"
                    + "------------------------------------------------------------------------------------------------------------------------------------------------------------\n\n");
            for (Matches d : ApplicationModel.getDataModel()) {
                jTextArea2.append(d.toString());
            }
        }
        // Display League Matches
        if (ApplicationModel.getLeagueMatch() != null) {
            Collections.sort(ApplicationModel.getLeagueMatch());
            jTextArea3.append(
                    "------------------------------------------------------------------------------------------------------------------------------------------------------------\n"
                    + "       Team Name\t\tResult\tDate\tOponents\t\tAttendance\tTicket Price\tAway Fans\n"
                    + "------------------------------------------------------------------------------------------------------------------------------------------------------------\n\n");
            for (LeagueMatches l : ApplicationModel.getLeagueMatch()) {
                jTextArea3.append(l.toString());
            }
        }
        // Display Cup Matches
        if (ApplicationModel.getLeagueMatch() != null) {
            Collections.sort(ApplicationModel.getCupMatch());
            jTextArea4.append(
                    "------------------------------------------------------------------------------------------------------------------------------------------------------------\n"
                    + "       Team Name\t\tResult\tDate\tOponents\t\tAttendance\tRound\tVenue\n"
                    + "------------------------------------------------------------------------------------------------------------------------------------------------------------\n\n");
            for (CupMatches c : ApplicationModel.getCupMatch()) {
                jTextArea4.append(c.toString());
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rGroup = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        totalCoach = new javax.swing.JButton();
        totalTeam = new javax.swing.JButton();
        conference = new javax.swing.JRadioButton();
        national = new javax.swing.JRadioButton();
        tNumber = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setBackground(new java.awt.Color(209, 232, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setToolTipText("Team Names");
        jTextArea1.setDragEnabled(false);
        jScrollPane1.setViewportView(jTextArea1);

        jTabbedPane1.addTab("Teams", jScrollPane1);

        jTextArea2.setBackground(new java.awt.Color(255, 209, 209));
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setToolTipText("Matches");
        jTextArea2.setDragEnabled(false);
        jScrollPane2.setViewportView(jTextArea2);

        jTabbedPane1.addTab("Matches", jScrollPane2);

        jTextArea3.setBackground(new java.awt.Color(255, 255, 209));
        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jTextArea3.setToolTipText("League Matches");
        jScrollPane3.setViewportView(jTextArea3);

        jTabbedPane1.addTab("League Matches", jScrollPane3);

        jTextArea4.setBackground(new java.awt.Color(209, 255, 209));
        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jTextArea4.setToolTipText("Cup Matches");
        jScrollPane4.setViewportView(jTextArea4);

        jTabbedPane1.addTab("Cup Matches", jScrollPane4);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("User Stroy 1-4"));
        jPanel1.setToolTipText("Phase one panel");
        jPanel1.setPreferredSize(new java.awt.Dimension(412, 70));

        totalCoach.setText("Total Coaches");
        totalCoach.setToolTipText("Click to see toal number of coaches");
        totalCoach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalCoachActionPerformed(evt);
            }
        });

        totalTeam.setText("Total Team");
        totalTeam.setToolTipText("Click to see total number of teams");
        totalTeam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalTeamActionPerformed(evt);
            }
        });

        rGroup.add(conference);
        conference.setText("Conference");
        conference.setToolTipText("Click to see total number of Conference League");
        conference.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conferenceActionPerformed(evt);
            }
        });

        rGroup.add(national);
        national.setText("National");
        national.setToolTipText("Click to see total number of National League");
        national.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nationalActionPerformed(evt);
            }
        });

        tNumber.setText("total number");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(totalCoach, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(totalTeam, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(conference)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(national))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(tNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(conference)
                        .addComponent(national))
                    .addComponent(totalCoach))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalTeam)
                    .addComponent(tNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("User Story 5"));
        jPanel2.setToolTipText("User Story 5");
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Team name (Click Here!)");
        jLabel1.setToolTipText("<html>Click here and enter the team name to <br/>\nsee the average attendance for each team. </html>");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.setRequestFocusEnabled(false);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Average attendance");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(60, 60, 60))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("User Story 6"));
        jPanel5.setToolTipText("User Stoty 6");
        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jButton2.setText("League Result");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2, java.awt.BorderLayout.CENTER);

        jButton3.setText("Cup Result");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3, java.awt.BorderLayout.PAGE_START);

        jButton4.setText("Total Team Attendance");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton4, java.awt.BorderLayout.PAGE_END);

        jButton5.setText("Total Team Income");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton5, java.awt.BorderLayout.LINE_END);

        jButton1.setForeground(new java.awt.Color(255, 0, 51));
        jButton1.setText("Exit");
        jButton1.setToolTipText("Click here to exit!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("User Story 7 & 8"));
        jPanel3.setToolTipText("User Story 7 & 8");
        jPanel3.setLayout(new java.awt.BorderLayout());

        jButton6.setText("Total Away Fans");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6, java.awt.BorderLayout.CENTER);

        jButton7.setText("Attendance & Away Fans Chart");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7, java.awt.BorderLayout.PAGE_START);

        jButton8.setText("Income & Lost Chart");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton8, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void totalTeamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalTeamActionPerformed
        JOptionPane.showMessageDialog(null, "Total number of teams: " + teamNum, "Total Team", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_totalTeamActionPerformed

    private void totalCoachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalCoachActionPerformed
        JOptionPane.showMessageDialog(null, "Total number of coaches: " + ApplicationModel.getAllCoaches(), "Total Team", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_totalCoachActionPerformed

    private void conferenceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conferenceActionPerformed
        String con = Integer.toString(ApplicationModel.getConferenceCoaches());
        tNumber.setText(con);
    }//GEN-LAST:event_conferenceActionPerformed

    private void nationalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nationalActionPerformed
        String nat = Integer.toString(ApplicationModel.getNationalCoaches());
        tNumber.setText(nat);
    }//GEN-LAST:event_nationalActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        String teamName = JOptionPane.showInputDialog(null, "Enter the team name exactly as it is:", "Average Attendance", JOptionPane.INFORMATION_MESSAGE);
        jLabel1.setText(teamName);
        int totalAve = ApplicationModel.getAveAttendance(teamName);
        String ave = Integer.toString(totalAve);
        if ((teamName != null) && (!(teamName.equals("")))) {
            jLabel1.setForeground(Color.MAGENTA);
            jLabel2.setText("Average Attendance = " + ave);
            jLabel2.setForeground(Color.MAGENTA);
        } else {
            jLabel1.setText("CLICK AGAIN!");
            jLabel1.setForeground(Color.RED);
            jLabel2.setText("You didn't enter anything!");
            jLabel2.setForeground(Color.RED);
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed
//League Result
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String teamName = JOptionPane.showInputDialog(null, "Enter the team name for league matches results:", "League Matches", JOptionPane.PLAIN_MESSAGE);
        if ((teamName != null) && (!(teamName.equals("")))) {
            if (ApplicationModel.getTeamLeagueResult(teamName) == "") {
                JOptionPane.showMessageDialog(null, "No result founded for this team!", "League Result for (" + teamName + ")", JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, ApplicationModel.getTeamLeagueResult(teamName), "League Result for (" + teamName + ")", JOptionPane.PLAIN_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "You did not type anything or canceled!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed
//Cup Result
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String teamName = JOptionPane.showInputDialog(null, "Enter the team name for cup matches results:", "Cup Matches", JOptionPane.PLAIN_MESSAGE);
        if ((teamName != null) && (!(teamName.equals("")))) {
            if (ApplicationModel.getTeamCupResult(teamName) == "") {
                JOptionPane.showMessageDialog(null, "No result founded for this team!", "Cup Result for (" + teamName + ")", JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, ApplicationModel.getTeamCupResult(teamName), "Cup Result for (" + teamName + ")", JOptionPane.PLAIN_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "You did not type anything or canceled!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton3ActionPerformed
//Total Team Attendance
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String teamName = JOptionPane.showInputDialog(null, "Enter the team name for total attendance:", "Total Attendance", JOptionPane.PLAIN_MESSAGE);
        if ((teamName != null) && (!(teamName.equals("")))) {
            if (ApplicationModel.getTotalAttendance(teamName) == 0) {
                JOptionPane.showMessageDialog(null, "No result founded for this team!", "Total Attendance for (" + teamName + ")", JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Total Attendance: " + ApplicationModel.getTotalAttendance(teamName), "Team Name: (" + teamName + ")", JOptionPane.PLAIN_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "You did not type anything or canceled!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton4ActionPerformed
//Total Team Income
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String teamName = JOptionPane.showInputDialog(null, "Enter the team name for total income:", "Total Income", JOptionPane.PLAIN_MESSAGE);
        if ((teamName != null) && (!(teamName.equals("")))) {
            if (ApplicationModel.getIncome(teamName) == 0) {
                JOptionPane.showMessageDialog(null, "No result founded for this team!", "Total Income for (" + teamName + ")", JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Total Income: £" + ApplicationModel.getIncome(teamName), "Team Name: (" + teamName + ")", JOptionPane.PLAIN_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "You did not type anything or canceled!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String teamName = JOptionPane.showInputDialog(null, "Enter the team name for total away fans:", "Total Away Fans", JOptionPane.PLAIN_MESSAGE);
        if ((teamName != null) && (!(teamName.equals("")))) {
            if (ApplicationModel.getTotalAwayFans(teamName) == 0) {
                JOptionPane.showMessageDialog(null, "No result founded for this team!", "Total Away Fans for (" + teamName + ")", JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Total Away Fans: " + ApplicationModel.getTotalAwayFans(teamName), "Team Name: (" + teamName + ")", JOptionPane.PLAIN_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "You did not type anything or canceled!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        String teamName = JOptionPane.showInputDialog(null, "Enter the team name for attendance & away fans", "Bar Chart", JOptionPane.PLAIN_MESSAGE);
        if ((teamName != null) && (!(teamName.equals("")))) {
            if (ApplicationModel.getTotalAwayFans(teamName) == 0 && ApplicationModel.getTotalAttendance(teamName) == 0) {
                JOptionPane.showMessageDialog(null, "No result founded for this team!", "No Chart for (" + teamName + ")", JOptionPane.WARNING_MESSAGE);
            } else {
                /* Bar Chart */
                DefaultCategoryDataset dataset = new DefaultCategoryDataset();
                dataset.setValue(ApplicationModel.getAveAttendance(teamName), "Average Attendance", teamName);
                dataset.setValue(ApplicationModel.getTotalAwayFans(teamName), "Away Fans", teamName);
                dataset.setValue(ApplicationModel.getTotalAttendance(teamName), "Total Attendance", teamName);
                JFreeChart chart1 = ChartFactory.createBarChart("Results for " + teamName, "Average Attendance       Away Fans       Total Attendance", "Numbers", dataset, PlotOrientation.VERTICAL, false, true, false);
                CategoryPlot b = chart1.getCategoryPlot();
                chart1.setBackgroundPaint(Color.ORANGE); // Change my chart background
                b.setRangeGridlinePaint(Color.BLACK);
                ChartFrame frame1 = new ChartFrame("Bar Chart", chart1);
                frame1.setVisible(true); // Visible
                frame1.setSize(500, 500); // Size of the chart
                frame1.setLocationRelativeTo(null); // Center my chart for the screen
            }
        } else {
            JOptionPane.showMessageDialog(null, "Could not find Anything!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        String teamName = JOptionPane.showInputDialog(null, "Enter the team name for income and lost chart", "Pie Chart", JOptionPane.PLAIN_MESSAGE);
        if ((teamName != null) && (!(teamName.equals("")))) {
            if (ApplicationModel.getIncome(teamName) == 0 && ApplicationModel.getLost(teamName) == 0) {
                JOptionPane.showMessageDialog(null, "No result founded for this team!", "No Chart for (" + teamName + ")", JOptionPane.WARNING_MESSAGE);
            } else {
                /* Pie Chart */
                DefaultPieDataset pieDataset = new DefaultPieDataset();
                pieDataset.setValue("Total Income", new Double(ApplicationModel.getIncome(teamName)));
                pieDataset.setValue("Total Lost", new Double(ApplicationModel.getLost(teamName)));
                JFreeChart chart2 = ChartFactory.createPieChart("Results for " + teamName, pieDataset, true, true, true);
                chart2.setBackgroundPaint(Color.ORANGE); // Change my chart background
                PiePlot p = (PiePlot) chart2.getPlot();
                ChartFrame frame = new ChartFrame("Pie Chart", chart2);
                frame.setVisible(true); // Visible
                frame.setSize(500, 500); // Size of the chart
                frame.setLocationRelativeTo(null); // Center my chart for the screen
            }
        } else {
            JOptionPane.showMessageDialog(null, "You did not type anything or canceled!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton conference;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JRadioButton national;
    private javax.swing.ButtonGroup rGroup;
    private javax.swing.JTextField tNumber;
    private javax.swing.JButton totalCoach;
    private javax.swing.JButton totalTeam;
    // End of variables declaration//GEN-END:variables

}
