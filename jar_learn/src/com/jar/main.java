package com.jar;

public class main {

	public static void main(String[] args) {
		System.out.println("hi jar");

		// cd give_the_path
		// java -jar jar_learn.jar
		// jar xf jar_learn.jar

		/*
		 * The META-INF/MANIFEST.MF file in a JAR (Java ARchive) file is a metadata file
		 * that contains information about the contents of the JAR file. It is located
		 * in the META-INF directory within the JAR file. The META-INF/MANIFEST.MF file
		 * can contain various attributes and values, but one of its primary purposes is
		 * to define the main class of the application if the JAR file is intended to be
		 * executable. This is particularly relevant for executable JAR files.
		 * 
		 * Here are some common attributes found in a MANIFEST.MF file:
		 * 
		 * 1. Manifest-Version: Specifies the version of the manifest file format. 2.
		 * Created-By: Indicates the tool or software used to create the JAR file. 3.
		 * Main-Class: Specifies the fully qualified name of the main class of the
		 * application. This attribute is crucial for executable JAR files. 4.
		 * Class-Path: Specifies additional JAR files or directories containing classes
		 * that are required by the main class. 5. Implementation-Version: Specifies the
		 * version of the application. 6. Implementation-Vendor: Specifies the name of
		 * the organization or vendor responsible for the implementation. 7.
		 * Implementation-Title: Specifies the title or name of the application.
		 * 
		 * The presence and content of the META-INF/MANIFEST.MF file depend on how the
		 * JAR file was created. For example, if you create an executable JAR file using
		 * a build tool like Maven or Gradle, the MANIFEST.MF file may be automatically
		 * generated and populated with necessary attributes. Overall, the
		 * META-INF/MANIFEST.MF file provides important metadata about the JAR file and
		 * its contents, and it plays a significant role in how the JAR file is executed
		 * and used.
		 */

		/*
		 * The concept of the classpath in Java is similar to the PATH environment
		 * variable in Windows (and similar environment variables in other operating
		 * systems). Just as the classpath tells the JVM where to find classes and
		 * resources, the PATH variable tells the operating system where to find
		 * executable files (such as commands or programs) when executing commands from
		 * the command prompt or terminal. Both the classpath and PATH variable specify
		 * a list of directories (or locations) where the respective systems (JVM or
		 * operating system) should look for specific types of files or resources.
		 * However, they serve different purposes and are used by different components
		 * of the system (JVM for classpath, operating system for PATH variable).
		 */
	}

}
