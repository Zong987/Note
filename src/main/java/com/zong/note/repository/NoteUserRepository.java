package com.zong.note.repository;

import org.springframework.data.repository.CrudRepository;

import com.zong.note.entity.NoteUser;

public interface NoteUserRepository extends CrudRepository<NoteUser, String>{
}