package fr.ensicaen.gl;
public class WindowsFolderCounter implements FolderCounter{

    @Override
    public int count(String path){
        String[] pathArray = path.split("\\\\");
        return pathArray.length - 1;
    }   
}