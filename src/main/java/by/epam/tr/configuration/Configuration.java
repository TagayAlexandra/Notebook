package by.epam.tr.configuration;

import by.epam.tr.entity.Note;
import by.epam.tr.entity.Notebook;
import by.epam.tr.port.UseNotebook;
import by.epam.tr.use.UseNotebookImpl;
import by.epam.tr.view.View;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Configuration {

    private final Scanner scanner = new Scanner(System.in);
    private final UseNotebook useNotebook = new UseNotebookImpl();
    private final Notebook notebook = new Notebook();
    private final ArrayList<Note> notes = notebook.getNotes();


    public void start() {
        View.println(View.START_MENU);
        int choice = Integer.parseInt(scanner.nextLine());
        Note result;
        switch (choice) {
            case 1 -> {
                View.println(View.INPUT_DATE);
                String note = scanner.nextLine();
                result = useNotebook.createNote(note);
                useNotebook.addNewNote(result, notes);
                start();
            }
            case 2 -> {
                View.println(View.INPUT_DATE);
                String date = scanner.nextLine();
                result = useNotebook.searchNoteByContent(date, notes);
                useNotebook.removesNote(result, notes);
                start();
            }
            case 3 -> {
                View.println(notes);
                start();
            }
            case 4 -> {
                View.println(View.INPUT_DATE_YEAR);
                int year = Integer.parseInt(scanner.nextLine());
                View.println(View.INPUT_DATE_MOUNTS);
                int mounts = Integer.parseInt(scanner.nextLine());
                View.println(View.INPUT_DATE_DAY);
                int day = Integer.parseInt(scanner.nextLine());
                LocalDate localDate = LocalDate.of(year, mounts, day);
                result = useNotebook.searchNoteByDate(localDate, notes);
                View.println(result);
                start();
            }
            case 5 -> {
                View.println(View.INPUT_DATE);
                String date = scanner.nextLine();
                result = useNotebook.searchNoteByContent(date, notes);
                View.println(result);
                start();
            }
            case 6 -> {
            }
            default -> {
                start();
            }
        }
    }

}
