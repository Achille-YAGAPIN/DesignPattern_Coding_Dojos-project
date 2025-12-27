package fr.ensicaen.gl;

public class UnixFolderParser implements FolderParser {
    
    @Override
    public String parseFolder(String path){
        int index = path.lastIndexOf("/");
        String r = path.substring(0,index);
        return r;
    }
}
