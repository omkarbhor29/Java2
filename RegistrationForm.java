import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class RegistrationForm implements ActionListener
{
	JFrame frm1,frm2;
	JPanel p1,p2,p3,p4;
	JLabel lbreg_no,lbname,lbaddr,lbcity,lbstate,lbgender,lbnull,lbg,lbtitle,lg,lbuser,lbpass,lbcont;
	JTextField treg_no,tcont;
	JTextField tname;
	JTextField tuname;
	JPasswordField pw;
	JTextArea taddr;
	JComboBox ccity;
	JRadioButton rm,rf;
	JList lstate;
	JButton bsub,breset,bexit,blogin,bregister;
	
	public RegistrationForm()
	{
		frm1=new JFrame("REGISTRATION FORM");
		frm2=new JFrame("LOGIN");
		
		BorderLayout b1=new BorderLayout();
		frm2.setLayout(b1);
		frm2.setVisible(true);
		frm2.setSize(500,500);

		p1=new JPanel();
		p2=new JPanel();
		p3=new JPanel();
		p4=new JPanel();

		GridLayout gl=new GridLayout(7,2);
		p1.setLayout(gl);
		
		GridLayout gl2=new GridLayout(3,1);
		p2.setLayout(gl2);
		
		Font f1=new Font("TIMES NEW ROMAN",Font.BOLD,20);
		Font f2=new Font("TIMES NEW ROMAN",Font.ITALIC,25);
		
		ImageIcon img=new ImageIcon("Background3.jpg");
		lbg=new JLabel("",img,JLabel.CENTER);
		lbg.setBounds(0,0,500,500);
		frm1.add(lbg);

		lbreg_no=new JLabel("REG NO :");
		treg_no=new JTextField(10);

		lbname=new JLabel("Name :");
		tname=new JTextField();
	
		lbaddr=new JLabel("ADDRESS :");
		taddr=new JTextArea();

		lbcity=new JLabel("CITY :");
		String carr[]={"pune","mumbai"};
		JComboBox ccity=new JComboBox(carr);

		lbstate=new JLabel("STATE");
		String sarr[]={"Maharashtra","Bengal","Punjab","Rajasthan"};
		JList cstate=new JList(sarr);

		lbgender=new JLabel("GENDER :");
		lbnull=new JLabel(" ");
		rm=new JRadioButton("Male");
		rf=new JRadioButton("Female");
		
		lbcont=new JLabel("CONTACT NO :");
		tcont=new JTextField(10);

   		bsub=new JButton("SUBMIT");
		breset=new JButton("RESET");
		bexit=new JButton("EXIT");
		lbtitle=new JLabel("REGISTRATION_FORM");
		
		lbg.add(p1);
   		p1.setBounds(300,250,500,350);
		p1.add(lbreg_no);
		p1.add(treg_no);
		p1.add(lbname);
		p1.add(taddr);
		p1.add(lbcity);
		p1.add(ccity);
		p1.add(lbstate);
		p1.add(cstate);
		p1.add(lbgender);
		p1.add(rm);
		p1.add(lbnull);
		p1.add(rf);
		p1.add(lbcont);
		p1.add(tcont);

		lbreg_no.setFont(f1);
		lbreg_no.setForeground(Color.BLACK);
		lbname.setFont(f1);
		lbname.setForeground(Color.BLACK);
		lbaddr.setFont(f1);
		lbaddr.setForeground(Color.BLACK);
		lbcity.setFont(f1);
		lbcity.setForeground(Color.BLACK);
		lbstate.setFont(f1);
		lbstate.setForeground(Color.BLACK);
		lbgender.setFont(f1);
		lbgender.setForeground(Color.BLACK);
		lbcont.setFont(f1);
		lbcont.setForeground(Color.BLACK);
		
		lbg.add(p2);
		p2.setBounds(250,800,600,50);
		p2.setLayout(new GridLayout(1,3));
		p2.add(bsub);
		p2.add(breset);
		p2.add(bexit);

		lbg.add(p3);
		p3.setBounds(200,50,600,100);
		p3.add(lbtitle);
		lbtitle.setFont(f2);

		ImageIcon img1=new ImageIcon("log.jpg");
		lg=new JLabel("",img1,JLabel.CENTER);
		lg.setBounds(0,0,700,700);
		frm2.add(lg);

		lg.add(p4);
		p4.setBounds(200,300,500,350);
		p4.setLayout(new GridLayout(3,2));
		lbuser=new JLabel("USERNAME :");
		tuname=new JTextField(20);
		lbpass=new JLabel("PASSWORD :");
		pw=new JPasswordField(18);
		blogin=new JButton("LOGIN");
		bregister=new JButton("EXIT");

		p4.add(lbuser);
		p4.add(tuname);
		p4.add(lbpass);
		p4.add(pw);
		p4.add(blogin);
		p4.add(bexit);
   
		lbuser.setFont(f2);
		lbpass.setFont(f2);

		blogin.addActionListener(this);
	}
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()==blogin)
			{
			frm2.dispose();
			RegistrationForm rf=new RegistrationForm();         
			frm1.setVisible(true);
			frm1.setSize(700,700);
			}
		}
		public static void main(String args[])
		 {
			RegistrationForm rf=new RegistrationForm();
		 }

}
		