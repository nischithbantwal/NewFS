    import java.awt.*;
    import javax.swing.*;
    import javax.swing.border.Border;

    import java.awt.event.*;
    import java.io.*;
    import java.util.*;
    import java.util.List;

    import static javax.swing.JOptionPane.showMessageDialog;

    public class Insert extends JFrame implements ActionListener {
        private JLabel insertHeading, nameL, usnL, semL, branchL, cgpaL, nobL, companyL, ctcL, commentsL;
        private JTextField nameT, usnT, cgpaT, nobT, ctcT, commentsT;
        JComboBox<String> companyT, branchT, semT;
        private JButton insert, back;
        String[] companies = {"Amazon", "Flipkart", "Ebay", "SAP_LABS", "Capgemini", "Cognizant", "Infosys", "Wipro"};
        String[] branches = {"CSE", "ISE", "EEE", "ECE", "MEC", "TEC", "AIML"};
        String[] sems = {"01", "02", "03", "04", "05", "06", "07", "08"};

        Container con = null;
        String name = "", usn1 = "", sem = "", branch = "", cgpa = "", nob = "", company = "", ctc = "", comments = "";

        Insert() {
            super("Insert Record");
            con = getContentPane();
            con.setLayout(null);
            Color lightBlue = new Color(0, 0, 0);
            con.setBackground(lightBlue);

            con.setSize(300, 300);
            con.setLayout(null);
            con.setVisible(true);

            insertHeading = new JLabel("INSERT STUDENT DETAILS");
            insertHeading.setBounds(550, -50, 400, 150);

            con.add(insertHeading);
            Color blue = new Color(30, 144, 255);
            Font font = new Font("Verdana", Font.BOLD, 16);
            insertHeading.setFont(font);
            insertHeading.setForeground(Color.BLACK);

            nameL = new JLabel("Enter Name:");
            nameL.setBounds(350, 70, 150, 40);
            nameL.setFont(font);
            nameL.setForeground(Color.BLACK);
            nameT = new JTextField(200);
            nameT.setBounds(725, 70, 250, 30);
            nameT.setFont(font);
            nameT.setForeground(Color.BLACK);

            usnL = new JLabel("Enter USN:");
            usnL.setBounds(350, 130, 150, 40);
            usnL.setFont(font);
            usnL.setForeground(Color.BLACK);
            usnT = new JTextField(200);
            usnT.setBounds(725, 130, 250, 30);
            usnT.setFont(font);
            usnT.setForeground(Color.BLACK);

            semL = new JLabel("Enter Semester:");
            semL.setBounds(350, 190, 150, 40);
            semL.setFont(font);
            semL.setForeground(Color.BLACK);
            semT = new JComboBox<String>(sems);
            semT.setBounds(725, 190, 250, 30);
            semT.setFont(font);
            semT.setForeground(Color.BLACK);

            branchL = new JLabel("Enter Branch:");
            branchL.setBounds(350, 250, 150, 40);
            branchL.setFont(font);
            branchL.setForeground(Color.BLACK);
            branchT = new JComboBox<String>(branches);
            branchT.setBounds(725, 250, 250, 30);
            branchT.setFont(font);
            branchT.setForeground(Color.BLACK);

            cgpaL = new JLabel("Enter CGPA:");
            cgpaL.setBounds(350, 310, 150, 40);
            cgpaL.setFont(font);
            cgpaL.setForeground(Color.BLACK);
            cgpaT = new JTextField(200);
            cgpaT.setBounds(725, 310, 250, 30);
            cgpaT.setFont(font);
            cgpaT.setForeground(Color.BLACK);

            nobL = new JLabel("Enter Number of backlogs:");
            nobL.setBounds(350, 370, 300, 40);
            nobL.setFont(font);
            nobL.setForeground(Color.BLACK);
            nobT = new JTextField(200);
            nobT.setBounds(725, 370, 250, 30);
            nobT.setFont(font);
            nobT.setForeground(Color.BLACK);

            companyL = new JLabel("Enter Aspiring Company:");
            companyL.setBounds(350, 430, 300, 40);
            companyL.setFont(font);
            companyL.setForeground(Color.BLACK);
            companyT = new JComboBox<String>(companies);
            companyT.setBounds(725, 430, 250, 30);
            companyT.setFont(font);
            companyT.setForeground(Color.BLACK);
            companyT.addActionListener(this);

            commentsL = new JLabel("Enter Comments:");
            commentsL.setBounds(350, 490, 300, 40);
            commentsL.setFont(font);
            commentsL.setForeground(Color.BLACK);
            commentsT = new JTextField(200);
            commentsT.setBounds(725, 490, 250, 30);
            commentsT.setFont(font);
            commentsT.setForeground(Color.BLACK);

            insert = new JButton("Insert");
            insert.setBounds(400, 550, 150, 40);
            insert.addActionListener(this);
            insert.setFont(font);
            Color pul = new Color(0, 0, 0);
            Border bored = BorderFactory.createLineBorder(pul, 5);
            insert.setBorder(bored);
            insert.setForeground(Color.WHITE);
            insert.setBackground(Color.BLACK);

            back = new JButton("Go Back");
            back.setBounds(750, 550, 150, 40);
            back.addActionListener(this);
            back.setFont(font);
            back.setBorder(bored);
            back.setForeground(Color.WHITE);
            back.setBackground(Color.BLACK);

            con.add(nameL);
            con.add(nameT);
            con.add(usnL);
            con.add(usnT);
            con.add(semL);
            con.add(semT);
            con.add(branchL);
            con.add(branchT);
            con.add(cgpaL);
            con.add(cgpaT);
            con.add(nobL);
            con.add(nobT);
            con.add(companyL);
            con.add(companyT);
            con.add(commentsL);
            con.add(commentsT);
            con.add(insert);
            con.add(back);

            JLabel background;
            con.setSize(1200,900);
            con.setLayout(null);
            ImageIcon img = new ImageIcon("C:/Users/mayoo/Desktop/placement management system/placement management system by mayoori and nischith/Placement_Management_System-master/bg2.jpg");
            background = new JLabel("",img,JLabel.CENTER);
            background.setBounds(150,10,1200,800);
            add(background);
        }

        public void actionPerformed(ActionEvent ae) {
            if (ae.getSource() == back) {
                try {
                    this.dispose();
                    Home h = new Home();
                    h.setSize(2300, 790);
                    h.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else if (ae.getSource() == insert) {
                try {

                    String p = "999" + "|" + "999" + "|" + "999" + "|" + "999" + "|" + "999" + "|" + "999" + "|" + "999" + "|"
                            + "999" + "|" + "999" + "|";
                    File data = new File("student.txt");
                    File data1 = new File("journal.txt");
                    if (data.createNewFile() && data1.createNewFile()) {
                        Boolean createNewFile = data.createNewFile();
                        Boolean createNewFile1 = data1.createNewFile();
                        // System.out.println("student "+createNewFile);
                        // System.out.println("journal "+createNewFile1);
                        BufferedWriter pw = new BufferedWriter(new FileWriter(data));
                        BufferedWriter pw1 = new BufferedWriter(new FileWriter(data1));
                        pw.write(p);
                        pw.write("\n");
                        pw.close();
                        pw1.write(p);
                        pw1.write("\n");
                        pw1.close();
                    }

                    String name = nameT.getText();
                    String usn1 = usnT.getText();
                    String sem = (String) semT.getSelectedItem();
                    String branch = (String) branchT.getSelectedItem();
                    String cgpa = cgpaT.getText();
                    String nob = nobT.getText();
                    String company = (String) companyT.getSelectedItem();
                    String ctc = ctcofcompany(company);
                    String comments = commentsT.getText();

                    if (name.isEmpty() || usn1.isEmpty() || cgpa.isEmpty() || nob.isEmpty() || comments.isEmpty()) {
                        showMessageDialog(null, "Please fill in all the required fields!");
                        return; // Stop execution if any required field is empty
                    }

                    String formattedData = name + "|" + usn1 + "|" + sem + "|" + branch + "|" + cgpa + "|" + nob + "|" + company
                        + "|" + ctc + "|" + comments + "|";
                try {
                    File file = new File("student.txt");
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                    
                    // Read existing data from file
    List<String> existingData = new ArrayList<>();
    BufferedReader reader = new BufferedReader(new FileReader(file));
    String line;
    boolean isUSNExisting = false; // Flag to check if USN already exists
    while ((line = reader.readLine()) != null) {
        existingData.add(line);
        String[] Data = line.split("\\|");
        if (Data.length > 1 && Data[1].equals(usn1)) {
            isUSNExisting = true; // USN already exists
        }
    }
    reader.close();

    if (isUSNExisting) {
        showMessageDialog(null, "USN already exists!");
        return; // Stop further execution
    }
                    
                    // Add the new data and sort by USN
                    existingData.add(formattedData);
                    Collections.sort(existingData, new Comparator<String>() {
                        public int compare(String s1, String s2) {
                            String[] usn1 = s1.split("\\|");
                            String[] usn2 = s2.split("\\|");
                            return usn1[1].compareTo(usn2[1]);
                        }
                    });
                    
                    // Write the sorted data back to the file
                    BufferedWriter writer = new BufferedWriter(new FileWriter(file));
                    for (String Data : existingData) {
                        writer.write(Data);
                        writer.newLine();
                    }
                    writer.close();
                    
                    showMessageDialog(null, "Record Added!");
                    nameT.setText("");
                    usnT.setText("");
                    semT.setSelectedIndex(0);
                    branchT.setSelectedIndex(0);
                    cgpaT.setText("");
                    nobT.setText("");
                    companyT.setSelectedIndex(0);
                    commentsT.setText("");
                    
                    
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        private String ctcofcompany(String company2) {

            if (company2.equals("Amazon")) {
                return "24,00,000";
            } else if (company2.equals("Flipcart")) {
                return "19,00,000";
            } else if (company2.equals("Ebay")) {
                return "15,00,000";
            } else if (company2.equals("SAP_LABS")) {
                return "18,00,000";
            } else if (company2.equals("Capgemini")) {
                return "7,00,000";
            } else if (company2.equals("Cognizant")) {
                return "6,00,000";
            } else if (company2.equals("Infosys")) {
                return "5,00,000";
            } else if (company2.equals("Wipro")) {
                return "4,00,000";
            }
            return null;
        }

        public void modify(String name0, String usn0, String sem0, String branch0, String cgpa0, String nob0,
                String company0, String ctc0, String comments0)
                throws FileNotFoundException, IOException, NullPointerException {
            String usn = "", r;

            File file = new File("student.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));

            File temp = new File("temp.txt");
            Boolean createNewFile = temp.createNewFile();
            BufferedWriter pw = new BufferedWriter(new FileWriter(temp));

            while ((r = br.readLine()) != null) {
                String[] result = r.split("\\|");
                usn = result[1];

                if (usn.equals(usn0)) {
                    String b = name0 + "|" + usn0 + "|" + sem0 + "|" + branch0 + "|" + cgpa0 + "|" + nob0 + "|" + company0
                            + "|" + ctc0 + "|" + comments0 + "|";
                    int len = b.length();
                    pw.write(b);
                    pw.write("\n");
                } else {
                    pw.write(r);
                    pw.write("\n");
                }
            }
            pw.flush();
            pw.close();
            br.close();

            file.delete();
            temp.renameTo(file);
        }

        public static void main(String args[]) {
            Insert ins = new Insert();
            ins.setSize(2300, 790);
            ins.setVisible(true);
        }
    }
