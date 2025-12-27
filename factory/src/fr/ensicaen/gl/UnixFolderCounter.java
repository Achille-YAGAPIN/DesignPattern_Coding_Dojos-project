package fr.ensicaen.gl;
public class UnixFolderCounter implements FolderCounter {
    
    @Override
    public int count(String path){
        String[] pathArray = path.split("/");
        return pathArray.length - 2;
    }   
}