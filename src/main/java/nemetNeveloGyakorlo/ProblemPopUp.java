package nemetNeveloGyakorlo;

import javax.swing.*;

public class ProblemPopUp {

    ProblemPopUp(String message) {
        JFrame frame = new JFrame();
        JOptionPane.showMessageDialog(frame, message, "!", JOptionPane.WARNING_MESSAGE);
    }

}
