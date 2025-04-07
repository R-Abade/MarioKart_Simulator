import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CharacterSingleton personagens = CharacterSingleton.getInstance();

        // Mostra lista de personagens
        System.out.println("\n\uD83D\uDC64 Lista de personagens disponíveis:");
        personagens.getAllCharacters().values().forEach(System.out::println);

        // Seleciona jogadores
        Characters player1 = selectPlayer("Player ONE", scanner, personagens, null);
        Characters player2 = selectPlayer("Player TWO", scanner, personagens, player1.getName());

        // Inicia o jogo
        System.out.println("\n\uD83C\uDFC1\uD83D\uDEA8 Corrida entre " + player1.getName() + " e " + player2.getName() + " começando!\n");
        MarioKart game = new MarioKart();
        game.startGame(player1.getName(), player2.getName());
    }

    private static Characters selectPlayer(String playerLabel, Scanner scanner, CharacterSingleton cSingleton, String excludedCharacter) {
        while (true) {
            System.out.print("\n" + playerLabel + ", escolha seu personagem: ");
            String choice = scanner.nextLine().trim().toLowerCase();

            Characters selected = cSingleton.getCharacter(choice);

            if (selected == null) {
                System.out.println("Personagem inválido! Tente novamente.");
                continue;
            }

            if (selected.getName().equalsIgnoreCase(excludedCharacter)) {
                System.out.println("Este personagem já foi escolhido pelo outro jogador!");
                continue;
            }

            System.out.println(playerLabel + " escolheu: " + selected.getName());
            return selected;
        }
    }
}
git commit -m "Projeto + Design Patterns"