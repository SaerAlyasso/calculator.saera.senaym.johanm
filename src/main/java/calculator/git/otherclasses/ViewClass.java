package calculator.git.otherclasses;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * This class implements the interface ActionListener.
 * In this class we create a frame , add components to the 
 * frame and actions to the components when they are clicked.
 * 
 * @author Saer, Senay
 * @version 1.0
 * @since 2016-11-02
 *
 */
public class ViewClass implements ActionListener{

	private JFrame frame;
	private JTextField textField = new JTextField();
	
	// First row
	private JButton btnClear = new JButton("C");
	private JButton btnFibonacci = new JButton("Fn");
	private JButton btnPow = new JButton("x^n");
	private JButton btnPercent = new JButton("%");
	private JButton btnAbsolute = new JButton("abs");
	
	// Second row
	private JButton btn7 = new JButton("7");
	private JButton btn8 = new JButton("8");
	private JButton btn9 = new JButton("9");
	private JButton btnDivision = new JButton("/");
	private JButton btnSquare = new JButton(" √");
	
	// Third row
	private JButton btn4 = new JButton("4");
	private JButton btn5 = new JButton("5");
	private JButton btn6 = new JButton("6");
	private JButton btnMultiplication = new JButton("*");
	private JButton btnAddition = new JButton("+");
	
	// Fourth row
	private JButton btn1 = new JButton("1");
	private JButton btn2 = new JButton("2");
	private JButton btn3 = new JButton("3");
	private JButton btnSubtraction = new JButton("-");
	private JButton btnDecimal = new JButton(".");
	
	// Fifth row
	private JButton btn0 = new JButton("0");
	private JButton btnEqual = new JButton("=");
	private JButton btnRound = new JButton("Round");
	
	/**
	 * Create the application.
	 */
	public ViewClass() {
		initialize();
		addComponents();
		addActionListeners();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Dialog", Font.PLAIN, 10));
		frame.setBounds(100, 100, 295, 345);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		textField.setBounds(10, 2, 275, 31);
		textField.setColumns(10);

		// First row
		btnClear.setFont(new Font("Dialog", Font.BOLD, 12));
		btnClear.setBounds(10, 35, 50, 50);		
		btnFibonacci.setFont(new Font("Dialog", Font.BOLD, 10));
		btnFibonacci.setBounds(66, 35, 50, 50);	
		btnPow.setFont(new Font("Dialog", Font.BOLD, 7));
		btnPow.setBounds(122, 35, 50, 50);	
		btnPercent.setFont(new Font("Dialog", Font.BOLD, 12));
		btnPercent.setBounds(178, 35, 50, 50);	
		btnAbsolute.setFont(new Font("Dialog", Font.BOLD, 7));
		btnAbsolute.setBounds(234, 35, 50, 50);
		
		// Second row	
		btn7.setFont(new Font("Dialog", Font.BOLD, 20));
		btn7.setBounds(10, 90, 50, 50);
		btn8.setFont(new Font("Dialog", Font.BOLD, 20));
		btn8.setBounds(66, 90, 50, 50);
		btn9.setFont(new Font("Dialog", Font.BOLD, 20));
		btn9.setBounds(122, 90, 50, 50);
		btnDivision.setFont(new Font("Dialog", Font.BOLD, 20));
		btnDivision.setBounds(178, 90, 50, 50);
		btnSquare.setFont(new Font("Dialog", Font.BOLD, 14));
		btnSquare.setBounds(234, 90, 50, 50);

		// Third row
		btn4.setFont(new Font("Dialog", Font.BOLD, 20));
		btn4.setBounds(10, 145, 50, 50);
		btn5.setFont(new Font("Dialog", Font.BOLD, 20));
		btn5.setBounds(66, 145, 50, 50);
		btn6.setFont(new Font("Dialog", Font.BOLD, 20));
		btn6.setBounds(122, 145, 50, 50);
		btnMultiplication.setFont(new Font("Dialog", Font.BOLD, 20));
		btnMultiplication.setBounds(178, 145, 50, 50);
		btnAddition.setFont(new Font("Dialog", Font.BOLD, 18));
		btnAddition.setBounds(234, 145, 50, 50);

		// Fourth row
		btn1.setFont(new Font("Dialog", Font.BOLD, 20));
		btn1.setBounds(10, 200, 50, 50);
		btn2.setFont(new Font("Dialog", Font.BOLD, 20));
		btn2.setBounds(66, 200, 50, 50);
		btn3.setFont(new Font("Dialog", Font.BOLD, 20));
		btn3.setBounds(122, 200, 50, 50);
		btnSubtraction.setFont(new Font("Dialog", Font.BOLD, 20));
		btnSubtraction.setBounds(178, 200, 50, 50);
		btnDecimal.setFont(new Font("Dialog", Font.BOLD, 20));
		btnDecimal.setBounds(234, 200, 50, 50);
	
		// Fifth row
		btn0.setFont(new Font("Dialog", Font.BOLD, 20));
		btn0.setBounds(10, 255, 50, 50);
		btnEqual.setFont(new Font("Dialog", Font.BOLD, 18));
		btnEqual.setBounds(66, 255, 107, 50);
		btnRound.setFont(new Font("Dialog", Font.BOLD, 18));
		btnRound.setBounds(178, 255, 107, 50);

	}
	
