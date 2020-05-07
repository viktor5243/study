package main.java.head.first.java.chapter12;
import javax.swing.*;
import java.awt.*;

public class SimpleAnimation {

	int x = 70;
	int y = 70;
	
	public static void main(String[] args) {
		SimpleAnimation gui = new SimpleAnimation();
		gui.go();
	}
	
	public void go() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MyDrawPanel drawPanel = new MyDrawPanel();
		
		frame.getContentPane().add(drawPanel);
		frame.setSize(300, 300);
		frame.setVisible(true);
		
		for(int i=0; i<130; i++) {
			
			x++;
			y++;
			
			drawPanel.repaint();
			
			//�����������x������B�~�̓����������ɂ����Ȃ邽�߁B�X���b�h�ɂ��Ă�15�͂ŏڏq�B
			try {
				Thread.sleep(50);
			}catch(Exception ex){}
		}
	}
	
	class MyDrawPanel extends JPanel{
		
		public void paintComponent(Graphics g) {
			
			//������2�s���Ȃ���΁A�`��ς݂̉~���������A�O�ՂƂ��Ďc���Ă��܂��B
			g.setColor(Color.white);
			g.fillRect(0, 0, this.getWidth(), this.getHeight());//JPanel�N���X����p���������\�b�h
			
			g.setColor(Color.green);
			g.fillOval(x, y, 40, 40);
		}
	}
}
