package hseaidbox.example.demo.controller;

import hseaidbox.example.demo.model.Note;
import hseaidbox.example.demo.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collections;
import java.util.List;

@RestController
public class NoteController {

    @Autowired
    private NoteService noteService;

    @RequestMapping("/")
    public ModelAndView index(Model model) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("notes", getAllNotes());
        return modelAndView;
    }

    @PostMapping("/note")
    public ModelAndView saveNotes(@RequestParam String description,
                                  @RequestParam(required = false) String publish,
                                  Model model) {

        if (publish != null && publish.equals("Publish")) {
            saveNote(description, model);
            return index(model);
        }
        // After save fetch all notes again
        return index(model);
    }

    private List<Note> getAllNotes() {
        List<Note> notes = noteService.getAllNotes();
        Collections.reverse(notes);
        return notes;
    }

    private void saveNote(String description, Model model) {
        if (description != null && !description.trim().isEmpty()) {
            noteService.saveNote(description.trim());
            //After publish you need to clean up the textarea
            model.addAttribute("description", "");
        }
    }
}
