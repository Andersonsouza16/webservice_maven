/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import entidades.EntidadePessoa;
import java.util.ArrayList;
import java.util.List;
import model.Pessoa;
import repository.PessoaRepository;

/**
 *
 * @author Anderson
 */
public class Teste {
    
    private static final  PessoaRepository repository = new PessoaRepository();
    
    public static void main(String[] args) {
        
        List<Pessoa> pessoas =  new ArrayList<Pessoa>();
 
		List<EntidadePessoa> listaEntityPessoas = repository.TodasPessoas();
 
		for (EntidadePessoa entity : listaEntityPessoas) {
 
			                 System.out.println("id " +entity.getId() + "nome "+entity.getNome()+"telefone "+entity.getTelefone());
		}
        
    }
    
}
