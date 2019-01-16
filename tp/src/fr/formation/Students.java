package fr.formation;


public class Students implements IStudent {
	
	
	public static void main(String[] args) {
		String student = "Aurélien,Pierre,Bayrem,Jennifer,Hélène,David,Julien";
		String[] named = student.split(" ");
		for (int i = 0; i < named.length; i++) {
		    System.out.println(named[i]);

	}
		

}
	
public static void add(String[] names) {
		
			
		
	}

	public static void add(boolean[] status) {
		// TODO Auto-generated method stub
		
	}
	
	public static void add(int[] groups) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String toString() {
		return "Students []";
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setName(String firstName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getGroup() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setGroup(int groupNumber) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isInternal() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setInternal(boolean internal) {
		// TODO Auto-generated method stub
		
	}
	
}


