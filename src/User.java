//Crea una classe User che abbia i parametri privati nome ed età e i
//getter e setter
//All'interno di User ci sarà anche una funzione che stampi a video le informazioni
//di età e il nome.

public class User {
    private String nome;
    private Integer eta;

    public User(String nome, Integer eta) {
        this.eta = eta;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getEta() {
        return eta;
    }

    public void setEta(Integer eta) {
        this.eta = eta;
    }

    public User() {
        this.nome = "default";
        this.eta = null;
    }

    public void stampaInfo() {
        System.out.println("il nome é : " + this.nome + " e l'etá é di : " + this.eta);
    }

}
