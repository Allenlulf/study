package com.proxy.JDK;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import javax.tools.JavaCompiler;
import javax.tools.JavaCompiler.CompilationTask;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

/**
 * ���ɴ������Ĵ���
 * 
 * @author lulf
 *
 */
public class MyProxy {

	private static String ln = "\r\n";

	// �Á��ȡ�������
	public static Object newProxyInstance(MyClassLoader classLoader, Class<?>[] interfaces, MyInvocationHandler h) throws Exception {
		// 1 ����Դ����
		String proxySrc = generateSrc(interfaces[0]);
		// 2 �����ɵ�Դ������������̣�����Ϊ.java�ļ�
        String filepath=MyProxy.class.getResource("").getPath();
        File f=new File(filepath+"$Proxy0.java");
        FileWriter fw;
		try {
			fw = new FileWriter(f);
			fw.write(proxySrc);
		    fw.flush();
		    fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 3 ����Դ���룬��������.class�ļ�
		JavaCompiler compiler=ToolProvider.getSystemJavaCompiler();
		StandardJavaFileManager manager=compiler.getStandardFileManager(null, null, null);
		Iterable iterable=manager.getJavaFileObjects(f);
		CompilationTask task=compiler.getTask(null, manager, null, null, null, iterable);
		task.call();
		try {
			manager.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 4 ��class�ļ��е����ݣ���̬���ص�JVM��
		// 5 ���ر������Ĵ������
		Class procyclass=classLoader.findClass("$Proxy0");
		Constructor c=procyclass.getConstructor(MyInvocationHandler.class);
		return c.newInstance(h);
	}

	private static String generateSrc(Class<?> interfaces) {
		StringBuffer src = new StringBuffer("package com.lulf.sjmsdemo;" + ln);
		src.append("import java.lang.reflect.Method;" + ln);
		src.append("public class $Proxy0 implements " + interfaces.getName() + "{" + ln);
		src.append("MyInvocationHandler h;" + ln);
		src.append("public $Proxy0(MyInvocationHandler h) {" + ln);
		src.append("this.h=h;" + ln);
		src.append("}" + ln);
		for (Method m : interfaces.getMethods()) {
			src.append("public " + m.getReturnType() + " " + m.getName() + "() throws Throwable{" + ln);
			src.append("Method m= " + interfaces.getName() + ".class.getMethod(\"" + m.getName() + "\",new Class[]{});" + ln);
			src.append("this.h.invoke(this,m,null);" + ln);
			src.append("}" + ln);
		}
		src.append("}");
		return src.toString();
	}

}
