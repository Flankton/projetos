package william.apiwill.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import william.apiwill.Model.SenhaModel;
import william.apiwill.Model.UserModel;
import william.apiwill.Model.UsuarioModel;
import william.apiwill.Repository.UserRepository;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(path="api/user")
    public List findAll(){
        //System.out.println("----------------"+dateUtil.formaLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
        return (List) userRepository.findAll();
    }

    @PostMapping(path="api/user/salvar")
    public UserModel salvar(@RequestBody UserModel userModel, SenhaModel senhaModel){
        return userRepository.save(userModel);
    }

    @GetMapping(path="api/user/{id}")
    public ResponseEntity consultar(@PathVariable("id") Integer id){
        return userRepository.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping(path ={"api/user/{id}"})
    public ResponseEntity <?> delete(@PathVariable Integer id) {
        return userRepository.findById(id)
                .map(record -> {
                    userRepository.deleteById(id);
                    return ResponseEntity.ok().build();
                }).orElse(ResponseEntity.notFound().build());
    }

    @PutMapping(path="api/user/{id}")
    public ResponseEntity update(@PathVariable("id") Integer id,
                                 @RequestBody UserModel userModel) {
        return userRepository.findById(id)
                .map(record -> {
                    record.setNome(userModel.getNome());
                    record.setDataDeNascimento(userModel.getDataDeNascimento());
                    record.setSenhaModel(userModel.getSenhaModel());
                    UserModel updated = userRepository.save(record);
                    return ResponseEntity.ok().body(updated);
                }).orElse(ResponseEntity.notFound().build());
    }
}
