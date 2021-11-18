package com.zong.note.repository;

import org.springframework.data.repository.CrudRepository;

import com.zong.note.entity.NoteHistory;

public interface NoteHistoryRepository extends CrudRepository<NoteHistory, Long> {

}
