# 🧠 Desafios de Lógica de Programação - Parte 2

Este repositório contém soluções em Java para desafios de lógica de programação. Este é um repositório complementar ao anterior, criado para manter a organização dos exercícios à medida que o volume aumenta.

Caso você queira ver a parte 1 -> https://github.com/DaniloTakeo/programming-logic-and-algorithms

## Índice
1. 🔢 Multiplicação de Matrizes
2. 🧩 Particionamento Palindrômico
3. 🚫 Remover Elementos Duplicados de uma Lista
4. 🔤 Verificar Anagramas
5. 🔢 Contar Substrings com Soma de Dígitos Igual a K
6. 🔀 Intercalar Listas Ordenadas
7. 🔢 Área do Maior Quadrado de 1s
8. 🔀 Rotacionar o Array à Direita
9. 🔍 Caminho Máximo em um Grafo

---
## 1. ✖ Multiplicação de Matrizes

### ✨ Problema:
Dadas duas matrizes `A` (de dimensão `m x n`) e `B` (de dimensão `n x p`), calcular a matriz resultante `C = A * B`, que terá dimensão `m x p`.

### 🔄 Entrada:
- Matriz `A` de tamanho `m x n`.
- Matriz `B` de tamanho `n x p`.

### 📀 Saída:
- Matriz `C` resultante da multiplicação `A * B` com tamanho `m x p`.

### 📜 Exemplo:
```bash
Entrada:
A = [ [1, 2],
      [3, 4] ]

B = [ [5, 6],
      [7, 8] ]

Saída:
[ [19, 22],
  [43, 50] ]
```

### ⚙️ Como Executar:
Para compilar e executar a solução em Java:
```bash
javac MatrixMultiplication.java
java MatrixMultiplication
```
---

## 2. 🧩 Particionamento Palindrômico

### ✨ Problema:
Dada uma string `s`, particione-a de forma que todas as substrings sejam palíndromos. Retorne o número mínimo de cortes necessários.

### 🔄 Entrada:
- Uma string `s`.

### 🔠 Saída:
- Um número inteiro representando o mínimo de cortes.

### 📝 Exemplo:
```bash
Entrada:
s = "aab"

Saída:
1  # ("aa" | "b")
```

### ⚙️ Como Executar:
```bash
javac PalindromicPartition.java
java PalindromicPartition
```

---

## 3. 🚫 Remover Elementos Duplicados de uma Lista

### 💡 Problema:
Dada uma lista de inteiros, remova os elementos duplicados mantendo a ordem original.

### 💻 Exemplo:
```bash
Entrada: [1, 3, 2, 1, 4, 3, 5]
Saída: [1, 3, 2, 4, 5]
```

### ▶️ Execução:
```bash
javac RemoverDuplicatas.java
java RemoverDuplicatas
```

---

## 4. 🔤 Verificar Anagramas

### ✨ Problema:
Verificar se duas strings são anagramas — ou seja, contêm exatamente os mesmos caracteres, com a mesma frequência, mas possivelmente em ordens diferentes.

### 🔄 Entrada:
- Duas strings.

### 🔠 Saída:
- `true` se forem anagramas.
- `false` caso contrário.

### 📝 Exemplo:
```bash
Entrada:
"listen", "silent"
Saída:
true

Entrada:
"hello", "world"
Saída:
false

Entrada:
"Dormitory", "Dirty room"
Saída:
true
```

### ⚙️ Como Executar:
```bash
javac AnagramCheck.java
java AnagramCheck
```

---

## 5. 🔢 Contar Substrings com Soma de Dígitos Igual a K

### Problema:
Contar quantas substrings em uma string de dígitos possuem soma dos seus dígitos igual a `k`.

### Entrada:
- Uma string `s` e um inteiro `k`.

### Saída:
- Quantidade de substrings com soma igual a `k`.

### Exemplo:
```bash
Entrada: s = "123123", k = 6
Saída: 4
```

---

## 6. 🔀 Intercalar Listas Ordenadas

### ✨ Problema:
Dadas duas listas ordenadas de inteiros, intercale-as em uma única lista ordenada.

### 🔄 Entrada:
- Duas listas ordenadas `list1` e `list2`.

### 🔠 Saída:
- Uma nova lista contendo todos os elementos de `list1` e `list2`, também ordenada.

### 📝 Exemplo:
```bash
Entrada:
list1 = [1, 3, 5]
list2 = [2, 4, 6]
Saída: [1, 2, 3, 4, 5, 6]
```

### ⚙️ Como Executar:
```bash
javac MergeSortedLists.java
java MergeSortedLists
```

---

## 7. 🔢Área do Maior Quadrado de 1s

### Descrição
Dada uma matriz binária (composta apenas por `0`s e `1`s), encontre a **área** do maior quadrado composto apenas por `1`s.

### Exemplo
```
Entrada:
[
  ['1','0','1','0','0'],
  ['1','0','1','1','1'],
  ['1','1','1','1','1'],
  ['1','0','0','1','0']
]

Saída: 4
```
---

## 8.🔀 Rotacionar o Array à Direita

Dado um array de inteiros e um número `k`, rotacione o array à direita `k` vezes.

### Exemplo:

```java
Entrada:
nums = [1, 2, 3, 4, 5, 6, 7], k = 3

Saída:
[5, 6, 7, 1, 2, 3, 4]
```

---

## 9. 🔍Caminho Máximo em um Grafo

### ✨ Problema:
Dado um grafo acíclico direcionado (DAG), encontre o caminho de maior comprimento entre dois vértices, considerando que as arestas podem ter pesos positivos.

### 🔄 Entrada:
- Uma lista de arestas com pesos representando o grafo.
- Um vértice de origem e um vértice de destino.

### 🔠 Saída:
- O comprimento do caminho mais longo do vértice de origem até o vértice de destino.

### 📝 Exemplo:
```bash
Entrada:
Arestas = [(0, 1, 5), (0, 2, 3), (1, 3, 6), (2, 3, 7)]
Origem = 0
Destino = 3

Saída:
12
```

---

## ✨ Tecnologias Utilizadas
- **Java** para implementação dos algoritmos.
- **Programação Dinâmica** para otimização das soluções.

### 💪 Contribuição
Sinta-se à vontade para contribuir com melhorias nas soluções ou adicionar novos desafios!

### 👨‍💻 Autor
Danilo Takeo Kanizawa



