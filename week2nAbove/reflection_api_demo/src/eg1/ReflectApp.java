package eg1;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectApp {
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		
		
		Method method = Class1.class.getDeclaredMethod("someMethod");
		method.setAccessible(true);
		method.invoke(null);
		
		Field field = String.class.getDeclaredField("value");
		field.setAccessible(true);
		
		
		String s = "Hello world";
		
		field.set(s, new char[] {});
		
		System.out.println("Begin");
		System.out.println(s);
		System.out.println("End");
	}

}
