package bento.delivery.program;

public class ProgramClient {
	
	ProgramClient(){
		run();
	}
	
	void run(){
		FrameMain jFrame = new FrameMain();
		jFrame.setVisible(true);
	}

	public static void main(String[] args) {
		new ProgramClient();
	}

}
