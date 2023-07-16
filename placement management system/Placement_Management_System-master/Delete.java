import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.*;
import java.io.*;

public class Delete extends JFrame implements ActionListener {
    private JLabel selectL, valueL;
    private JComboBox<String> selectComboBox;
    private JTextField valueT;
    private JButton delete, back;

    Delete() {
        super("Delete Record");
        Container con = getContentPane();
        con.setLayout(null);
        Color lightBlue = new Color(0, 0, 0);
        con.setBackground(lightBlue);

        con.setSize(300, 300);
        con.setLayout(null);
        con.setVisible(true);

        Font font = new Font("Verdana", Font.BOLD, 16);

        Color blue = new Color(30, 144, 255);
        selectL = new JLabel("Select field to delete by:");
        selectL.setBounds(400, 50, 700, 150);
        selectL.setFont(font);
        selectL.setForeground(Color.BLACK);

        String[] fieldOptions = { "Name", "USN" };
        selectComboBox = new JComboBox<>(fieldOptions);
        selectComboBox.setBounds(725, 100, 250, 50);
        selectComboBox.setFont(font);
        selectComboBox.setForeground(Color.BLACK);

        valueL = new JLabel("Enter the value to delete:");
        valueL.setBounds(400, 200, 700, 150);
        valueL.setFont(font);
        valueL.setForeground(Color.BLACK);

        valueT = new JTextField(200);
        valueT.setBounds(725, 250, 250, 50);
        valueT.setFont(font);
        valueT.setForeground(Color.BLACK);

        delete = new JButton("Delete");
        delete.setBounds(400, 600, 150, 40);
        delete.addActionListener(this);
        delete.setFont(font);
        Color pul = new Color(0, 0, 0);
        Border bored = BorderFactory.createLineBorder(pul, 5);
        delete.setBorder(bored);
        delete.setForeground(Color.WHITE);
        delete.setBackground(Color.GRAY);

        back = new JButton("Go Back");
        back.setBounds(600, 600, 150, 40);
        back.addActionListener(this);
        back.setFont(font);
        back.setBorder(bored);
        back.setForeground(Color.WHITE);
        back.setBackground(Color.GRAY);

        con.add(selectL);
        con.add(selectComboBox);
        con.add(valueL);
        con.add(valueT);
        con.add(delete);
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
        if (ae.getSource() == delete) {
            String selectedField = selectComboBox.getSelectedItem().toString();
            String value = valueT.getText();

            if (value.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter a valid value.");
                return;
            }

            boolean foundInStudent = false;
            String tempStudentPath = "temp_student.txt";
            String deletedRecordsPath = "deleted_records.txt";

            try (BufferedReader brStudent = new BufferedReader(new FileReader("student.txt"));
                 BufferedWriter bwStudent = new BufferedWriter(new FileWriter(tempStudentPath));
                 BufferedWriter bwDeleted = new BufferedWriter(new FileWriter(deletedRecordsPath, true))) {

                String line;
                while ((line = brStudent.readLine()) != null) {
                    String[] fields = line.split("\\|");
                    String usn = fields[1];
                    String name = fields[0];

                    if ((selectedField.equals("USN") && usn.equals(value)) || (selectedField.equals("Name") && name.equals(value))) {
                        foundInStudent = true;
                        bwDeleted.write(line);
                        bwDeleted.newLine();
                        continue;
                    }
                    bwStudent.write(line);
                    bwStudent.newLine();
                }

            } catch (FileNotFoundException e) {
                JOptionPane.showMessageDialog(null, "File not found: " + e.getMessage());
                return;
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error reading/writing file: " + e.getMessage());
                return;
            }

            if (!foundInStudent) {
                JOptionPane.showMessageDialog(null, "No matching records found.");
            } else {
                JOptionPane.showMessageDialog(null, "Record(s) Deleted!");
            }

            File studentFile = new File("student.txt");
            File tempStudentFile = new File(tempStudentPath);

            if (studentFile.delete()) {
                if (tempStudentFile.renameTo(studentFile)) {
                    this.dispose();
                    Home h = new Home();
                    h.setSize(2300, 790);
                    h.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Error renaming the file.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error deleting the file: " + studentFile.getAbsolutePath());
            }
        }

        if (ae.getSource() == back) {
            this.dispose();
            Home h = new Home();
            h.setSize(2300, 790);
            h.setVisible(true);
        }
    }

    public static void main(String args[]) {
        Delete del = new Delete();
        del.setSize(2300, 790);
        del.setVisible(true);
    }
}
