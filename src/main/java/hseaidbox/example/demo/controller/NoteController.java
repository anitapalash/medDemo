package hseaidbox.example.demo.controller;

import hseaidbox.example.demo.model.Note;
import hseaidbox.example.demo.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collections;
import java.util.List;

@Controller
public class NoteController {

    @Autowired
    private NoteService noteService;

    @RequestMapping("/")
    public String index(Model model) {
        getAllNotes(model);
        return "index";
    }

    private void getAllNotes(Model model) {
        List<Note> notes = noteService.getAllNotes();
        Collections.reverse(notes);
        model.addAttribute("notes", notes);
    }
}
