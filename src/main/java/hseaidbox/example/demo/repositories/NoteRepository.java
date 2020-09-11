package hseaidbox.example.demo.repositories;

import hseaidbox.example.demo.model.Note;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface NoteRepository extends CrudRepository<Note, Long> {
    Optional<Note> findById(Long id);

    @Query(nativeQuery = true, value = "SELECT * FROM note WHERE author_id = ?1")
    List<Note> findByAuthorId(Long authorId);
    
    @Query(nativeQuery = true, value = "SELECT * FROM note WHERE patient_id = ?1")
    List<Note> findByPatientId(Long patientId);
}
