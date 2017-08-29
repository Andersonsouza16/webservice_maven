package controller;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import entidades.EntidadePessoa;
import model.Pessoa;
import repository.PessoaRepository;

@Path("/service")
public class ServiceController {
	
	private final  PessoaRepository repository = new PessoaRepository();

	@GET
	@Produces("application/json; charset=UTF-8")
	@Path("/todasPessoas")
	public List<Pessoa> TodasPessoas(){       
            
 
		List<Pessoa> pessoas =  new ArrayList<Pessoa>();
 
		List<EntidadePessoa> listaEntityPessoas = repository.TodasPessoas();
 
		for (EntidadePessoa entity : listaEntityPessoas) {
 
			pessoas.add(new Pessoa(entity.getId(), entity.getNome(),entity.getTelefone()));
		}
                                
		return pessoas;
	}

}
