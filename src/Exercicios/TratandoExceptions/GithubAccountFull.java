package Exercicios.TratandoExceptions;

public class GithubAccountFull {
    private String name;
    private String company;
    private String login;
    private String id;

    public GithubAccountFull(GithubAccount meuGithubAccount) {
        this.company = meuGithubAccount.company();
        this.name = meuGithubAccount.name();
        this.id = meuGithubAccount.id();
        if (this.company == null){
            this.company = "Sem informações";
        } else this.company = meuGithubAccount.company();
        if (this.name == null){
            this.name = "Sem informações";
        } else this.name = meuGithubAccount.name();
        this.login = meuGithubAccount.login();
        if (this.id == null){
            this.id = "Sem informações";
        } else this.id = meuGithubAccount.id();
    }

    void print() {
        System.out.printf("USUARIO ENCONTRADO COM SUCESSO:"+
                          "%n=======  @%s  =======" +
                          "%nNome: %s" +
                          "%nCompania: %s" +
                          "%nId: %s" +
                          "%n===================",login, name, company, id);
    }

}
