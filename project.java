import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class tmq extends JFrame implements ActionListener{
	Button receiptBtn,resultBtn,cvBtn,stationaryBtn;
	JLabel nameLbl,idLbl,classLbl,feeLbl;
	JTextField nameTxt,idTxt,classTxt,feeTxt;
	tmq(){
		JButton receiptBtn =new JButton("Receipt");
		JButton resultBtn =new JButton("Result");
		JButton cvBtn =new JButton("Faculties");
		JButton stationaryBtn =new JButton("Stationary");
		JLabel nameLbl=new JLabel("Student name");
		JLabel idLbl=new JLabel("Id");
		JLabel classLbl=new JLabel("Clas");
		JLabel feeLbl=new JLabel("fee");
		JTextField nameTxt=new JTextField();
		JTextField idTxt=new JTextField();
		JTextField classTxt=new JTextField();
		JTextField feeTxt=new JTextField();
		add(receiptBtn);
		add(resultBtn);
		add(cvBtn);
		add(stationaryBtn);
		add(nameLbl);
		add(idLbl);
		add(classLbl);
		add(feeLbl);
		add(nameTxt);
		add(idTxt);
		add(classTxt);
		add(feeTxt);
		receiptBtn.addActionListener(this);
		resultBtn.addActionListener(this);
		cvBtn.addActionListener(this);
		stationaryBtn.addActionListener(this);
		receiptBtn.setBounds(20,120,90,50);
		resultBtn.setBounds(110,120,90,50);
		cvBtn.setBounds(200,120,90,50);
		stationaryBtn.setBounds(290,120,90,50);
		nameLbl.setBounds(20,180,90,30);
		idLbl.setBounds(20,220,90,30);
		classLbl.setBounds(20,260,90,30);
		feeLbl.setBounds(20,300,90,30);
		nameTxt.setBounds(110,180,80,30);
		idTxt.setBounds(110,220,80,30);
		classTxt.setBounds(110,260,80,30);
		feeTxt.setBounds(110,300,80,30);
		setVisible(true);
		setSize(400,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String cp[]){
		tmq obj= new tmq();
	}
}