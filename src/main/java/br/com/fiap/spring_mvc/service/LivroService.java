package br.com.fiap.spring_mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.stereotype.Repository;

import java.util.List;

@Service
public class LivroService {

    public LivroService(LivroRepository livroRepository) {
    }

    @Autowired
    public Livro createLivro(Livro livro){
        return livroRepository.save(livro);

    }

    public Livro readLivro (Long Id){
        return livroRepository.findById(Id).orElse(null);
    }
    public List<Livro> readLivros(){
        return livroRepository.findAll();
    }
    public Livro updateLivro (Livro livro){
        returnt livroRepository.save(livro);
    }
    public void deleteLivro (Long Id){
        livroRepository.deleteById(Id);
    }
}