	/**
	 * Adding the components to the frame
	 */
	public void addComponents(){
		//Adding textField
		frame.getContentPane().add(textField);
		
		//Adding first row
		frame.getContentPane().add(btnClear);
		frame.getContentPane().add(btnFibonacci);
		frame.getContentPane().add(btnPow);
		frame.getContentPane().add(btnPercent);
		frame.getContentPane().add(btnAbsolute);
		
		//Adding second row
		frame.getContentPane().add(btn7);
		frame.getContentPane().add(btn8);
		frame.getContentPane().add(btn9);
		frame.getContentPane().add(btnDivision);
		frame.getContentPane().add(btnSquare);
		
		//Adding third row
		frame.getContentPane().add(btn4);
		frame.getContentPane().add(btn5);
		frame.getContentPane().add(btn6);
		frame.getContentPane().add(btnMultiplication);
		frame.getContentPane().add(btnAddition);
		
		//Adding fourth row
		frame.getContentPane().add(btn1);
		frame.getContentPane().add(btn2);
		frame.getContentPane().add(btn3);
		frame.getContentPane().add(btnSubtraction);
		frame.getContentPane().add(btnDecimal);
		
		//Adding fifth row
		frame.getContentPane().add(btn0);
		frame.getContentPane().add(btnEqual);
		frame.getContentPane().add(btnRound);
	}
	
	
	/**
	 * Adding ActionListeners to the components
	 */
	public void addActionListeners(){
		
		//First row
		btnClear.addActionListener(this);
		btnFibonacci.addActionListener(this);
		btnPow.addActionListener(this);
		btnPercent.addActionListener(this);
		btnAbsolute.addActionListener(this);
		
		//Second row
		btn7.addActionListener(this);
		btn8.addActionListener(this);
		btn9.addActionListener(this);
		btnDivision.addActionListener(this);
		btnSquare.addActionListener(this);
		
		//Third row
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		btn6.addActionListener(this);
		btnMultiplication.addActionListener(this);
		btnAddition.addActionListener(this);
		
		//Fourth row
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btnSubtraction.addActionListener(this);
		btnDecimal.addActionListener(this);
		
		//Fifth row
		btn0.addActionListener(this);
		btnEqual.addActionListener(this);
		btnRound.addActionListener(this);
		
		
	}

	/**
	 * actionPerformed is a method in listener interface. Here we write code
	 * that reacts to the action. ActionEvent e gives information about the 
	 * event and its source.
	 */
	public void actionPerformed(ActionEvent e) {
		
		
	}
}
