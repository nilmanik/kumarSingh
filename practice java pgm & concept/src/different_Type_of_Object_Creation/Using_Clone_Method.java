package different_Type_of_Object_Creation;

public class Using_Clone_Method implements Cloneable{
	/*
	 * The object cloning is a way to create exact copy of an object. The clone() method of Object class is used to clone an object.
The java.lang.Cloneable interface must be implemented by the class whose object clone we want to create. 
If we don't implement Cloneable interface, clone() method generates CloneNotSupportedException.
The clone() method is defined in the Object class.
	 */
	String name="nilmani";
	
	public static void main(String[] args) {
		Using_Clone_Method nam= new Using_Clone_Method();
		System.out.println(nam.name);
		
		
		try {
			Using_Clone_Method clon=(Using_Clone_Method) nam.clone();
			System.out.println(clon.name);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
	}
}
/*
 * Why use clone() method ?
The clone() method saves the extra processing task for creating the exact copy of an object. 
If we perform it by using the new keyword, it will take a lot of processing time to be performed that is why we use object cloning.

Advantage of Object cloning ?

1.Although Object.clone() has some design issues but it is still a popular and easy way of copying objects.
 Following is a list of advantages of using clone() method:

2. You don't need to write lengthy and repetitive codes. Just use an abstract class with a 4- or 5-line long clone() method.
It is the easiest and most efficient way for copying objects, especially if we are applying it to an already developed or an old project.
 Just define a parent class, implement Cloneable in it, provide the definition of the clone() method and the task will be done.

3. Clone() is the fastest way to copy array.

Disadvantage of Object cloning ?

Following is a list of some disadvantages of clone() method:

1. To use the Object.clone() method, we have to change a lot of syntaxes to our code, like implementing a Cloneable interface,
 defining the clone() method and handling CloneNotSupportedException, and finally, calling Object.clone() etc.
2. We have to implement cloneable interface while it doesn't have any methods in it. 
We just have to use it to tell the JVM that we can perform clone() on our object.

3. Object.clone() is protected, so we have to provide our own clone() and indirectly call Object.clone() from it.

4. Object.clone() doesn?t invoke any constructor so we don?t have any control over object construction.
5. If you want to write a clone method in a child class then all of its super classes should define the clone() method in them or inherit it from another parent class.
 Otherwise, the super.clone() chain will fail.
 
6. Object.clone() supports only shallow copying but we will need to override it if we need deep cloning.
 */
