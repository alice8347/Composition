
public class Person {
    //composition has-a relationship
    private String name;
    private int age;
	private Job job;
    private Education education;
    
    public Person(){
        name = "Bob";
        age = 22;
    	this.job = new Job();
        this.education = new Education();
        job.setSalary(1000L);
        education.setSchools("HSNU", "NCCU", "Purdue University", "UIUC", "Montgomery College");
    }
    public long getSalary() {
        return job.getSalary();
    }
    
    public String getSchools() {
    	return education.getSchools();
    }
    
    @Override
    public String toString() {
    	return "Name [" + name + "]\nAge [" + age + "]\n" + job.toString() + "\n" + education.toString();
    }
}