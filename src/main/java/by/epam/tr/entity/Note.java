package by.epam.tr.entity;

import java.time.LocalDate;
import java.util.Objects;

public class Note {
    private String note;
    private LocalDate dateAddNote;

    public Note(String note, LocalDate dateAddNote) {
        this.note = note;
        this.dateAddNote = dateAddNote;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public LocalDate getDateAddNote() {
        return dateAddNote;
    }

    public void setDateAddNote(LocalDate dateAddNote) {
        this.dateAddNote = dateAddNote;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Note note1 = (Note) o;
        return Objects.equals(note, note1.note) && Objects.equals(dateAddNote, note1.dateAddNote);
    }

    @Override
    public int hashCode() {
        return Objects.hash(note, dateAddNote);
    }

    @Override
    public String toString() {
        return "Note{" +
                "note='" + note + '\'' +
                ", dateAddNote='" + dateAddNote + '\'' +
                '}';
    }

}
