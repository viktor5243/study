package main.java.head.first.java.chapter15;
import java.io.*;
import java.net.*;

public class DailyAdviceServer {

	String[] adviceList = {"Take smaller bites", "Go for the tight jeans. No they do NOT make you look fat.", "One word: inappropriate", "Just for today, be honest. Tell your boss what you *really* think", "You might want to rethink that haircut."};	
	
	public void go() {
		
		try {
			ServerSocket serverSock = new ServerSocket(4242);
			
			//�N���C�A���g����̃��N�G�X�g��҂��󂯂�i���N�G�X�g�ɑΉ�����j���߂̖������[�v
			while(true) {
				
				//accept()���\�b�h�̓��N�G�X�g������܂ŉ������Ȃ��B���N�G�X�g������΁A�N���C�A���g�Ƃ̒ʐM�̂��߂�Socket�I�u�W�F�N�g��߂��B
				Socket sock = serverSock.accept(); 
				
				PrintWriter writer = new PrintWriter(sock.getOutputStream());
				String advice = getAdvice();
				writer.println(advice);
				writer.close();
				System.out.println(advice);
			}
		}catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
	private String getAdvice() {
		int random = (int)(Math.random() * adviceList.length);
		return adviceList[random];
	}
	
	public static void main(String[] args) {
		DailyAdviceServer server = new DailyAdviceServer();
		server.go();
	}
}
