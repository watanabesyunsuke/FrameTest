package frametest;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.LayoutManager;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import lib.Calculation_lib;

public class Frame_view extends Frame implements ActionListener, WindowListener{
	
	private TextField text1 = new TextField("",10);
	private TextField text2 = new TextField("",10);
	private Button button1 = new Button("足し算");
	private Button button2 = new Button("引き算");
	private Button button3 = new Button("掛け算");
	private Button button4 = new Button("割り算");
	private TextField text3 = new TextField("",10);
	
    public Frame_view() {
	    addWindowListener(this);
	    setTitle("FrameTest");
	    setLayout((LayoutManager) new FlowLayout(FlowLayout.CENTER));
	    add(text1);
	    add(text2);
	    add(button1);
	    add(button2);
	    add(button3);
	    add(button4);
	    add(new Label("="));
	    add(text3);
	    button1.addActionListener(this);
	    button2.addActionListener(this);
	    button3.addActionListener(this);
	    button4.addActionListener(this);
	}
	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
	    System.exit(0);	
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		int val1 =Integer.parseInt(text1.getText());
		int val2 =Integer.parseInt(text2.getText());
		//text3.setText(String.valueOf(val1+val2));
		Calculation_lib clib = new Calculation_lib(val1,val2);
		if(arg0.getSource()==button1) {
	     text3.setText(String.valueOf(clib.getPlus()));
		} else if(arg0.getSource()==button2) {
		 text3.setText(String.valueOf(clib.getMinus()));
		} else if(arg0.getSource()==button3) {
	    text3.setText(String.valueOf(clib.getTime()));
		} else if(arg0.getSource()==button4) {
	    text3.setText(String.valueOf(clib.getDivide()));
		}
	}

}
