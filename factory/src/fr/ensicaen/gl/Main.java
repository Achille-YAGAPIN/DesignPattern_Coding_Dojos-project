package fr.ensicaen.gl;

public class Main {

    static final String WINDOWS_FILENAME = "C:\\Windows\\folder\\hello.dll";
    static final String UNIX_FILENAME = "/unix/folder/hello.so";

    public static void main( String[] args ) {
        
        // Windows
        Factory windowsFactory = FactoryProducer.getFactory("windows");
        FileNameParser windowsParser = windowsFactory.createFileNameParser();
        FolderCounter windowsCounter = windowsFactory.createFolderCounter();

        System.out.println(windowsParser.parse(WINDOWS_FILENAME));
        System.out.println(windowsCounter.count(WINDOWS_FILENAME));

        // Unix
        Factory unixFactory = FactoryProducer.getFactory("unix");
        FileNameParser unixParser = unixFactory.createFileNameParser();
        FolderCounter unixCounter = unixFactory.createFolderCounter();

        System.out.println(unixParser.parse(UNIX_FILENAME));
        System.out.println(unixCounter.count(UNIX_FILENAME));
   
    }
}