import com.teste.restapi.database.RepositorioContato;

import org.springframework.beans.factory.annotation.Autowired;

public class ContatoRest {
    @Autowired
    private RepositorioContato repositorio;

    public List<Contato>Listar(){
        return repositorio.findAll();
    }

    public void salvar(Contato contato){
        repositorio.save(contato);
    }
    public void alterar(Contato contato){
        if(contato.getId()>0)
        repositorio.save(contato);
    }

    public void excluir(Contato contato){
        repositorio.delete(contato);

    }
    
}
