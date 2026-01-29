package praticeJava;

public class PraticeJava {
	
	
	 // Private variables (data hiding)
    private String name;
    private int age;
    
    public void setName(String name) {
		this.name = name;
	}
    
    public String getName() {
		return name;
	}
    
    public int getAge() {
		return age;
	}
    
   public void setAge(int age) {
	this.age = age;
}
   
   
   
	
	public static void main(String[] args) {
		
	PraticeJava pr=new PraticeJava();
	pr.setName("robinson");
	System.out.println(pr.getName());
	
	pr.setAge(28);
	System.out.println(pr.getAge());

		}

}
