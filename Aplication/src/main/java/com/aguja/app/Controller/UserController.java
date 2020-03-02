package com.aguja.app.Controller;


<<<<<<< HEAD

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
=======
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
>>>>>>> f2151a192d015687934e6b58b253f03df2e006d8
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aguja.app.Entity.User;
import com.aguja.app.Repository.RoleRepository;
import com.aguja.app.Service.UserService;


import com.aguja.app.Entity.User;
import com.aguja.app.Repository.RoleRepository;
import com.aguja.app.Service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService userService;
	
	@Autowired
	RoleRepository roleRepository;
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@Autowired
	RoleRepository roleRepository;
	
	@Autowired 
	UserService userService;
	
	@GetMapping("/userForm")
<<<<<<< HEAD
	public String userForm(Model model) {
		model.addAttribute("userForm", new User());
		model.addAttribute("userList", userService.getAllUsers());
		model.addAttribute("roles",roleRepository.findAll());
		model.addAttribute("listTab","active");
=======
	public String getUserForm(Model model) {
		model.addAttribute("userForm", new User());//mapea los campos. crea new user y lo guarda en userForm
		model.addAttribute("userList", userService.getAllUsers());
		model.addAttribute("roles",roleRepository.findAll());//no uso servicio por ser sólo de lectura
		model.addAttribute("listTab","active"); //pestaña activa
>>>>>>> f2151a192d015687934e6b58b253f03df2e006d8
		return "user-form/user-view";
	}
	
	@PostMapping("/userForm")
	public String createUser(@Valid @ModelAttribute("userForm")User user, BindingResult result, ModelMap model) {
		if(result.hasErrors()) {
			model.addAttribute("userForm", user);//el objeto que recibimos lo devolvemos(el usuario no pierde lo que ingresó)
			model.addAttribute("formTab","active");
		}else { //si no hay errores crea el usuario
			try {
				userService.createUser(user);
				model.addAttribute("userForm", new User());
				model.addAttribute("listTab","active");
				
			} catch (Exception e) {
				model.addAttribute("formErrorMessage",e.getMessage());
				model.addAttribute("userForm", user);
				model.addAttribute("formTab","active");
				model.addAttribute("userList", userService.getAllUsers());
				model.addAttribute("roles",roleRepository.findAll());
			}
		}
		
		model.addAttribute("userList", userService.getAllUsers());
		model.addAttribute("roles",roleRepository.findAll());
		return "user-form/user-view";
	}
}