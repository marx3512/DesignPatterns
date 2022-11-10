import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws NumberFormatException, IOException {
        int opcao;

        int choice = 0;
        do {
            System.out.print("========= Mobile Shop ============ \n");
            System.out.print("1. APPLE.              \n");
            System.out.print("2. SAMSUNG.              \n");
            System.out.print("3. XIAOMI.                 \n");
            System.out.print("4. Exit.                   \n");
            System.out.print("Enter your choice: ");

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            opcao = Integer.parseInt(br.readLine());
            Lojista lojista = new Lojista();

            switch (opcao) {
                case 1:
                    {
                        lojista.appleVenda();
                    }
                    break;
                case 2:
                    {
                        lojista.samsungVenda();
                    }
                    break;
                case 3:
                    {
                        lojista.xiaomiVenda();
                    }
                    break;
                default:
                    {
                        System.out.println("Opção inválida!");
                    }
                    return;
            }
        } while (choice != 4);
    }
}
