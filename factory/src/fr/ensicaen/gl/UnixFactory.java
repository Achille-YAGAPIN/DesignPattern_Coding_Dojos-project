package fr.ensicaen.gl;
public class UnixFactory implements Factory {

    @Override
    public FileNameParser createFileNameParser() {
        return new UnixFileNameParser();
    }

    @Override
    public FolderCounter createFolderCounter() {
        return new UnixFolderCounter();
    }

    @Override
    public FolderParser createFolderParser() {
        return new UnixFolderParser();
    }
}
