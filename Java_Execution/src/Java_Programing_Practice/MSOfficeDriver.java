package Java_Programing_Practice;

public class MSOfficeDriver {
	public static void main(String[] args) {
		MSOffice m1=new Word ("Word", ".txt", 100);
		System.out.println(m1.name);
		System.out.println(m1.ext);
		Word w= (Word)m1;
		System.out.println(w.lines);
		
		MSOffice m2= new Excel ("Excel", ".xls", 150, 100);
		System.out.println(m2.name);
		System.out.println(m2.ext);
		Excel e=(Excel)m2;
		System.out.println(e.rows);
		System.out.println(e.columns);
		
		MSOffice m3=new Powerpoint ("Powerpoint",".ppt",240);
			System.out.println(m3.name);
			System.out.println(m3.ext);
			Powerpoint p= (Powerpoint)m3;
			System.out.println(p.slides);
		}	
	}
