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
			
			//動きを少し遅くする。円の動きが見えにくくなるため。スレッドについては15章で詳述。
			try {
				Thread.sleep(50);
			}catch(Exception ex){}
		}
	}
	
	class MyDrawPanel extends JPanel{
		
		public void paintComponent(Graphics g) {
			
			//↓この2行がなければ、描画済みの円が消えず、軌跡として残ってしまう。
			g.setColor(Color.white);
			g.fillRect(0, 0, this.getWidth(), this.getHeight());//JPanelクラスから継承したメソッド
			
			g.setColor(Color.green);
			g.fillOval(x, y, 40, 40);
		}
	}
}
