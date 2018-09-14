package different_Type_of_Object_Creation;

public class New_keyword {
	String name;
	String colour;
	
public void run(String name,String colour){
		this.name=name;
		this.colour=colour;
	}
public String getName(){
	return name;
	
}

public String getColour(){
	return colour;
}
	public static void main(String[] args) {
		New_keyword newKey= new New_keyword();
		newKey.run("mustang", "white");
		System.out.println(newKey.getName());
		
		New_keyword newKey1= new New_keyword();
		newKey1.run("mustang", "white");
		System.out.println(newKey1.getColour());
	}

}
