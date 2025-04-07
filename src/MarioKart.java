import java.lang.*;

public class MarioKart {

    private int rollDice(){
        return ((int)Math.floor(Math.random() * 6) + 1);
    }

    public String threeGameOption(){
        double random = Math.random();
        String gameOption;

        if(random < 0.33){
            gameOption = "RETA";
        }
        else if(random < 0.66){
            gameOption = "CURVA";
        }
        else{
            gameOption = "CONFRONTO";
        }
        return gameOption;
    }

     private void logRollResult(String name, String attribute, int diceNumber, int attributeValue){
        int total = diceNumber + attributeValue;
         System.out.printf("%s 🎲 rolou um dado de %s: %d + %d = %d%n",
                 name, attribute, diceNumber, attributeValue, total);
     }

    private void raceEngine(String player1, String player2) {
        Characters playerONE = CharacterSingleton.getInstance().getCharacter(player1);
        Characters playerTWO = CharacterSingleton.getInstance().getCharacter(player2);

        int round = 1;
        while(round <= 5) {
            System.out.println("\uD83C\uDFC1 Rodada "+round);
            String throwDiceGame = threeGameOption();
            System.out.println("A batalha será do tipo: "+throwDiceGame);

            switch (throwDiceGame) {
                case "RETA":
                    // Player 1
                    int diceSpeed1 = rollDice();
                    logRollResult(player1, "velocidade", diceSpeed1, playerONE.getSpeed());
                    int diceXlr81 = rollDice();
                    logRollResult(player1, "aceleração", diceXlr81, playerONE.getAcceleration());
                    int sumPoints1 = diceSpeed1 + playerONE.getSpeed() + diceXlr81 + playerONE.getAcceleration();
                    System.out.printf("Total %s (Speed + Accel): %d%n", player1, sumPoints1);

                    // Player 2
                    int diceSpeed2 = rollDice();
                    logRollResult(player2, "velocidade", diceSpeed2, playerTWO.getSpeed());
                    int diceXlr82 = rollDice();
                    logRollResult(player2, "aceleração", diceXlr82, playerTWO.getAcceleration());
                    int sumPoints2 = diceSpeed2 + playerTWO.getSpeed() + diceXlr82 + playerTWO.getAcceleration();
                    System.out.printf("Total %s (Speed + Accel): %d%n", player2, sumPoints2);

                    // Resultado
                    if (sumPoints1 > sumPoints2) {
                        System.out.println(playerONE.getName() + " venceu a corrida em reta!");
                        playerONE.addPoints(sumPoints1);
                    } else if (sumPoints2 > sumPoints1) {
                        System.out.println(playerTWO.getName() + " venceu a corrida em reta!");
                        playerTWO.addPoints(sumPoints2);
                    } else {
                        System.out.println("Empate na reta, adversários emparelhados!");
                    }
                    break;

                case "CURVA":
                    // Player 1
                    int diceHandling1 = rollDice();
                    logRollResult(player1, "manobrabilidade", diceHandling1, playerONE.getHandling());
                    int handlingResult1 = diceHandling1 + playerONE.getHandling();

                    // Player 2
                    int diceHandling2 = rollDice();
                    logRollResult(player2, "manobrabilidade", diceHandling2, playerTWO.getHandling());
                    int handlingResult2 = diceHandling2 + playerTWO.getHandling();

                    // Resultado
                    if (handlingResult1 > handlingResult2) {
                        System.out.println(playerONE.getName() + " dominou a curva!");
                        playerONE.addPoints(handlingResult1);
                    } else if (handlingResult2 > handlingResult1) {
                        System.out.println(playerTWO.getName() + " dominou a curva!");
                        playerTWO.addPoints(handlingResult2);
                    } else {
                        System.out.println("Empate na curva! Ambos mantiveram o controle.");
                    }
                    break;

                default: // CONFRONTO
                    System.out.println(playerONE + " confrontou " + playerTWO + " \uD83E\uDD4A!");

                    // Player 1
                    int dicePower1 = rollDice();
                    logRollResult(player1, "poder", dicePower1, playerONE.getPower());
                    int powerResult1 = dicePower1 + playerONE.getPower();

                    // Player 2
                    int dicePower2 = rollDice();
                    logRollResult(player2, "poder", dicePower2, playerTWO.getPower());
                    int powerResult2 = dicePower2 + playerTWO.getPower();

                    // Resultado
                    if (powerResult1 > powerResult2) {
                        System.out.println(playerONE.getName() + " venceu o confronto!");
                        if(playerTWO.getPoints() < powerResult1){
                            playerTWO.addPoints(0);
                        }
                        else{
                            playerTWO.addPoints(-powerResult1);
                        }

                    } else if (powerResult2 > powerResult1) {
                        System.out.println(playerTWO.getName() + " venceu o confronto!");
                        if(playerONE.getPoints() < powerResult2){
                            playerONE.addPoints(0);
                        }
                        else{
                            playerONE.addPoints(-powerResult2);
                        }

                    } else {
                        System.out.println("Confronto equilibrado, chumbo trocado não dói!");
                    }
            }
            round++;
            System.out.println("-------------------------------------------------------------");
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                continue;
            }
        }

        // Resultado final
        if(playerONE.getPoints() > playerTWO.getPoints()) {
            System.out.println(playerONE.getName() + " venceu a corrida com " + playerONE.getPoints() + " pontos! Parabéns! \uD83C\uDFC6");
        } else if(playerTWO.getPoints() > playerONE.getPoints()) {
            System.out.println(playerTWO.getName() + " venceu a corrida com " + playerTWO.getPoints() + " pontos! Parabéns! \uD83C\uDFC6");
        } else {
            System.out.println("A corrida terminou em empate com " + playerONE.getPoints() + " pontos cada!");
        }

        playerONE.zerarPoints();
        playerTWO.zerarPoints();
    }
     public void startGame(String player1, String player2){
        raceEngine(player1, player2);
     }
}
