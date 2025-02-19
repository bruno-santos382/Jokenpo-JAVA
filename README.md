# Jokenpo (Pedra, Papel, Tesoura, Lagarto, Spock)

Este é um jogo simples de **Jokenpo** (Pedra, Papel, Tesoura, Lagarto, Spock) implementado em Java. O jogo permite que o usuário jogue contra o computador, onde tanto o jogador quanto o computador escolhem uma das seguintes opções:

- Pedra
- Papel
- Tesoura
- Lagarto
- Spock

O jogo então determina o vencedor com base nas regras do jogo e exibe o resultado.

---

## Como Jogar

1. **Execute o programa**.
2. O jogo irá exibir um menu solicitando que você selecione uma das seguintes opções:
   - 1. Pedra
   - 2. Papel
   - 3. Tesoura
   - 4. Lagarto
   - 5. Spock
3. **Digite o número correspondente à sua escolha** e pressione Enter.
4. O programa gerará aleatoriamente a escolha do computador.
5. O programa então exibirá tanto a escolha do jogador quanto a escolha do computador, e anunciará o vencedor com base nas regras:

### Regras do Jogo:
- Pedra (Rock) **esmaga** Tesoura (Scissors).
- Tesoura (Scissors) **corta** Papel (Paper).
- Papel (Paper) **cobre** Pedra (Rock).
- Pedra (Rock) **esmaga** Lagarto (Lizard).
- Lagarto (Lizard) **envenena** Spock.
- Spock **vaporiza** Pedra (Rock).
- Tesoura (Scissors) **decapita** Lagarto (Lizard).
- Papel (Paper) **refuta** Spock.
- Lagarto (Lizard) **come** Papel (Paper).
- Spock **esmaga** Tesoura (Scissors).

---

## Exemplo de Execução

```java
*************************
******** JOKENPO ********
*************************
Selecione uma opção para jogar:
1. Pedra
2. Papel 
3. Tesoura
4. Lagarto
5. Spock
-------------------------
Digite o número correspondente à sua escolha:
*************************
