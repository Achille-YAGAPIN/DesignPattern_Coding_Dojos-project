package fr.ensicaen.gl;

public class Main {

    static final String WINDOWS_FILENAME = "C:\\Windows\\folder\\hello.dll";
    static final String UNIX_FILENAME = "/unix/folder/hello.so";

    public static void main( String[] args ) {
        FileNameFactory factory = new FileNameFactory();

        // Windows
        factory.createParsers("windows");
        System.out.println(factory._FileParser.parse(WINDOWS_FILENAME));
        System.out.println(factory._FolderCount.count(WINDOWS_FILENAME));

        // Unix
        factory.createParsers("unix");
        System.out.println(factory._FileParser.parse(UNIX_FILENAME));
        System.out.println(factory._FolderCount.count(UNIX_FILENAME));
   
    }
}