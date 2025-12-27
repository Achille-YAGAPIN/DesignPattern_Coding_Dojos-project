package fr.ensicaen.gl;
public class WindowsFactory implements Factory {

    @Override
    public FileNameParser createFileNameParser() {
        return new WindowsFileNameParser();
    }

    @Override
    public FolderCounter createFolderCounter() {
        return new WindowsFolderCounter();
    }

    @Override
    public FolderParser createFolderParser() {
        return new WindowsFolderParser();
    }
}
