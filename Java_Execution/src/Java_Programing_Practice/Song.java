package Java_Programing_Practice;

public class Song {
	String name;
	String singer;
	double duration;
	
	Song (String name, String singer, double duration){
		this.name=name;
		this.singer=singer;
		this.duration=duration;
	}

}

class JaiHo extends Song{
	JaiHo (String name, String singer, double duration){
		super (name, singer, duration);
	}
}
