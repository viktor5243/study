package main.java.head.first.java.chapter5;

public class Output {

	public static void main(String[] args) {
		
		Output o = new Output();
		o.go();
		
	}
	void go() {
		int y = 7;
		for(int x=1; x<8; x++) {
			y++;
			if(x>4) {
				System.out.println(++y + " ");
			}
			if(y>14) {
				System.out.println("x=" + x);
				break;
			}
		}/*
		x=1,y=8
		x=2,y=9
		x=3,y=10
		x=4,y=11
		x=5,y=��13
		x=6,y=��15
		��x=7,y=17
		break�̂��߁A�I��
		*/
	}
	
	
}
