package different_Type_of_Object_Creation;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Using_newInstance_method_of_Constructor_class_for_object_creation {
String name="nilmani programme";
	
	public static void main(String[] args) {
		
		try {
			Constructor<Using_newInstance_method_of_Constructor_class_for_object_creation> constructor=Using_newInstance_method_of_Constructor_class_for_object_creation.class.getConstructor();
			Using_newInstance_method_of_Constructor_class_for_object_creation CnewInstance=constructor.newInstance();
			System.out.println(CnewInstance.name);
			
			
			} 
		catch (InstantiationException |IllegalAccessException  | NoSuchMethodException | SecurityException | IllegalArgumentException | InvocationTargetException e) {
				e.printStackTrace();
			}
	}

}
