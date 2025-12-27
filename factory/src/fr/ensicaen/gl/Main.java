package fr.ensicaen.gl;

public class Main {

    static final String WINDOWS_FILENAME = "C:\\Windows\\folder\\hello.dll";
    static final String UNIX_FILENAME = "/unix/folder/hello.so";

    public static void main( String[] args ) {
        main_parse_filename(WINDOWS_FILENAME);
    }

    public static void main_parse_filename( String path ) {
        int index = path.lastIndexOf("\\");
        String r = path.substring(index + 1);
        System.out.println(r);
    }
}