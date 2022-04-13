package by.epam.tr.configuration;

import by.epam.tr.entity.Note;
import by.epam.tr.entity.Notebook;
import by.epam.tr.port.UseNotebook;
import by.epam.tr.use.ServiceNotebook;
import by.epam.tr.use.UseNotebookImpl;
import by.epam.tr.view.View;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Configuration {

    private final Scanner scanner = new Scanner(System.in);
    private final UseNotebook useNotebook = new UseNotebookImpl();
    private List<Note> notes;
    private final ServiceNotebook serviceNotebook = new ServiceNotebook();
    private final View view = new View();


    public void start() throws IOException {
        view.println(view.START_MENU);
        int choice = Integer.parseInt(scanner.nextLine());
        Note result;
        switch (choice) {
            case 1: {
                view.println(view.INPUT_DATE);
                String note = scanner.nextLine();
                result = useNotebook.createNote(note);
                useNotebook.addNewNote(result, notes);
                serviceNotebook.writeNoteToFile(notes);
                start();
            }
            case 2: {
                view.println(view.INPUT_DATE);
                String date = scanner.nextLine();
                result = useNotebook.searchNoteByContent(date, notes);
                useNotebook.removesNote(result, notes);
                serviceNotebook.writeNoteToFile(notes);
                start();
            }
            case 3: {
                notes = serviceNotebook.readNoteFromFile();
                view.println(notes);
                start();
            }
            case 4: {
                notes = serviceNotebook.readNoteFromFile();
                view.println(view.INPUT_DATE_YEAR);
                int year = Integer.parseInt(scanner.nextLine());
                view.println(view.INPUT_DATE_MOUNTS);
                int mounts = Integer.parseInt(scanner.nextLine());
                view.println(view.INPUT_DATE_DAY);
                int day = Integer.parseInt(scanner.nextLine());
                LocalDate localDate = LocalDate.of(year, mounts, day);
                result = useNotebook.searchNoteByDate(localDate, notes);
                view.println(result);
                start();
            }
            case 5: {
                notes = serviceNotebook.readNoteFromFile();
                view.println(view.INPUT_DATE);
                String date = scanner.nextLine();
                result = useNotebook.searchNoteByContent(date, notes);
                view.println(result);
                start();
            }
            case 6: {
                break;
            }
            default: {
                start();
            }
        }
    }

}
