package hseaidbox.example.demo.service;

import hseaidbox.example.demo.model.Note;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface NoteService {

    List<Note> getAllNotes();

    List<Note> getAllUserNotes(Long authorId);

    List<Note> getAllNotesAboutPatient(Long patientId);

    Note getById(Long id);
}
