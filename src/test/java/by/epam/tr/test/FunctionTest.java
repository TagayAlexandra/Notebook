package by.epam.tr.test;

import by.epam.tr.entity.Note;
import by.epam.tr.port.UseNotebook;
import by.epam.tr.use.UseNotebookImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.time.LocalDate;
import java.util.ArrayList;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class FunctionTest {
    private final UseNotebook useNotebook = new UseNotebookImpl();
    private final ArrayList<Note> notes = new ArrayList<>();
    private Note note;
    private Note note1;

    @BeforeAll
    public void setUp() {
        note = useNotebook.createNote("Hello");
        note1 = useNotebook.createNote("Bye");
    }

    @Test
    public void verifyCreateNote() {
        Note note = useNotebook.createNote("Note");
        Assertions.assertNotNull(note, "Type must not be null");
    }


    @Test
    public void verifyAddNoteToNotebook() {
        useNotebook.addNewNote(note, notes);
        useNotebook.addNewNote(note1, notes);
        int actual = notes.size();
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }


}
