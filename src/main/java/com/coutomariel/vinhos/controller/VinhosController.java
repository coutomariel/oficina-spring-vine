package com.coutomariel.vinhos.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.coutomariel.vinhos.model.TipoVinho;
import com.coutomariel.vinhos.model.Vinho;
import com.coutomariel.vinhos.repository.Vinhos;

@Controller
public class VinhosController {

	@Autowired
	private Vinhos vinhos;
	
	@GetMapping("/vinhos/novo")
	public ModelAndView novo(Vinho vinho){
		ModelAndView mv = new ModelAndView("vinho/cadastro-vinho");
		mv.addObject("tipos", TipoVinho.values());
		return mv;
	}
	
	@PostMapping("/vinhos/novo")
	public ModelAndView salvar(@Valid Vinho vinho, BindingResult result, RedirectAttributes attributes){
		if(result.hasErrors()){
			return novo(vinho);
		}
		vinhos.save(vinho);
		attributes.addFlashAttribute("mensagem", "Vinho salvo com sucessso!");
		return new ModelAndView("redirect:/vinhos/novo");
	}
}
