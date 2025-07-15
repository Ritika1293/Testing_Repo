package Java_Programing_Practice;

public class File {
	String name;
	String ext;
	int size;
	
	File (String name, String ext, int size){
		this.name=name;
		this.ext=ext;
		this.size=size;
	}
}

class text extends File{
	int noOfLines;
	text (String name, String ext, int size, int noOfLines){
		super (name, ext,size);
		this.noOfLines=noOfLines;
	}
}