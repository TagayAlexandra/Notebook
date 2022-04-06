package by.epam.tr.entity;

import java.time.LocalDate;

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
    public String toString() {
        return "Note{" +
                "note='" + note + '\'' +
                ", dateAddNote='" + dateAddNote + '\'' +
                '}';
    }

}
