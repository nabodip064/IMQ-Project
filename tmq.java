import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.print.*;
import javax.swing.*;

class tmq extends JFrame implements ActionListener{
	JButton receiptBtn,resultBtn,stationaryBtn,addBtn,printBtn;
	JLabel nameLbl,idLbl,classLbl,feeLbl,dateLbl;
	JTextField nameTxt,idTxt,classTxt,feeTxt,dateTxt;
	JTextArea show;
	String nameS,idS,clasS,feeS,dateS;
	JScrollPane jsp;
	Font fnt;
	tmq(){
		receiptBtn =new JButton("Receipt");
		printBtn=new JButton("Print");
		resultBtn =new JButton("Result");
		stationaryBtn =new JButton("Stationary");
		addBtn =new JButton("Show");
		nameLbl=new JLabel("Student name");
		idLbl=new JLabel("Id");
		classLbl=new JLabel("Class");
		feeLbl=new JLabel("fee");
		dateLbl=new JLabel("Date: ");
		nameTxt=new JTextField();
		idTxt=new JTextField();
		classTxt=new JTextField();
		feeTxt=new JTextField();
		dateTxt=new JTextField();
		show=new JTextArea();
		jsp=new JScrollPane(show);
		fnt=new Font("Times New Roman",Font.PLAIN,18);
		add(receiptBtn);
		add(resultBtn);
		add(stationaryBtn);
		add(addBtn);
		add(nameLbl);
		add(idLbl);
		add(classLbl);
		add(feeLbl);
		add(dateLbl);
		add(dateTxt);
		add(nameTxt);
		add(idTxt);
		add(classTxt);
		add(feeTxt);
		add(show);
		add(printBtn);
		
		printBtn.addActionListener(this);
		receiptBtn.addActionListener(this);
		resultBtn.addActionListener(this);
		stationaryBtn.addActionListener(this);
		addBtn.addActionListener(this);
		receiptBtn.setBounds(10,80,100,50);
		resultBtn.setBounds(110,80,100,50);
		stationaryBtn.setBounds(210,80,100,50);
		dateLbl.setBounds(10,180,90,20);
		nameLbl.setBounds(10,210,90,20);
		idLbl.setBounds(10,240,90,20);
		classLbl.setBounds(10,270,90,20);
		feeLbl.setBounds(10,300,90,20);
		dateTxt.setBounds(100,180,80,20);
		nameTxt.setBounds(100,210,80,20);
		idTxt.setBounds(100,240,80,20);
		classTxt.setBounds(100,270,80,20);
		feeTxt.setBounds(100,300,80,20);
		show.setBounds(330,20,930,600);
		addBtn.setBounds(50,400,70,30);
		printBtn.setBounds(1180,650,80,30);
		setLayout(null);
		setVisible(true);
		setSize(1300,740);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent a){
		if(a.getSource()==addBtn){
			nameS=nameTxt.getText();
			idS=idTxt.getText();
			clasS=classTxt.getText();
			feeS=feeTxt.getText();
			dateS=dateTxt.getText();
			show.setFont(fnt);
			show.setText("\tInternational Madrasatul Quran\n\t          Money Receipt\nDate: "+dateS+"\t        Student's ID: "+idS+"\nStudent's Name: "+nameS+"\nClass: "+clasS+"\t\tAmount: "+feeS+"/-\n\n\nAdmin\t            Sign\t                 Receiver"+
			"\n\n\n\n\tInternational Madrasatul Quran\n\t          Money Receipt\nDate: "+dateS+"     \tStudent's ID: "+idS+"\nStudent's Name: "+nameS+"\nClass: "+clasS+"\t\tAmount: "+feeS+"/-\n\n\nAdmin\t            Sign\t                 Receiver"+
			"\n\n\n\n\tInternational Madrasatul Quran\n\t          Money Receipt\nDate: "+dateS+"     \tStudent's ID: "+idS+"\nStudent's Name: "+nameS+"\nClass: "+clasS+"\t\tAmount: "+feeS+"/-\n\nAdmin\t            Sign\t                 Receiver");
		}
		else if(a.getSource()==stationaryBtn){
			stationary obj=new stationary();
		}
		else if(a.getSource()==resultBtn){
			result obj=new result();
		}
		else if(a.getSource()==printBtn){
			try{
				boolean complete=show.print();
				if(complete){
					JOptionPane.showMessageDialog(null,"Done Printing","Information",JOptionPane.INFORMATION_MESSAGE);
				}
				else{
					JOptionPane.showMessageDialog(null,"Printing","Printer",JOptionPane.ERROR_MESSAGE);
				}
			}
			catch(PrinterException pe){
				JOptionPane.showMessageDialog(null,pe);
			}
		}
	}
	public static void main(String cp[]){
		tmq obj= new tmq();
	}
}

