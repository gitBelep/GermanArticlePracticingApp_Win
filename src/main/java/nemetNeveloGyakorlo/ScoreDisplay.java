package nemetNeveloGyakorlo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class ScoreDisplay extends JInternalFrame implements ActionListener {
    private final Container contentPane;
    private final Color color1 = new Color(20, 110, 200, 90);
    private final Color color2 = new Color(25, 170, 120, 90);
    private final FileOperations fo;
    private JButton button;
    private JPanel panel1;
    private JPanel panel20;
    private JPanel panel21Table;
    private JPanel panel22;
    private JPanel panel3;

    public ScoreDisplay(FileOperations fo) {
        this.fo = fo;
        setFrameIcon(new ImageIcon("c:\\NemetNeveloGyakorlo\\img\\i_ScoreDisplay.png"));
        setTitle("    Dicsőségtábla                   ");
        contentPane = this.getContentPane();
        contentPane.setVisible(true);
        contentPane.setBackground(new Color(150,200,200,140));
        addPanels();
        addComponentsToPanel1();
        addComponentsToPanel21();
        addComponentsToPanel20and22();
        addComponentsToPanel3();
        pack();           //Display the window.
        setVisible(true);
        setSize(800,800);
    }

    private void addPanels() {
        contentPane.setLayout(new GridBagLayout());
        GridBagConstraints cc = new GridBagConstraints();

        panel1 = new JPanel();
        panel1.setVisible(true);
        cc.ipady = 47;
        cc.fill = GridBagConstraints.HORIZONTAL;
        cc.weightx = 1;
        cc.weighty = 0;
        cc.gridx = 0;
        cc.gridy = 0;
        cc.gridwidth = 3;
        contentPane.add(panel1, cc);
        panel1.setOpaque(false);

        panel20 = new JPanel();
        panel20.setVisible(true);
        cc.ipady = 2;
        cc.fill = GridBagConstraints.NONE;
        cc.weightx = 0;
        cc.weighty = 0;
        cc.gridx = 0;
        cc.gridy = 1;
        cc.gridwidth = 1;
        contentPane.add(panel20, cc);
        panel20.setOpaque(false);

        panel21Table = new JPanel();
        panel21Table.setVisible(true);
        cc.ipady = 80;
        cc.fill = GridBagConstraints.HORIZONTAL;
        cc.weightx = 1;
        cc.weighty = 0;
        cc.gridx = 1;
        cc.gridy = 1;
        contentPane.add(panel21Table, cc);
        panel21Table.setOpaque(false);

        panel22 = new JPanel();
        panel22.setVisible(true);
        cc.ipady = 2;
        cc.fill = GridBagConstraints.NONE;
        cc.weightx = 0;
        cc.weighty = 0;
        cc.gridx = 2;
        cc.gridy = 1;
        contentPane.add(panel22, cc);
        panel22.setOpaque(false);

        panel3 = new JPanel();
        panel3.setVisible(true);
        cc.ipady = 653;
        cc.fill = GridBagConstraints.BOTH;
        cc.weightx = 1;
        cc.weighty = 1;
        cc.gridx = 0;
        cc.gridy = 2;
        cc.gridwidth = 3;
        contentPane.add(panel3, cc);
        panel3.setBorder(BorderFactory.createBevelBorder(1, color2, color1));
        panel3.setOpaque(false);
    }

    private void addComponentsToPanel1(){
        panel1.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        JLabel space00 = new JLabel("          ");
        space00.setFont(new Font("Arial", Font.BOLD, 18));
        c.ipady = 30;
        c.fill = GridBagConstraints.NONE;
        c.weightx = 0;
        c.weighty = 0;
        c.gridx = 0;
        c.gridy = 0;
        panel1.add(space00, c);

        Color stripeBgColor = new Color(20,160,100, 20);

        JLabel stripe = new JLabel("");
        stripe.setFont(new Font("Arial", Font.BOLD, 12));
        stripe.setOpaque(true);
        stripe.setBorder(BorderFactory.createSoftBevelBorder(1, color1, color2));
        stripe.setBackground(stripeBgColor);
        stripe.setBounds(0,0, 180, 20);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 1;
        c.weighty = 0;
        c.gridx = 1;
        c.gridy = 0;
        panel1.add(stripe, c);

        JLabel space02 = new JLabel("          ");
        space02.setFont(new Font("Arial", Font.BOLD, 18));
        c.ipady = 30;
        c.fill = GridBagConstraints.NONE;
        c.weightx = 0;
        c.weighty = 0;
        c.gridx = 2;
        c.gridy = 0;
        panel1.add(space02, c);

        button = new JButton(" BEZÁR ");
        button.setFont(new Font("Arial", Font.BOLD, 18));
        button.addActionListener(this);
        c.fill = GridBagConstraints.NONE;
        c.ipady = 30;
        c.weightx = 0;
        c.weighty = 0;
        c.gridx = 3;
        c.gridy = 0;
        panel1.add(button, c);

    }

    private void addComponentsToPanel21() {
        fo.gainBestPlayers();
        String[] column2 = {"NÉV", "ÖSSZEGYŰJTÖTT ARANYAK", "JÁTÉKOK SZÁMA"};
        String[][] data2 = get5BestPlayers();

        JTable jt2 = new JTable(data2, column2);
        jt2.getColumn("NÉV").setMinWidth(130);
        jt2.getColumn("ÖSSZEGYŰJTÖTT ARANYAK").setMinWidth(150);
        JScrollPane sp2 = new JScrollPane(jt2);
        panel21Table.add(sp2);
    }

    private void addComponentsToPanel20and22(){
        panel22.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        JLabel lImage20 = new JLabel(new ImageIcon("c:\\NemetNeveloGyakorlo\\img\\image_arany.png"));
        lImage20.setSize(251,200);
        c.ipady = 2;
        c.fill = GridBagConstraints.NONE;
        c.weightx = 0;
        c.weighty = 0;
        c.gridx = 0;
        c.gridy = 0;
        panel20.add(lImage20, c);

        JLabel lImage22 = new JLabel(new ImageIcon("c:\\NemetNeveloGyakorlo\\img\\image_kincs.png"));
        lImage22.setSize(210,200);
        c.ipady = 2;
        c.fill = GridBagConstraints.NONE;
        c.weightx = 0;
        c.weighty = 0;
        c.gridx = 0;
        c.gridy = 0;
        panel22.add(lImage22, c);
    }

    private void addComponentsToPanel3(){
        fo.gainOldScores();
        panel3.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        String[] column3 = {"NÉV", "SZÓTÁR", "PONTSZÁM","JÁTÉK", "DÁTUM"};
        String[][] data3 = provideLastScores();
        JTable jt3 = new JTable(data3, column3);
        JScrollPane sp3 = new JScrollPane(jt3);
        c.fill = GridBagConstraints.BOTH;
        c.weightx = 1;
        c.weighty = 1;
        c.gridx = 0;
        c.gridy = 0;
        panel3.add(sp3, c);
    }

    private String[][] get5BestPlayers(){
        FileOperations.BEST_PLAYERS.sort((b1,b2) -> b2.getSumGold() - b1.getSumGold());
        int maxFive = Math.min(FileOperations.BEST_PLAYERS.size(), 5);
        String[][] data = new String[maxFive][];
        for(int i = 0; i < maxFive; i++){
            BestPlayer b = FileOperations.BEST_PLAYERS.get(i);
            String[] player = {b.getName(), ""+ b.getSumGold(), ""+ b.getSumRounds()};
            data[i] = Arrays.copyOf(player, 3);
        }
        return data;
    }

    private String[][] provideLastScores(){
        String[][] last25Scores = new String[FileOperations.OLD_RESULTS.size()][];
        for(int i = 0; i < FileOperations.OLD_RESULTS.size(); i++){
            Result r = FileOperations.OLD_RESULTS.get(i);
            String[] row = new String[5];
            row[0] = r.getName();
            row[1] = r.getDict();
            row[2] = ""+ ( r.getPoints() < 10 ? " "+ r.getPoints() : r.getPoints() );
            row[3] = r.getGameType().getArt();
            DateTimeFormatter dtFormatterThisYear = DateTimeFormatter.ofPattern("MM.dd. HH:mm");
            DateTimeFormatter dtFormatterBefore = DateTimeFormatter.ofPattern("yyyy.MM.");
            LocalDateTime thisYear = LocalDateTime.of(LocalDateTime.now().getYear(), 1, 1, 0,0);
            if( r.getLdt().isBefore(thisYear) ) {
                row[4] = r.getLdt().format(dtFormatterBefore);
            } else{
                row[4] = r.getLdt().format(dtFormatterThisYear);
            }
            last25Scores[i] = row;
        }
        return last25Scores;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(button)){
            closeInternalFrame();
        }
    }

    private void closeInternalFrame(){
        try {
            this.setClosed(true);
        } catch (PropertyVetoException e) {
            new ProblemPopUp("Please restart!");
        }
    }

}