package hseaidbox.example.demo.service.impl;

import hseaidbox.example.demo.model.Note;
import hseaidbox.example.demo.repositories.NoteRepository;
import hseaidbox.example.demo.repositories.UserRepository;
import hseaidbox.example.demo.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collections;
import java.util.List;

public class NoteServiceImpl implements NoteService {

    @Autowired
    private NoteRepository noteRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<Note> getAllNotes() {
        return (List<Note>) noteRepository.findAll();
    }

    @Override
    public List<Note> getAllUserNotes(Long authorId) {
        if (userRepository.findById(authorId).isPresent()) {
            return noteRepository.findByAuthorId(authorId);
        } else {
            return Collections.emptyList();
        }
    }

    @Override
    public List<Note> getAllNotesAboutPatient(Long patientId) {
        if (userRepository.findById(patientId).isPresent()) {
            return noteRepository.findByPatientId(patientId);
        } else {
            return Collections.emptyList();
        }
    }

    @Override
    public Note getById(Long id) {
        return noteRepository.findById(id).orElse(null);
    }
}
