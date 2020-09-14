package hseaidbox.example.demo.service;

import hseaidbox.example.demo.model.Note;

import java.util.List;

public interface NoteService {

    List<Note> getAllNotes();

    List<Note> getAllUserNotes(Long authorId);

    List<Note> getAllNotesAboutPatient(Long patientId);

    Note getById(Long id);

    void saveNote(String description);
}
