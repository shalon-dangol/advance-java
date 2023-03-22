
package com.mycompany.swingexamples;
/**
 *
 * @author Shalon
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class EventHandlingExample extends JFrame implements ActionListener {
    public JTextField txtName;
    public Container container;
    public JTextField sum;
       public EventHandlingExample(){
          container = this.getContentPane();
        container.setLayout(null);
        Font font = new Font("Serif", Font.BOLD, 12);

        JLabel Name = new JLabel("Name");
        Name.setFont(font);
        txtName = new JTextField();

        JLabel Mobile = new JLabel("Mobile");
        Mobile.setFont(font);
        JTextField txtMobile = new JTextField();

        JLabel Gender = new JLabel("Gender");
        Gender.setFont(font);
        JRadioButton male = new JRadioButton("Male");
        male.setFont(font);
        JLabel Term=new JLabel("Accept terms and conditions");
        Term.setFont(font);
        JCheckBox term = new JCheckBox();
        term.setFont(font);
        JLabel Address=new JLabel("Address");
        Address.setFont(font);
        JTextField address=new JTextField();
        
        JRadioButton female = new JRadioButton("Female");
        female.setFont(font);
        ButtonGroup gender = new ButtonGroup();
        gender.add(male);
        gender.add(female);

        String day[]=new String[31];
        String year[]=new String[100];
        String month[]={"jan","Feb","March","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        for(int i=0;i<31;i++){
            day[i]=Integer.toString(i+1);
        }
        for(int i=0;i<100;i++){
            year[i]=Integer.toString(i+1970);
        }
        JLabel dayLabel = new JLabel("Day");
        dayLabel.setFont(font);
        JComboBox dayCombo = new JComboBox(day);
        
        JLabel monthLabel = new JLabel("Month");
        monthLabel.setFont(font);
        JComboBox monthCombo = new JComboBox(month);
        
        JLabel yearLabel = new JLabel("Year");
        yearLabel.setFont(font);
        JComboBox yearCombo = new JComboBox(year);
    
        JTextField no1 = new JTextField();
        JTextField no2 = new JTextField();
        sum = new JTextField();

        JButton submit = new JButton("Submit");
        submit.setFont(font);
        JButton reset = new JButton("Reset");
        reset.setFont(font);

        //set Location
        Name.setBounds(15, 50, 150, 25);
        txtName.setBounds(200, 50, 300, 25);
        Mobile.setBounds(15, 100, 150, 25);
        txtMobile.setBounds(200, 100, 300, 25);
        Gender.setBounds(15, 200, 100, 25);
        male.setBounds(200, 200, 100, 25);
        female.setBounds(350, 200, 100, 25);
        dayCombo.setBounds(200, 300, 40, 25);
        monthCombo.setBounds(240, 300, 60, 25);
        yearCombo.setBounds(300, 300, 80, 25);
        term.setBounds(100, 500, 20, 20);
        Term.setBounds(140, 500, 200, 20);
        Address.setBounds(15,400,50,25);
        address.setBounds(100,400,200,80);
        no1.setBounds(100, 600, 50,20);
        no2.setBounds(300, 600, 50, 20 );
        sum.setBounds( 200, 650, 50, 20);
                
        submit.setBounds(50, 550, 100, 25);
        reset.setBounds(200, 550, 150, 25);

        //event handler
        submit.addActionListener(this);
        
        //adding component
        container.add(Name);
        container.add(txtName);
        container.add(Mobile);
        container.add(txtMobile);
        container.add(Gender);
        container.add(male);
        container.add(female);
        container.add(dayCombo);
        container.add(monthCombo);
        container.add(yearCombo);
        container.add(term);
        container.add(Term);
        container.add(submit);
        container.add(reset); 
        container.add(Address);
        container.add(address);
        container.add(no1);
        container.add(no2);
        container.add(sum);
        
        this.setSize(800, 800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Registration Form");
        this.getContentPane().setBackground(Color.WHITE);
        this.setResizable(false);
        this.setVisible(true);
}
public int add(int no1,  int no2){
    return no1 + no2;
}
    @Override
    public void actionPerformed(ActionEvent e) {
        txtName.setText("button clicked");
        int result = add(2,3);
        sum.setText("hello");
    }
}
