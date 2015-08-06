import java.util.ArrayList;

public class Education {
	private ArrayList<String> schools = new ArrayList<String>();

	public String getSchools() {
		String schoolList = "";
		schoolList += schools.get(0);
		for (int i = 1; i < schools.size(); i++) {
			schoolList += ", " + schools.get(i);
		}
		return schoolList;
	}

	public void setSchools(String school1, String school2, String school3, String school4, String school5) {
		schools.add(school1);
		schools.add(school2);
		schools.add(school3);
		schools.add(school4);
		schools.add(school5);
	}

	@Override
	public String toString() {
		return "Education [schools = " + getSchools() + "]";
	}
	
}