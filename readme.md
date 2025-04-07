<table>
  <tr>
    <td>
      <img src="./docs/header.gif" alt="Mario Kart" width="200">
    </td>
    <td>
      <b>Objetivo:</b>
      <p>Mario Kart é uma série de jogos de corrida desenvolvida e publicada pela Nintendo. Nosso desafio será criar uma lógica de um jogo de vídeo game para simular corridas de Mario Kart, levando em consideração as regras e mecânicas abaixo.</p>
    </td>
  </tr>
</table>

<h2>Players</h2>
<table style="border-collapse: collapse; width: 800px; margin: 0 auto;">
  <tr>
    <td style="border: 1px solid black; text-align: center;">
      <p>Mario</p>
      <img src="./docs/mario.gif" alt="Mario Kart" width="60" height="60">
    </td>
    <td style="border: 1px solid black; text-align: center;">
      <p>Velocidade: 4</p>
      <p>Aceleração: 3</p>
      <p>Manobrabilidade: 3</p>
      <p>Poder: 2</p>
    </td>
    <td style="border: 1px solid black; text-align: center;">
      <p>Peach</p>
      <img src="./docs/peach.gif" alt="Mario Kart" width="60" height="60">
    </td>
    <td style="border: 1px solid black; text-align: center;">
      <p>Velocidade: 2</p>
      <p>Aceleração: 4</p>
      <p>Manobrabilidade: 3</p>
      <p>Poder: 3</p>
    </td>
    <td style="border: 1px solid black; text-align: center;">
      <p>Yoshi</p>
      <img src="./docs/yoshi.gif" alt="Mario Kart" width="60" height="60">
    </td>
    <td style="border: 1px solid black; text-align: center;">
      <p>Velocidade: 3</p>
      <p>Aceleração: 3</p>
      <p>Manobrabilidade: 2</p>
      <p>Poder: 4</p>
    </td>
  </tr>
  <tr>
    <td style="border: 1px solid black; text-align: center;">
      <p>Bowser</p>
      <img src="./docs/bowser.gif" alt="Mario Kart" width="60" height="60">
    </td>
    <td style="border: 1px solid black; text-align: center;">
      <p>Velocidade: 5</p>
      <p>Aceleração: 1</p>
      <p>Manobrabilidade: 4</p>
      <p>Poder: 2</p>
    </td>
    <td style="border: 1px solid black; text-align: center;">
      <p>Luigi</p>
      <img src="./docs/luigi.gif" alt="Mario Kart" width="60" height="60">
    </td>
    <td style="border: 1px solid black; text-align: center;">
      <p>Velocidade: 4</p>
      <p>Aceleração: 2</p>
      <p>Manobrabilidade: 3</p>
      <p>Poder: 3</p>
    </td>
    <td style="border: 1px solid black; text-align: center;">
      <p>Donkey Kong</p>
      <img src="./docs/dk.gif" alt="Mario Kart" width="60" height="60">
    </td>
    <td style="border: 1px solid black; text-align: center;">
      <p>Velocidade: 4</p>
      <p>Aceleração: 2</p>
      <p>Manobrabilidade: 4</p>
      <p>Poder: 2</p>
    </td>
  </tr>
  <tr>
    <td style="border: 1px solid black; text-align: center;">
      <p>Toad</p>
      <img src="./docs/toad.gif" alt="Mario Kart" width="60" height="60">
    </td>
    <td style="border: 1px solid black; text-align: center;">
      <p>Velocidade: 1</p>
      <p>Aceleração: 5</p>
      <p>Manobrabilidade: 2</p>
      <p>Poder: 4</p>
    </td>
  </tr>
</table>

<p></p>

<h3>🕹️ Regras & mecânicas:</h3>

<b>Jogadores:</b>

<input type="checkbox" id="jogadores-item" />
<label for="jogadores-item">O Computador deve receber dois personagens para disputar a corrida em um objeto cada</label>

<b>Pistas:</b>

<ul>
  <li><input type="checkbox" id="pistas-1-item" /> <label for="pistas-1-item">Os personagens irão correr em uma pista aleatória de 5 rodadas</label></li>
  <li><input type="checkbox" id="pistas-2-item" /> <label for="pistas-2-item">A cada rodada, será sorteado um bloco da pista que pode ser uma reta, curva ou confronto</label>
    <ul>
      <li><input type="checkbox" id="pistas-2-1-item" /> <label for="pistas-2-1-item">Caso o bloco da pista seja uma RETA, o jogador deve jogar um dado de 6 lados e somar os atributos VELOCIDADE e ACELERAÇÃO</label></li>
      <li><input type="checkbox" id="pistas-2-2-item" /> <label for="pistas-2-2-item">Caso o bloco da pista seja uma CURVA, o jogador deve jogar um dado de 6 lados e somar o atributo MANOBRABILIDADE</label></li>
      <li><input type="checkbox" id="pistas-2-3-item" /> <label for="pistas-2-3-item">Caso o bloco da pista seja um CONFRONTO, o jogador deve jogar um dado de 6 lados e somar o atributo PODER, quem perder, perde a quantidade de pontos que o adversário conseguiu gerar na rodada. Caso não tenha pontos o suficiente para perder, o derrotado recebe 0 pontos</label></li>
      <li><input type="checkbox" id="pistas-2-3-item" /> <label for="pistas-2-3-item">Nenhum jogador pode ter pontuação negativa (valores abaixo de 0)</label></li>
    </ul>
  </li>
</ul>

<b>Condição de vitória:</b>

<input type="checkbox" id="vitoria-item" />
<label for="vitoria-item">Ao final, vence quem acumulou mais pontos</label>

<h2>🔧 Implementação Java com Design Patterns</h2>

<h3>🎮 Estrutura do Projeto</h3>

<table style="border-collapse: collapse; width: 100%;">
  <tr style="background-color: #f2f2f2;">
    <th style="border: 1px solid #ddd; padding: 8px; text-align: left;">Classe</th>
    <th style="border: 1px solid #ddd; padding: 8px; text-align: left;">Função</th>
  </tr>
  <tr>
    <td style="border: 1px solid #ddd; padding: 8px;"><code>Characters.java</code></td>
    <td style="border: 1px solid #ddd; padding: 8px;">Modela os personagens com seus atributos e pontos</td>
  </tr>
  <tr>
    <td style="border: 1px solid #ddd; padding: 8px;"><code>CharacterFactory.java</code></td>
    <td style="border: 1px solid #ddd; padding: 8px;">Cria instâncias de personagens pré-configuradas</td>
  </tr>
  <tr>
    <td style="border: 1px solid #ddd; padding: 8px;"><code>CharacterSingleton.java</code></td>
    <td style="border: 1px solid #ddd; padding: 8px;">Gerencia o acesso global aos personagens</td>
  </tr>
  <tr>
    <td style="border: 1px solid #ddd; padding: 8px;"><code>MarioKart.java</code></td>
    <td style="border: 1px solid #ddd; padding: 8px;">Contém a lógica principal do jogo</td>
  </tr>
  <tr>
    <td style="border: 1px solid #ddd; padding: 8px;"><code>Main.java</code></td>
    <td style="border: 1px solid #ddd; padding: 8px;">Ponto de entrada do programa</td>
  </tr>
</table>

<h3>🛠️ Design Patterns Implementados</h3>

<ul>
  <li><b>Singleton:</b> Garante uma única instância do repositório de personagens</li>
  <li><b>Factory Method:</b> Centraliza a criação de objetos Characters</li>
</ul>

<h3>⚙️ Como Executar</h3>
<pre><code>javac Main.java
java Main</code></pre>
