package fr.ensicaen.gl;

public interface Factory {

    FileNameParser createFileNameParser();
    FolderCounter createFolderCounter();
    FolderParser createFolderParser();
}

