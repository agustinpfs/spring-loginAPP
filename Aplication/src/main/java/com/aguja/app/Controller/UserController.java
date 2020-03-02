package com.aguja.app.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.aguja.app.Entity.User;
import com.aguja.app.Repository.RoleRepository;
import com.aguja.app.Service.UserService;

@Controller
public class UserController {

	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@Autowired
	RoleRepository roleRepository;
	
	@Autowired 
	UserService userService;
	
	@GetMapping("/userForm")
	public String getUserForm(Model model) {
		model.addAttribute("userForm", new User());//mapea los campos. crea new user y lo guarda en userForm
		model.addAttribute("userList", userService.getAllUsers());
		model.addAttribute("roles",roleRepository.findAll());//no uso servicio por ser sólo de lectura
		model.addAttribute("listTab","active"); //pestaña activa
		return "user-form/user-view";
	}	
}