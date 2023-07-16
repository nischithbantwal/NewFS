import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Search1 extends JFrame implements ActionListener {

    JLabel welcome, searchheading;
    JComboBox<String> searchOptions;
    JButton searchButton, back;

    Search1() {

        super("Search");
        Container con = getContentPane();
        con.setLayout(null);
        Color lightBlue = new Color(0, 0, 0);
        con.setBackground(lightBlue);
        con.setVisible(true);

        searchheading = new JLabel("CAMPUS PLACEMENTS");
        searchheading.setBounds(520, 0, 400, 150);
        con.add(searchheading);

        Font fonth = new Font("Verdana", Font.BOLD, 24);
        searchheading.setFont(fonth);
        searchheading.setForeground(Color.BLACK);

        welcome = new JLabel("CHOOSE CRITERIA TO SEARCH STUDENTS");
        welcome.setBounds(480, 30, 400, 150);
        con.add(welcome);

        Font fontw = new Font("Verdana", Font.BOLD, 16);
        welcome.setFont(fontw);
        welcome.setForeground(Color.BLACK);

        Color blue = new Color(148, 0, 211);
        Color pul = new Color(75, 0, 130);
        Border bored = BorderFactory.createLineBorder(pul, 5);

        String[] searchOptionsArray = {"Search By USN", "Search By Company", "Search By Branch"};
        searchOptions = new JComboBox<>(searchOptionsArray);
        searchOptions.setBounds(400, 275, 400, 50);
        Font font1 = new Font("Verdana", Font.BOLD, 16);
        searchOptions.setFont(font1);
        searchOptions.setForeground(Color.BLACK);

        searchButton = new JButton("Search");
        searchButton.addActionListener(this);
        searchButton.setBounds(520, 350, 150, 40);
        Font font2 = new Font("Verdana", Font.BOLD, 16);
        searchButton.setFont(font2);
        searchButton.setBorder(bored);
        searchButton.setForeground(Color.WHITE);
        searchButton.setBackground(Color.GRAY);

        Font font = new Font("Verdana", Font.BOLD, 16);
        back = new JButton("Go Back");
        back.setBounds(525, 600, 150, 40);
        back.addActionListener(this);
        back.setFont(font);
        back.setBorder(bored);
        back.setForeground(Color.WHITE);
        back.setBackground(Color.GRAY);

        con.add(searchOptions);
        con.add(searchButton);
        con.add(back);

        JLabel background;
		con.setSize(1200,900);
		con.setLayout(null);
        ImageIcon img = new ImageIcon("C:/Users/mayoo/Desktop/placement management system/placement management system by mayoori and nischith/Placement_Management_System-master/bg2.jpg");
        background = new JLabel("",img,JLabel.CENTER);
        background.setBounds(150,10,1200,800);
        add(background);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == searchButton) {
            String selectedOption = (String) searchOptions.getSelectedItem();

            if (selectedOption.equals("Search By USN")) {
                this.dispose();
                SearchByUSN in = new SearchByUSN();
                in.setSize(2300, 790);
                in.setVisible(true);
            } else if (selectedOption.equals("Search By Company")) {
                this.dispose();
                SearchByCompany del = new SearchByCompany();
                del.setSize(2300, 790);
                del.setVisible(true);
            } else if (selectedOption.equals("Search By Branch")) {
                this.dispose();
                SearchByBranch dis = new SearchByBranch();
                dis.setSize(2300, 790);
                dis.setVisible(true);
            }
        } else if (ae.getSource() == back) {
            try {
                this.dispose();
                Home h = new Home();
                h.setSize(2300, 790);
                h.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
