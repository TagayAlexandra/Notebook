package by.epam.tr.use;

import by.epam.tr.entity.Note;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServiceNotebook {

    private final String fileName = "src/main/resources/notebook.txt";
    private final List<Note> notes = new ArrayList<>();

    public void writeNoteToFile(List<Note> notes) throws IOException {
        FileWriter fileWriter = new FileWriter(fileName);
        for (Note element : notes) {
            fileWriter.write(element.toString() + "\n");
        }
        fileWriter.close();

    }

    public List<Note> readNoteFromFile() throws IOException {
        FileReader reader = new FileReader(fileName);
        Scanner scanner = new Scanner(reader);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            createNotebook(line);
        }
        reader.close();
        return notes;
    }

    private LocalDate createDate(String[] inform) {
        String[] date = inform[3].split("-");
        int year = 0;
        int mounts = 1;
        int day = 2;
        return LocalDate.of(Integer.parseInt(date[year]), Integer.parseInt(date[mounts]), Integer.parseInt(date[day]));
    }

    private void createNotebook(String line) {
        int note = 1;
        String[] inform = line.split("'");
        LocalDate localDate = createDate(inform);
        notes.add(new Note(inform[note], localDate));
    }
}
