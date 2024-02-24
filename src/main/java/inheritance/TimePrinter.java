package inheritance;

import java.awt.event.*;

public class TimePrinter implements ActionListener {

    private StringBuilder sb;

    public TimePrinter(StringBuilder sb) {
        this.sb = sb;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        sb.append("1");
        System.out.println(String.format("TimePrinter: %d %s", this.sb.length(), this.sb.toString()));
    }
    
}