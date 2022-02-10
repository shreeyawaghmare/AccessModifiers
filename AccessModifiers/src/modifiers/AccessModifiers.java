package modifiers;

public class AccessModifiers {
	    int no;

	    float hr;

	    int nc;

	    void displayStudents() {//m1

	        System.out.println("Number of Students");
            
	    }

	    void displayHours() {//m2

	        System.out.println("Number of Hours");
	       
	    }

	    void displayClass() {//m3

	        System.out.println("Number of Class");

	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 AccessModifiers am = new AccessModifiers();

	        am.displayStudents();
	        am.displayHours();
	        am.displayClass();
	}

}
