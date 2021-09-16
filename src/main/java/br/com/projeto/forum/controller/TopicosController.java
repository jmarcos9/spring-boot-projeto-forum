package br.com.projeto.forum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.forum.controller.dto.TopicoDto;
import br.com.projeto.forum.modelo.Curso;
import br.com.projeto.forum.modelo.Topico;

@RestController
public class TopicosController {

	@RequestMapping("/topicos")
	public List<TopicoDto> lista() {
		Topico topico = new Topico("Dúvida", "Dúvida Spring", new Curso("Spring", "Programação"));

		return TopicoDto.converter(Arrays.asList(topico, topico, topico));
	}

}

/*
 * echo "# spring-boot-project-forum" >> README.md git init git add README.md
 * git commit -m "first commit" git branch -M main git remote add origin
 * https://github.com/jmarcos9/spring-boot-project-forum.git git push -u origin
 * main
 */
