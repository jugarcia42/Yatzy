# Yatzy

## Descripción

Yatzy es un kata de programación que consiste en implementar el sistema de puntuación del juego de dados Yatzy (similar a Yahtzee).

El objetivo es recibir una tirada de 5 dados y calcular la puntuación según la categoría seleccionada.

Este ejercicio se centra en la lógica de evaluación de combinaciones y el diseño de funciones puras y reutilizables.

## Funcionamiento del juego

En cada turno, el jugador lanza 5 dados. Dependiendo de la categoría elegida, la puntuación se calcula de forma diferente.

## Categorías

### Reglas básicas

- **Ones, Twos, Threes, Fours, Fives, Sixes**
  - Suma de los dados que coincidan con el número indicado.

### Combinaciones

- **Pair (Pareja)**: la pareja más alta.
- **Two pairs (Doble pareja)**: suma de las dos parejas.
- **Three of a kind (Trío)**: tres dados iguales.
- **Four of a kind (Póker)**: cuatro dados iguales.

### Escaleras

- **Small straight**: 1-2-3-4-5 → 15 puntos.
- **Large straight**: 2-3-4-5-6 → 20 puntos.

### Combinaciones especiales

- **Full house**: un trío + una pareja.
- **Yatzy**: cinco dados iguales → 50 puntos.

### Chance

- **Chance**: suma total de los 5 dados sin reglas adicionales.

## Conceptos trabajados

- Programación en Java
- Lógica condicional compleja
- Manipulación de arrays
- Conteo de frecuencias
- Diseño funcional
- Refactorización
- Test Driven Development (TDD)

## Funcionalidades

- Recibir una tirada de 5 dados.
- Evaluar la categoría seleccionada.
- Calcular la puntuación correspondiente.
- Manejar múltiples reglas de scoring.
- Garantizar extensibilidad del sistema.

## Ejemplos

### Yatzy

```text
6 6 6 6 6 → 50
```

### Full house

```text
2 2 3 3 3 → 13
```

### Large straight

```text
2 3 4 5 6 → 20
```

### Chance

```text
1 2 3 4 5 → 15
```

## Objetivo

El objetivo del kata es practicar:

- Evaluación de patrones en colecciones
- Diseño de reglas de negocio
- Separación de responsabilidades
- Escritura de código limpio y testeable

## Autor

Ejercicio realizado como parte de las prácticas de Cyber Dojo utilizando Java.
