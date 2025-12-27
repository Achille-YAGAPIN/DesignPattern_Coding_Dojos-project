package fr.ensicaen.gl;

public class FileNameFactory {
    
    public FileNameParser _FileParser;
    public FolderCounter _FolderCount;

    public void createParsers(String type){
        
        if (type.equalsIgnoreCase("windows")){
            _FileParser = new WindowsFileNameParser();
            _FolderCount = new WindowsFolderCounter();
        }
        else if (type.equalsIgnoreCase("unix")) {
            _FileParser = new UnixFileNameParser();
            _FolderCount = new UnixFolderCounter();
        }
        else throw new IllegalArgumentException("OS inconnu : " + type);
    }
}
