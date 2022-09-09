package com.devmountain.noteApp.services;

import com.devmountain.noteApp.dtos.NoteDto;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public interface NoteService {
    //    adding a note
    @Transactional
    void addNote(NoteDto noteDto, Long userId);

    //    delete a note
    @Transactional
    void deleteNoteById(Long noteId);

    //    update note
    @Transactional
    void updateNoteById(NoteDto noteDto);

    //    find all notes by user
    List<NoteDto> getAllNotesByUserId(Long userId);

    //    get a note by note id
    Optional<NoteDto> getNoteById(Long noteId);
}
