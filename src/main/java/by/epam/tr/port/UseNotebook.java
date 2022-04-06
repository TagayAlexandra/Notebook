package by.epam.tr.port;

import by.epam.tr.entity.Note;

import java.time.LocalDate;
import java.util.ArrayList;

public interface UseNotebook {
    Note createNote(String note);

    void addNewNote(Note note, ArrayList<Note> notes);

    Note searchNoteByDate(LocalDate date, ArrayList<Note> notes);

    Note searchNoteByContent(String note, ArrayList<Note> notes);

    void removesNote(Note note, ArrayList<Note> notes);
}
