package com.zong.note.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zong.note.repository.NoteRepository;
import com.zong.note.repository.NoteUserRepository;

@Controller
@RequestMapping("/note")
public class NoteController {
	
	@Autowired
	private NoteRepository nr;
	
	@Autowired
	private NoteUserRepository nur; 
}
