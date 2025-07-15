package Java_Programing_Practice;

public class MSOffice {
	String name;
	String ext;
	MSOffice (String name, String ext){
		this.name=name;
		this.ext=ext;
	}
}

class Word extends MSOffice{
	int lines;
	Word (String name, String ext, int lines){
	super (name, ext);
	this.lines=lines;
	}
}

class Excel extends MSOffice {
	int rows;
	int columns;
	Excel (String name, String ext,int rows,int columns){
		super (name, ext);
		this.rows=rows;
		this.columns=columns;
	}
}

class Powerpoint extends MSOffice {
	int slides;
	Powerpoint (String name, String ext, int slides){
		super (name, ext);
		this.slides=slides;
	}
}