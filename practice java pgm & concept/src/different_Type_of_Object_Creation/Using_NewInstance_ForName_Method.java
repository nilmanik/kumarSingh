package different_Type_of_Object_Creation;

public class Using_NewInstance_ForName_Method {
	/*
	 * 2) Using New Instance : If we know the name of the class & if it has a public default constructor we can create an object –Class.forName("fully qualified name").
	 * means of fully qualified name is (pacakageName.classname) 
	 *  We can use it to create the Object of a Class. Class.forName actually loads the Class in Java but doesn’t create any Object.
	 *  To Create an Object of the Class you have to use the new Instance Method of the Class.
	 */
	/*
	 * we can write multiple catch block in one catch...see the line number 22..3 exception catch block in one catch block.
	 */
	
	String name="nilmani programme";
	
	public static void main(String[] args) {
		
		try {
			Using_NewInstance_ForName_Method cls=(Using_NewInstance_ForName_Method) Class.forName("different_Type_of_Object_Creation.Using_NewInstance_ForName_Method").newInstance();
			System.out.println(cls.name);
			
																/*
																 * OR
																 */
			
			Using_NewInstance_ForName_Method obj = Using_NewInstance_ForName_Method.class.newInstance();
			
			//here above line class refer the current class and then we can use the newInstane method of "Class" class to create the object.
			//We can say that class work exactly the same as Class.forName.   
			
			System.out.println(obj.name);
			} 
		catch (InstantiationException |IllegalAccessException |ClassNotFoundException e) {
				e.printStackTrace();
			}
		
	}

}
