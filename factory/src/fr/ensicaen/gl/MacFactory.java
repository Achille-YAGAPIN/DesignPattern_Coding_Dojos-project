package fr.ensicaen.gl;
public class MacFactory implements Factory {

    @Override
    public FileNameParser createFileNameParser() {
        return new MacFileNameParser();
    }

    @Override
    public FolderCounter createFolderCounter() {
        return new MacFolderCounter();
    }

    @Override
    public FolderParser createFolderParser() {
        return new MacFolderParser();
    }
}
