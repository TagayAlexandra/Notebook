package by.epam.tr.entity;

import java.util.ArrayList;

public class Notebook {
    private ArrayList<Note> notes = new ArrayList<>();

    public ArrayList<Note> getNotes() {
        return notes;
    }

    public void setNotes(ArrayList<Note> notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "StoreDate{" +
                "notes=" + notes +
                '}';
    }
}
