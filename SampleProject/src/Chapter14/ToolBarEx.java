package Chapter14;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JToolBar;

public class ToolBarEx extends JFrame {
	private Container contentPane;
	
	public ToolBarEx() {
		setTitle("툴바 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		createToolBar();
		setSize(400, 200);
		setVisible(true);
	}
	
	//툴바를 생성하여 컨텐츠팬에 부착한다.
	private void createToolBar() {
		//툴바 생성
		JToolBar toolBar = new JToolBar("Kitae Menu");//툴바의 이름 "Kitae Menu"
		toolBar.setBackground(Color.LIGHT_GRAY);
		
		//툴바에 메뉴로 사용할 컴포넌트를 삽입한다.
		toolBar.add(new JButton("New"));
		toolBar.add(new JButton(new ImageIcon("images/open.jpg")));
		toolBar.addSeparator();
		toolBar.add(new JButton(new ImageIcon("images/save.jpg")));
		toolBar.add(new JLabel("search"));
		toolBar.add(new JTextField("text field"));
		
		JComboBox<String> combo = new JComboBox<String>();
		combo.addItem("Java");
		combo.addItem("C#");
		combo.addItem("C");
		combo.addItem("C++");
		toolBar.add(combo);
		
		//툴바를 컨텐츠팬의 NORTH에 부착한다.
		contentPane.add(toolBar, BorderLayout.NORTH);		
	}

	public static void main(String[] args) {
		new ToolBarEx();
	}

}