class result extends JFrame implements ActionListener{
	JButton addBtn,printBtn;
	JLabel subLbl,markLbl,hghLbl,classLbl,xamLbl,nameLbl,idLbl;
	JTextField classTxt,xamTxt,nameTxt,idTxt,sub1,mark1,hgh1,sub2,mark2,hgh2,sub3,mark3,hgh3,sub4,mark4,hgh4,sub5,mark5,hgh5,sub6,mark6,hgh6,sub7,mark7,hgh7,sub8,mark8,hgh8,sub9,mark9,hgh9;
	String clasS,xamS,nameS,idS,sub1S,hgh1S,sub2S,hgh2S,sub3S,hgh3S,sub4S,hgh4S,sub5S,hgh5S,sub6S,hgh6S,sub7S,hgh7S,sub8S,hgh8S,sub9S,hgh9S;
	int mark1S,mark2S,mark3S,mark4S,mark5S,mark6S,mark7S,mark8S,mark9S;
	JTextArea jtaR;
	Font fnt;
	result(){
		addBtn=new JButton("Show");
		printBtn=new JButton("Print");
		jtaR=new JTextArea();
		subLbl=new JLabel("Subject");
		markLbl=new JLabel("Mark");
		hghLbl=new JLabel("Highest Mark");
		xamLbl=new JLabel("Exam Name");
		classLbl=new JLabel("Class");
		nameLbl=new JLabel("Student's Name");
		idLbl=new JLabel("ID No.");
		xamTxt=new JTextField();
		classTxt=new JTextField();
		nameTxt=new JTextField();
		idTxt=new JTextField();
		sub1=new JTextField();
		mark1=new JTextField();
		hgh1=new JTextField();
		sub2=new JTextField();
		mark2=new JTextField();
		hgh2=new JTextField();
		sub3=new JTextField();
		mark3=new JTextField();
		hgh3=new JTextField();
		sub4=new JTextField();
		mark4=new JTextField();
		hgh4=new JTextField();
		sub5=new JTextField();
		mark5=new JTextField();
		hgh5=new JTextField();
		sub6=new JTextField();
		mark6=new JTextField();
		hgh6=new JTextField();
		sub7=new JTextField();
		mark7=new JTextField();
		hgh7=new JTextField();
		sub8=new JTextField();
		mark8=new JTextField();
		hgh8=new JTextField();
		sub9=new JTextField();
		mark9=new JTextField();
		hgh9=new JTextField();
		fnt=new Font("Times New Roman",Font.PLAIN,18);
		
		add(xamLbl);
		add(xamTxt);
		add(classTxt);
		add(classLbl);
		add(nameLbl);
		add(nameTxt);
		add(idLbl);
		add(idTxt);
		add(addBtn);
		add(printBtn);
		addBtn.addActionListener(this);
		printBtn.addActionListener(this);
		add(jtaR);
		add(subLbl);
		add(markLbl);
		add(hghLbl);
		add(sub1);
		add(mark1);
		add(hgh1);
		add(sub2);
		add(mark2);
		add(hgh2);
		add(sub3);
		add(mark3);
		add(hgh3);
		add(sub4);
		add(mark4);
		add(hgh4);
		add(sub5);
		add(mark5);
		add(hgh5);
		add(sub6);
		add(mark6);
		add(hgh6);
		add(sub7);
		add(mark7);
		add(hgh7);
		add(sub8);
		add(mark8);
		add(hgh8);
		add(sub9);
		add(mark9);
		add(hgh9);
		
		xamLbl.setBounds(20,20,100,20);
		xamTxt.setBounds(140,20,100,20);
		classLbl.setBounds(20,50,100,20);
		classTxt.setBounds(140,50,100,20);
		nameLbl.setBounds(20,80,100,20);
		nameTxt.setBounds(140,80,100,20);
		idLbl.setBounds(20,110,100,20);
		idTxt.setBounds(140,110,100,20);
		subLbl.setBounds(40,150,100,30);
		markLbl.setBounds(180,150,90,30);
		hghLbl.setBounds(275,150,140,30);
		sub1.setBounds(20,190,100,30);
		mark1.setBounds(140,190,100,30);
		hgh1.setBounds(260,190,100,30);
		sub2.setBounds(20,230,100,30);
		mark2.setBounds(140,230,100,30);
		hgh2.setBounds(260,230,100,30);
		sub3.setBounds(20,270,100,30);
		mark3.setBounds(140,270,100,30);
		hgh3.setBounds(260,270,100,30);
		sub4.setBounds(20,310,100,30);
		mark4.setBounds(140,310,100,30);
		hgh4.setBounds(260,310,100,30);
		sub5.setBounds(20,350,100,30);
		mark5.setBounds(140,350,100,30);
		hgh5.setBounds(260,350,100,30);
		sub6.setBounds(20,390,100,30);
		mark6.setBounds(140,390,100,30);
		hgh6.setBounds(260,390,100,30);
		sub7.setBounds(20,430,100,30);
		mark7.setBounds(140,430,100,30);
		hgh7.setBounds(260,430,100,30);
		sub8.setBounds(20,470,100,30);
		mark8.setBounds(140,470,100,30);
		hgh8.setBounds(260,470,100,30);
		sub9.setBounds(20,510,100,30);
		mark9.setBounds(140,510,100,30);
		hgh9.setBounds(260,510,100,30);
		addBtn.setBounds(280,590,80,30);
		jtaR.setBounds(400,20,930,600);
		printBtn.setBounds(1250,670,80,30);
		
		setLayout(null);
		setVisible(true);
		setSize(1400,750);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource()==addBtn){
			xamS=xamTxt.getText();
			clasS=classTxt.getText();
			nameS=nameTxt.getText();
			idS=idTxt.getText();
			sub1S=sub1.getText();
			sub2S=sub2.getText();
			sub3S=sub3.getText();
			sub4S=sub4.getText();
			sub5S=sub5.getText();
			sub6S=sub6.getText();
			sub7S=sub7.getText();
			sub8S=sub8.getText();
			sub9S=sub9.getText();
			try{
				mark1S=Integer.parseInt(mark1.getText());
				mark2S=Integer.parseInt(mark2.getText());
				mark3S=Integer.parseInt(mark3.getText());
				mark4S=Integer.parseInt(mark4.getText());
				mark5S=Integer.parseInt(mark5.getText());
				mark6S=Integer.parseInt(mark6.getText());
				mark7S=Integer.parseInt(mark7.getText());
				mark8S=Integer.parseInt(mark8.getText());
				mark9S=Integer.parseInt(mark9.getText());
			}
			catch(Exception e){
				
			}
			hgh1S=hgh1.getText();
			hgh2S=hgh2.getText();
			hgh3S=hgh3.getText();
			hgh4S=hgh4.getText();
			hgh5S=hgh5.getText();
			hgh6S=hgh6.getText();
			hgh7S=hgh7.getText();
			hgh8S=hgh8.getText();
			hgh9S=hgh9.getText();
			String a = Integer.toString(mark1S);
			String b = Integer.toString(mark2S);
			String c = Integer.toString(mark3S);
			String d = Integer.toString(mark4S);
			String e = Integer.toString(mark5S);
			String f = Integer.toString(mark6S);
			String g = Integer.toString(mark7S);
			String h = Integer.toString(mark8S);
			String i = Integer.toString(mark9S);
			if(mark1S == 0)a = "";
			if(mark2S == 0)b = "";
			if(mark3S == 0)c = "";
			if(mark4S == 0)d = "";
			if(mark5S == 0)e = "";
			if(mark6S == 0)f = "";
			if(mark7S == 0)g = "";
			if(mark8S == 0)h = "";
			if(mark9S == 0)i = "";
			jtaR.setFont(fnt);
			
			jtaR.setText("\tInternational Madrasatul Quran\n\t             Result Card\nExam. name: "+xamS+"\tClass: "+clasS+"\nStudent's name: "+nameS+"\tID No: "+idS+"\nSubject\t     Obtained Mark\tHighest Mark\n-------------------------------------------------------------------------------\n     "
			+sub1S+"\t     "+a+"\t\t"+hgh1S+"\n-------------------------------------------------------------------------------\n     "
			+sub2S+"\t     "+b+"\t\t"+hgh2S+"\n-------------------------------------------------------------------------------\n     "
			+sub3S+"\t     "+c+"\t\t"+hgh3S+"\n-------------------------------------------------------------------------------\n     "
			+sub4S+"\t     "+d+"\t\t"+hgh4S+"\n-------------------------------------------------------------------------------\n     "
			+sub5S+"\t     "+e+"\t\t"+hgh5S+"\n-------------------------------------------------------------------------------\n     "
			+sub6S+"\t     "+f+"\t\t"+hgh6S+"\n-------------------------------------------------------------------------------\n     "
			+sub7S+"\t     "+g+"\t\t"+hgh7S+"\n-------------------------------------------------------------------------------\n     "
			+sub8S+"\t     "+h+"\t\t"+hgh8S+"\n-------------------------------------------------------------------------------\n     "
			+sub9S+"\t     "+i+"\t\t"+hgh9S+"\n-------------------------------------------------------------------------------\n"
			+"Total:\t\t"+(mark1S+mark2S+mark3S+mark4S+mark5S+mark6S+mark7S+mark8S+mark9S)+"\n\n\n\nHead\t     Adviser\t\tGurdian");
		}
		else if(ae.getSource()==printBtn){
			try{
				boolean complete=jtaR.print();
				if(complete){
					JOptionPane.showMessageDialog(null,"Done Printing","Information",JOptionPane.INFORMATION_MESSAGE);
				}
				else{
					JOptionPane.showMessageDialog(null,"Printing","Printer",JOptionPane.ERROR_MESSAGE);
				}
			}
			catch(PrinterException pe){
				JOptionPane.showMessageDialog(null,pe);
			}
		}
	}
}

