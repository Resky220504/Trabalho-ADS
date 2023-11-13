public class Endereco {
    String rua;
    int numCasa;
    String bairro;
    String cep;
    String complemento;
    String cidade;
    String uf;

    // Construtor
    public Endereco() {
    }

    // Métodos

    public void registrarEndereco() {
        // Lógica para registrar o endereço, se necessário
        // Você pode adicionar instruções específicas aqui
        System.out.println("Endereço registrado com sucesso!");
    }

    public Endereco getEndereco() {
        // Retorna o próprio objeto Endereco
        return this;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setNumCasa(int numCasa) {
        this.numCasa = numCasa;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
}
