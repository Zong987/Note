package com.zong.note.repository;

import org.springframework.data.repository.CrudRepository;

import com.zong.note.entity.Note;

public interface NoteRepository extends CrudRepository<Note, Long> {

}
