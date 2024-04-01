package br.edu.ifto.mapAssociacao.controller;

import br.edu.ifto.mapAssociacao.model.entity.Pessoa;
import br.edu.ifto.mapAssociacao.model.entity.Produto;
import br.edu.ifto.mapAssociacao.model.repository.PessoaRepository;
import br.edu.ifto.mapAssociacao.model.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Transactional
@Controller
@RequestMapping("pessoa")
public class PessoaController {
    @Autowired
    PessoaRepository pessoaRepository;

    /**
     * @param pessoa necessário devido utilizar no form.html o th:object que faz referência ao objeto esperado no controller.
     * @return
     */
    @GetMapping("/form")
    public String form(Pessoa pessoa, ModelMap model){
        model.addAttribute("pessoa", pessoa);
        return "/pessoa/form";
    }

    @GetMapping("/list")
    public ModelAndView listar(ModelMap model) {
        model.addAttribute("msg", "Lista de Pessoas");
        model.addAttribute("pessoas", pessoaRepository.pessoas());
        return new ModelAndView("/pessoa/list", model); //Aponta o caminho da view no projeto em /templates/pessoa.
    }
    @PostMapping("/save")
    public ModelAndView save(Pessoa pessoa) {
        pessoaRepository.save(pessoa);
        return new ModelAndView("redirect:/pessoa/list");
    }

    /**
     * @param id
     * @return
     * @PathVariable é utilizado quando o valor da variável é passada diretamente na URL.
     */
    @GetMapping("/remove/{id}")
    public ModelAndView remove(@PathVariable("id") Long id){
        pessoaRepository.remove(id);
        return new ModelAndView("redirect:/pessoa/list"); //Aponta o caminho da view no projeto em /templates/pessoa.
    }
    /**
     * @param id
     * @return
     * @PathVariable é utilizado quando o valor da variável é passada diretamente na URL
     */
    @GetMapping("/edit/{id}")
    public ModelAndView edit(@PathVariable("id") Long id, ModelMap model) {
        model.addAttribute("pessoa", pessoaRepository.pessoa(id));
        return new ModelAndView("/pessoa/form", model); // Aponta o caminho da view no projeto em /templates/pessoa).
    }

    @PostMapping("/update")
    public ModelAndView update(Pessoa pessoa) {
        pessoaRepository.update(pessoa);
        return new ModelAndView("redirect:/pessoa/list"); //Aponta o caminho da view no projeto em /templates/pessoa.
    }
}
