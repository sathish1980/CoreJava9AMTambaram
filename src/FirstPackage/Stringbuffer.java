package FirstPackage;

public class Stringbuffer {
	
	public void stringbufferimplementation()
	{
		//StringBuffer s = new StringBuffer();
		StringBuilder s = new StringBuilder();
		s.append("sathish");
		System.out.println(s);
		s.insert(2, "BESANT");
		System.out.println(s);
		s.replace(1, 3,"NEW");
		System.out.println(s);
		s.delete(5, 9);
		System.out.println(s);
		s.reverse();
		System.out.println(s);
		s.length();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stringbuffer s = new Stringbuffer();
		s.stringbufferimplementation();
	}

}