class stationary extends JFrame implements ActionListener{
	JButton addBtn,printBtn;
	JLabel subLbl,markLbl,hghLbl,classLbl,xamLbl,nameLbl;
	JTextField classTxt,xamTxt,nameTxt,sub1,mark1,hgh1,sub2,mark2,hgh2,sub3,mark3,hgh3,sub4,mark4,hgh4,sub5,mark5,hgh5,sub6,mark6,hgh6,sub7,mark7,hgh7,sub8,mark8,hgh8,sub9,mark9,hgh9;
	String clasS,xamS,mark1S,mark2S,mark3S,mark4S,mark5S,mark6S,mark7S,mark8S,mark9S,nameS,idS,sub1S,sub2S,sub3S,sub4S,sub5S,sub6S,sub7S,sub8S,sub9S;
	int hgh1S,hgh2S,hgh3S,hgh4S,hgh5S,hgh6S,hgh7S,hgh8S,hgh9S;
	JTextArea jtaR;
	Font fnt;
	stationary(){
		addBtn=new JButton("Show");
		printBtn=new JButton("Print");
		jtaR=new JTextArea();
		subLbl=new JLabel("Product");
		markLbl=new JLabel("Amount");
		hghLbl=new JLabel("Cost");
		xamLbl=new JLabel("Name: ");
		classLbl=new JLabel("Date: ");
		nameLbl=new JLabel("Address: ");
		xamTxt=new JTextField();
		classTxt=new JTextField();
		nameTxt=new JTextField();
		sub1=new JTextField();
		mark1=new JTextField();
		hgh1=new JTextField();
		sub2=new JTextField();
		mark2=new JTextField();
		hgh2=new JTextField();
		sub3=new JTextField();
		mark3=new JTextField();
		hgh3=new JTextField();
		sub4=new JTextField();
		mark4=new JTextField();
		hgh4=new JTextField();
		sub5=new JTextField();
		mark5=new JTextField();
		hgh5=new JTextField();
		sub6=new JTextField();
		mark6=new JTextField();
		hgh6=new JTextField();
		sub7=new JTextField();
		mark7=new JTextField();
		hgh7=new JTextField();
		sub8=new JTextField();
		mark8=new JTextField();
		hgh8=new JTextField();
		sub9=new JTextField();
		mark9=new JTextField();
		hgh9=new JTextField();
		fnt=new Font("Times New Roman",Font.PLAIN,18);
		
		add(xamLbl);
		add(xamTxt);
		add(classTxt);
		add(classLbl);
		add(nameLbl);
		add(nameTxt);
		add(addBtn);
		add(printBtn);
		addBtn.addActionListener(this);
		printBtn.addActionListener(this);
		add(jtaR);
		add(subLbl);
		add(markLbl);
		add(hghLbl);
		add(sub1);
		add(mark1);
		add(hgh1);
		add(sub2);
		add(mark2);
		add(hgh2);
		add(sub3);
		add(mark3);
		add(hgh3);
		add(sub4);
		add(mark4);
		add(hgh4);
		add(sub5);
		add(mark5);
		add(hgh5);
		add(sub6);
		add(mark6);
		add(hgh6);
		add(sub7);
		add(mark7);
		add(hgh7);
		add(sub8);
		add(mark8);
		add(hgh8);
		add(sub9);
		add(mark9);
		add(hgh9);
		
		xamLbl.setBounds(20,20,100,20);
		xamTxt.setBounds(140,20,100,20);
		classLbl.setBounds(20,50,100,20);
		classTxt.setBounds(140,50,100,20);
		nameLbl.setBounds(20,80,100,20);
		nameTxt.setBounds(140,80,100,20);
		subLbl.setBounds(40,150,100,30);
		markLbl.setBounds(180,150,90,30);
		hghLbl.setBounds(275,150,140,30);
		sub1.setBounds(20,190,100,30);
		mark1.setBounds(140,190,100,30);
		hgh1.setBounds(260,190,100,30);
		sub2.setBounds(20,230,100,30);
		mark2.setBounds(140,230,100,30);
		hgh2.setBounds(260,230,100,30);
		sub3.setBounds(20,270,100,30);
		mark3.setBounds(140,270,100,30);
		hgh3.setBounds(260,270,100,30);
		sub4.setBounds(20,310,100,30);
		mark4.setBounds(140,310,100,30);
		hgh4.setBounds(260,310,100,30);
		sub5.setBounds(20,350,100,30);
		mark5.setBounds(140,350,100,30);
		hgh5.setBounds(260,350,100,30);
		sub6.setBounds(20,390,100,30);
		mark6.setBounds(140,390,100,30);
		hgh6.setBounds(260,390,100,30);
		sub7.setBounds(20,430,100,30);
		mark7.setBounds(140,430,100,30);
		hgh7.setBounds(260,430,100,30);
		sub8.setBounds(20,470,100,30);
		mark8.setBounds(140,470,100,30);
		hgh8.setBounds(260,470,100,30);
		sub9.setBounds(20,510,100,30);
		mark9.setBounds(140,510,100,30);
		hgh9.setBounds(260,510,100,30);
		addBtn.setBounds(280,590,80,30);
		jtaR.setBounds(400,20,930,600);
		printBtn.setBounds(1250,670,80,30);
		
		setLayout(null);
		setVisible(true);
		setSize(1400,750);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource()==addBtn){
			xamS=xamTxt.getText();
			clasS=classTxt.getText();
			nameS=nameTxt.getText();
			sub1S=sub1.getText();
			sub2S=sub2.getText();
			sub3S=sub3.getText();
			sub4S=sub4.getText();
			sub5S=sub5.getText();
			sub6S=sub6.getText();
			sub7S=sub7.getText();
			sub8S=sub8.getText();
			sub9S=sub9.getText();
			mark1S=mark1.getText();
			mark2S=mark2.getText();
			mark3S=mark3.getText();
			mark4S=mark4.getText();
			mark5S=mark5.getText();
			mark6S=mark6.getText();
			mark7S=mark7.getText();
			mark8S=mark8.getText();
			mark9S=mark9.getText();
			try{
				hgh1S=Integer.parseInt(hgh1.getText());
				hgh2S=Integer.parseInt(hgh2.getText());
				hgh3S=Integer.parseInt(hgh3.getText());
				hgh4S=Integer.parseInt(hgh4.getText());
				hgh5S=Integer.parseInt(hgh5.getText());
				hgh6S=Integer.parseInt(hgh6.getText());
				hgh7S=Integer.parseInt(hgh7.getText());
				hgh8S=Integer.parseInt(hgh8.getText());
				hgh9S=Integer.parseInt(hgh9.getText());
				
			}
			catch(Exception e){
				
			}
			String a = Integer.toString(hgh1S);
			String b = Integer.toString(hgh2S);
			String c = Integer.toString(hgh3S);
			String d = Integer.toString(hgh4S);
			String e = Integer.toString(hgh5S);
			String f = Integer.toString(hgh6S);
			String g = Integer.toString(hgh7S);
			String h = Integer.toString(hgh8S);
			String i = Integer.toString(hgh9S);
			if(hgh1S == 0)a = "";
			if(hgh2S == 0)b = "";
			if(hgh3S == 0)c = "";
			if(hgh4S == 0)d = "";
			if(hgh5S == 0)e = "";
			if(hgh6S == 0)f = "";
			if(hgh7S == 0)g = "";
			if(hgh8S == 0)h = "";
			if(hgh9S == 0)i = "";
			jtaR.setFont(fnt);
			
			jtaR.setText("\tInternational Madrasatul Quran\n\t             Money Receipt\nName: "+xamS+"\tDate: "+clasS+"\nAddress: "+nameS+"\nProduct\t         Amount\t\tCost\n-------------------------------------------------------------------------------\n     "
			+sub1S+"\t     "+mark1S+"\t\t"+a+"\n-------------------------------------------------------------------------------\n     "
			+sub2S+"\t     "+mark2S+"\t\t"+b+"\n-------------------------------------------------------------------------------\n     "
			+sub3S+"\t     "+mark3S+"\t\t"+c+"\n-------------------------------------------------------------------------------\n     "
			+sub4S+"\t     "+mark4S+"\t\t"+d+"\n-------------------------------------------------------------------------------\n     "
			+sub5S+"\t     "+mark5S+"\t\t"+e+"\n-------------------------------------------------------------------------------\n     "
			+sub6S+"\t     "+mark6S+"\t\t"+f+"\n-------------------------------------------------------------------------------\n     "
			+sub7S+"\t     "+mark7S+"\t\t"+g+"\n-------------------------------------------------------------------------------\n     "
			+sub8S+"\t     "+mark8S+"\t\t"+h+"\n-------------------------------------------------------------------------------\n     "
			+sub9S+"\t     "+mark9S+"\t\t"+i+"\n-------------------------------------------------------------------------------\n"
			+"Total:\t\t\t"+(hgh1S+hgh2S+hgh3S+hgh4S+hgh5S+hgh6S+hgh7S+hgh8S+hgh9S)+"\n\n\n\nAdministator\t     Seller \t \t Receiver");
		}
		else if(ae.getSource()==printBtn){
			try{
				boolean complete=jtaR.print();
				if(complete){
					JOptionPane.showMessageDialog(null,"Done Printing","Information",JOptionPane.INFORMATION_MESSAGE);
				}
				else{
					JOptionPane.showMessageDialog(null,"Printing","Printer",JOptionPane.ERROR_MESSAGE);
				}
			}
			catch(PrinterException pe){
				JOptionPane.showMessageDialog(null,pe);
			}
		}
	}
}

