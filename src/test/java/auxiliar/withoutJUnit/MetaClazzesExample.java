package auxiliar.withoutJUnit;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MetaClazzesExample {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		try {
			// Metaclase "Class"
			// No es un coordinate
			// Es un objeto que guarda la maquina virtual con la informacion de la clase coordenada
			Class clazz = Class.forName("ticTacToe.utils.Coordinate");
			Object object = clazz.getConstructor(int.class, int.class)
					.newInstance(3, 3);
			System.out.println("Objeto: " + object);
			// Obtener el metodo "inMainDiagonal"
			Method method = clazz.getDeclaredMethod("inMainDiagonal");
			boolean inMainMethod = (boolean) method.invoke(object);
			System.out.println("InMainDiagonal: " + inMainMethod);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
	}
}
