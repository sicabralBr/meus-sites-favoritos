import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("------- MEUS SITES FAVORITOS -------");

        Scanner scanner = new Scanner(System.in);
        List<Website> meusWebsites = new ArrayList<>();

        String sair = "n";

        do {
            System.out.println("Informar o nome do site: ");
            String nome_site = scanner.nextLine();
            System.out.println("Informar a url do site: ");
            String url_site = scanner.nextLine();

            Website website = new Website();
            website.setNome_site(nome_site);
            website.setUrl_site(url_site);

            meusWebsites.add(website);

            System.out.println("Deseja sair? ");
            sair = scanner.nextLine();
        } while (!sair.equals("s"));

        for(Website meusSites: meusWebsites){
            System.out.println(meusSites.getNome_site() + ": " + meusSites.getUrl_site());
            System.out.println("________________________________________________");
        }
    }
}