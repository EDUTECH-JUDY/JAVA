package Chapter09;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ContentPaneEx extends JFrame {
	public ContentPaneEx() {
		setTitle("ContentPane과 JFrame");//프레임 타이틀 달기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//프레임 윈도우를 닫으면 프로그램을 종료하도록 설명
		
		Container contentPane = getContentPane();//컨텐트 팬을 알아낸다.
		contentPane.setBackground(Color.ORANGE);//컨탠트팬의 색을 오렌지색으로
		contentPane.setLayout(new FlowLayout());//컨텐트팬에 FlowLayout 배치관리자 달기
		
		contentPane.add(new JButton("OK"));//OK 버튼 달기
		contentPane.add(new JButton("Cancel"));//Cancel 버튼 달기
		contentPane.add(new JButton("Igonore"));//Ignore 버튼 달기
		
		setSize(300,150);//프레임 크기 300x150 설정
		setVisible(true);//화면에 프레임 출력
	}

	public static void main(String[] args) {
		new ContentPaneEx();

	}

}
