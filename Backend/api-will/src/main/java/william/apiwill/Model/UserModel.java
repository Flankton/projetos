package william.apiwill.Model;


import javax.persistence.*;
import java.util.Date;

@Entity(name="Pessoa")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer id;

    @Column(nullable = false, length = 50)
    public String nome;

    @JoinColumn(name="idSenha")
    @OneToOne()
    private SenhaModel senhaModel;

    @Temporal(TemporalType.DATE)
    public Date dataDeNascimento;

    //gets sett
    public SenhaModel getSenhaModel() {
        return senhaModel;
    }

    public void setSenhaModel(SenhaModel senhaModel) {
        this.senhaModel = senhaModel;
    }





    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
}
