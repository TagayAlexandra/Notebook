package by.epam.tr.port;

import by.epam.tr.entity.Note;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public interface UseNotebook {
    Note createNote(String note);

    void addNewNote(Note note, List<Note> notes);

    Note searchNoteByDate(LocalDate date, List<Note> notes);

    Note searchNoteByContent(String note, List<Note> notes);

    void removesNote(Note note, List<Note> notes);
}
