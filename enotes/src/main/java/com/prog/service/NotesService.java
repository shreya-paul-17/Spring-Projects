package com.prog.service;

import java.util.List;

import com.prog.entity.Notes;
import com.prog.entity.User;

public interface NotesService {

    public Notes saveNotes(Notes notes);

    public Notes getNotesById(long id);

    public List<Notes> getNotesByUser(User user);

    public Notes updateNotes(Notes notes);

    public boolean deleteNotes(long id);
}
