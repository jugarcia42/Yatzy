# Yatzy

## Description

Yatzy is a programming kata that consists of implementing the scoring system of the dice game Yatzy (similar to Yahtzee).

The goal is to receive a roll of 5 dice and calculate the score according to the selected category.

This exercise focuses on combination evaluation logic and the design of pure and reusable functions.

## Game Overview

In each turn, the player rolls 5 dice. Depending on the chosen category, the score is calculated differently.

## Categories

### Basic Rules

- **Ones, Twos, Threes, Fours, Fives, Sixes**
  - Sum of all dice matching the selected number.

### Combinations

- **Pair**: highest pair.
- **Two pairs**: sum of both pairs.
- **Three of a kind**: three dice with the same value.
- **Four of a kind**: four dice with the same value.

### Straights

- **Small straight**: 1-2-3-4-5 → 15 points.
- **Large straight**: 2-3-4-5-6 → 20 points.

### Special Combinations

- **Full house**: a three of a kind + a pair.
- **Yatzy**: five identical dice → 50 points.

### Chance

- **Chance**: total sum of all 5 dice without additional rules.

## Concepts Covered

- Java programming
- Complex conditional logic
- Array manipulation
- Frequency counting
- Functional design
- Refactoring
- Test Driven Development (TDD)

## Features

- Receive a roll of 5 dice.
- Evaluate the selected category.
- Calculate the corresponding score.
- Handle multiple scoring rules.
- Ensure system extensibility.

## Examples

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

## Objective

The goal of this kata is to practice:

- Pattern evaluation in collections
- Business rule design
- Separation of concerns
- Writing clean and testable code

## Author

Exercise completed as part of Cyber Dojo practice sessions using Java.
