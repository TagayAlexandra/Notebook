package by.epam.tr.use;

import by.epam.tr.entity.Note;
import by.epam.tr.port.UseNotebook;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UseNotebookImpl implements UseNotebook {

    @Override
    public Note createNote(String note) {
        return new Note(note, LocalDate.now());
    }

    @Override
    public void addNewNote(Note note, List<Note> notes) {
        notes.add(note);

    }

    @Override
    public Note searchNoteByDate(LocalDate date, List<Note> notes) {
        for (Note elementNotes : notes) {
            if (elementNotes.getDateAddNote().isEqual(date)) {
                return elementNotes;
            }
        }
        return null;
    }

    @Override
    public Note searchNoteByContent(String note, List<Note> notes) {
        for (Note elementNotes : notes) {
            if (elementNotes.getNote().equals(note)) {
                return elementNotes;
            }
        }
        return null;
    }

    @Override
    public void removesNote(Note note, List<Note> notes) {
        notes.remove(note);
    }
}
