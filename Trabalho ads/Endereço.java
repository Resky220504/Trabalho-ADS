
import java.util.Scanner;
public class Endereço {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Endereco endereco = new Endereco();
        

        System.out.print("Digite a rua: ");
        endereco.setRua(scanner.nextLine());

        System.out.print("Digite o número da casa: ");
        endereco.setNumCasa(scanner.nextInt());
        scanner.nextLine(); // Consumir a quebra de linha pendente

        System.out.print("Digite o bairro: ");
        endereco.setBairro(scanner.nextLine());

        System.out.print("Digite o CEP: ");
        endereco.setCep(scanner.nextLine());

        System.out.print("Digite o complemento: ");
        endereco.setComplemento(scanner.nextLine());

        System.out.print("Digite a cidade: ");
        endereco.setCidade(scanner.nextLine());

        System.out.print("Digite o UF: ");
        endereco.setUf(scanner.nextLine());

        endereco.registrarEndereco();

        Endereco enderecoObtido = endereco.getEndereco();
        System.out.println("Rua: " + enderecoObtido.rua);
        System.out.println("Número da Casa: " + enderecoObtido.numCasa);
        System.out.println("Bairro: " + enderecoObtido.bairro);
        System.out.println("CEP: " + enderecoObtido.cep);
        System.out.println("Complemento: " + enderecoObtido.complemento);
        System.out.println("Cidade: " + enderecoObtido.cidade);
        System.out.println("UF: " + enderecoObtido.uf);

        // Fechar o scanner
        scanner.close();
    }
}
