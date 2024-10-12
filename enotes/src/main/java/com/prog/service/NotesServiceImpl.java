package com.prog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prog.entity.Notes;
import com.prog.entity.User;
import com.prog.repository.NotesRepository;

@Service
public class NotesServiceImpl implements NotesService{

    @Autowired
    private NotesRepository notesRepository;

    @Override
    public Notes saveNotes(Notes notes) {
        return notesRepository.save(notes);
    }

    @Override
    public Notes getNotesById(long id) {
        return notesRepository.findById(id).get();
    }

    @Override
    public List<Notes> getNotesByUser(User user) {
        return notesRepository.findByUser(user);
    }

    @Override
    public Notes updateNotes(Notes notes) {
        return notesRepository.save(notes); 
    }

    @Override
    public boolean deleteNotes(long id) {
        Notes notes = notesRepository.findById(id).get();
        if (notes!=null) {
            notesRepository.delete(notes);
            return true;
        }  
        return false;  
    }

}
