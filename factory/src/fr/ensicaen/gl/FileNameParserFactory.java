package fr.ensicaen.gl;

public class FileNameParserFactory {

    public static FileNameParser createParser(String os){
        if (os.equalsIgnoreCase("windows")) return new WindowsFileNameParser();
        else if (os.equalsIgnoreCase("unix")) return new UnixFileNameParser();
        else throw new IllegalArgumentException("OS inconnu : " + os);
    }
}
