package fr.ensicaen.gl;
public class WindowsFileNameParser implements FileNameParser {
    
    @Override
    public String parse( String path ) {
        int index = path.lastIndexOf("\\");
        String r = path.substring(index + 1);
        return r;
    }
    
}
