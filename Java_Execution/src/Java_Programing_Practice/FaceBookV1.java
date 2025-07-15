package Java_Programing_Practice;

public class FaceBookV1 {
	public void Sendingmsg() {
		System.out.println("Text");
	}
}

class FaceBookV2 extends FaceBookV1 {
	@Override
	public void Sendingmsg () {
		System.out.println("Voice msg and text");	
	}
}
