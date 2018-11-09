package auxiliar.withoutJUnit;

import java.io.File;

public class MetaClazzesInspectorExample {

	public static void main(String[] args){
		// Se crea un fichero para ver que hay en el disco duro en esta carpeta
		File directory = new File("C:\\Users\\Christian\\eclipse-workspace\\JUnitC\\src\\test\\java\\auxiliar\\withoutJUnit");
		String[] clazzes = directory.list();
		for(String clazz : clazzes) {
			System.out.println(clazz);
		}	
//		AnnotationExample.java
//		AssertExample.java
//		ClazzExample.java
//		ClosedIntervalTest.java
//		CoordenateTest.java
//		MetaClazzesExample.java
//		MetaClazzesInspectorExample.java
//		MetaClazzesWithAnnotationsExample.java
	}
}
