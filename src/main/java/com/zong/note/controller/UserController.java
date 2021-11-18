package com.zong.note.controller;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.zong.note.entity.NoteUser;
import com.zong.note.repository.NoteUserRepository;
import com.zong.note.utils.EncodeUtil;

@Controller
@RequestMapping("/note/user")
public class UserController {

	@Autowired
	private NoteUserRepository ur;
	
	
	@RequestMapping(value = "/add", method = RequestMethod.GET, produces = "application/json")
	public void addUser() {
		NoteUser user = new NoteUser();
		user.setAccount("todd");
		user.setPassword(EncodeUtil.encode("0000"));
		user.setName("todd");
		user.setEmail("todd.3307699@gmail.com");
		Long datetime = System.currentTimeMillis();
		Timestamp timestamp = new Timestamp(datetime);
		user.setRegister_time(timestamp);
		ur.save(user);
	}
	
	@RequestMapping(value = "/modify", method = RequestMethod.GET, produces = "application/json")
	public void modifyUser() {
		NoteUser user = new NoteUser();
		user.setAccount("todd");
		user.setPassword(EncodeUtil.encode("0000"));
		user.setName("todd");
		user.setEmail("todd.3307699@gmail.com");
		Long datetime = System.currentTimeMillis();
		Timestamp timestamp = new Timestamp(datetime);
		user.setRegister_time(timestamp);
		ur.save(user);
	}
	
}
