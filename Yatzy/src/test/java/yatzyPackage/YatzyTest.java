package yatzyPackage;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class YatzyTest {

    @Test
    @DisplayName("Should return 5 Chance")
    void shouldReturn5(){
        int [] roll = {1,1,1,1,1};

        ScoreInterface behavior = new ChanceBehavior();
        ScoreCategory chance = new ScoreCategory(behavior);

        int output = chance.score(roll);

        assertEquals(5, output);
    }

    @Test
    @DisplayName("Should return 10 Chance")
    void shouldReturn10(){
        int [] roll = {2,2,2,2,2};

        ScoreInterface behavior = new ChanceBehavior();
        ScoreCategory chance = new ScoreCategory(behavior);

        int output = chance.score(roll);

        assertEquals(10, output);
    }

    @Test
    @DisplayName("Should return 7 Chance")
    void shouldReturn7(){
        int [] roll = {1,2,1,2,1};

        ScoreInterface behavior = new ChanceBehavior();
        ScoreCategory chance = new ScoreCategory(behavior);

        int output = chance.score(roll);

        assertEquals(7, output);
    }
    @Test
    @DisplayName("Should return 50 Yatzy")
    void shouldReturn50(){
        int [] roll = {1,1,1,1,1};

        ScoreInterface behavior = new YatzyBehavior();
        ScoreCategory yatzy = new ScoreCategory(behavior);

        int output = yatzy.score(roll);

        assertEquals(50, output);
    }
    @Test
    @DisplayName("Should return 50 Yatzy")
    void shouldReturn50v2(){
        int [] roll = {2,2,2,2,2};

        ScoreInterface behavior = new YatzyBehavior();
        ScoreCategory yatzy = new ScoreCategory(behavior);

        int output = yatzy.score(roll);

        assertEquals(50, output);
    }
    @Test
    @DisplayName("Should return 0 Yatzy")
    void shouldReturn0(){
        int [] roll = {1,2,1,1,1};

        ScoreInterface behavior = new YatzyBehavior();
        ScoreCategory yatzy = new ScoreCategory(behavior);

        int output = yatzy.score(roll);

        assertEquals(0, output);
    }
    @Test
    @DisplayName("Should return 5 Ones")
    void shouldReturn5Ones(){
        int [] roll = {1,1,1,1,1};

        ScoreInterface behavior = new OnesBehavior();
        ScoreCategory ones = new ScoreCategory(behavior);

        int output = ones.score(roll);

        assertEquals(5, output);
    }
    @Test
    @DisplayName("Should return 2 Ones")
    void shouldReturn2(){
        int [] roll = {1,1,2,3,4};

        ScoreInterface behavior = new OnesBehavior();
        ScoreCategory ones = new ScoreCategory(behavior);

        int output = ones.score(roll);

        assertEquals(2, output);
    }
    @Test
    @DisplayName("Should return 0 Ones")
    void shouldReturn0Ones(){
        int [] roll = {2,5,2,3,4};

        ScoreInterface behavior = new OnesBehavior();
        ScoreCategory ones = new ScoreCategory(behavior);

        int output = ones.score(roll);

        assertEquals(0, output);
    }
    @Test
    @DisplayName("Should return 0 Twos")
    void shouldReturn0Twos(){
        int [] roll = {1,5,1,3,4};

        ScoreInterface behavior = new TwosBehavior();
        ScoreCategory twos = new ScoreCategory(behavior);

        int output = twos.score(roll);

        assertEquals(0, output);
    }
    @Test
    @DisplayName("Should return 4 Twos")
    void shouldReturn4Twos(){
        int [] roll = {2,5,2,3,4};

        ScoreInterface behavior = new TwosBehavior();
        ScoreCategory twos = new ScoreCategory(behavior);

        int output = twos.score(roll);

        assertEquals(4, output);
    }
    @Test
    @DisplayName("Should return 10 Twos")
    void shouldReturn12Twos(){
        int [] roll = {2,2,2,2,2};

        ScoreInterface behavior = new TwosBehavior();
        ScoreCategory twos = new ScoreCategory(behavior);

        int output = twos.score(roll);

        assertEquals(10, output);
    }
    @Test
    @DisplayName("Should return 0 Threes")
    void shouldReturn0Threes(){
        int [] roll = {2,2,2,2,2};

        ScoreInterface behavior = new ThreesBehavior();
        ScoreCategory threes = new ScoreCategory(behavior);

        int output = threes.score(roll);

        assertEquals(0, output);
    }
    @Test
    @DisplayName("Should return 6 Threes")
    void shouldReturn6Threes(){
        int [] roll = {2,3,2,3,2};

        ScoreInterface behavior = new ThreesBehavior();
        ScoreCategory threes = new ScoreCategory(behavior);

        int output = threes.score(roll);

        assertEquals(6, output);
    }
    @Test
    @DisplayName("Should return 15 Threes")
    void shouldReturn15Threes(){
        int [] roll = {3,3,3,3,3};

        ScoreInterface behavior = new ThreesBehavior();
        ScoreCategory threes = new ScoreCategory(behavior);

        int output = threes.score(roll);

        assertEquals(15, output);
    }
    @Test
    @DisplayName("Should return 0 Fours")
    void shouldReturn0Fours(){
        int [] roll = {3,3,3,3,3};

        ScoreInterface behavior = new FoursBehavior();
        ScoreCategory fours = new ScoreCategory(behavior);

        int output = fours.score(roll);

        assertEquals(0, output);
    }
    @Test
    @DisplayName("Should return 12 Fours")
    void shouldReturn12Fours(){
        int [] roll = {3,3,4,4,4};

        ScoreInterface behavior = new FoursBehavior();
        ScoreCategory fours = new ScoreCategory(behavior);

        int output = fours.score(roll);

        assertEquals(12, output);
    }
    @Test
    @DisplayName("Should return 20 Fours")
    void shouldReturn20Fours(){
        int [] roll = {4,4,4,4,4};

        ScoreInterface behavior = new FoursBehavior();
        ScoreCategory fours = new ScoreCategory(behavior);

        int output = fours.score(roll);

        assertEquals(20, output);
    }
    @Test
    @DisplayName("Should return 0 Fives")
    void shouldReturn0Fives(){
        int [] roll = {3,3,3,3,3};

        ScoreInterface behavior = new FivesBehavior();
        ScoreCategory fives = new ScoreCategory(behavior);

        int output = fives.score(roll);

        assertEquals(0, output);
    }
    @Test
    @DisplayName("Should return 15 Fives")
    void shouldReturn15Fives(){
        int [] roll = {5,3,5,3,5};

        ScoreInterface behavior = new FivesBehavior();
        ScoreCategory fives = new ScoreCategory(behavior);

        int output = fives.score(roll);

        assertEquals(15, output);
    }
    @Test
    @DisplayName("Should return 25 Fives")
    void shouldReturn25Fives(){
        int [] roll = {5,5,5,5,5};

        ScoreInterface behavior = new FivesBehavior();
        ScoreCategory fives = new ScoreCategory(behavior);

        int output = fives.score(roll);

        assertEquals(25, output);
    }
    @Test
    @DisplayName("Should return 0 Sixes")
    void shouldReturn0Sixes(){
        int [] roll = {3,3,3,3,3};

        ScoreInterface behavior = new SixesBehavior();
        ScoreCategory sixes = new ScoreCategory(behavior);

        int output = sixes.score(roll);

        assertEquals(0, output);
    }
    @Test
    @DisplayName("Should return 24 Sixes")
    void shouldReturn24Sixes(){
        int [] roll = {6,6,3,6,6};

        ScoreInterface behavior = new SixesBehavior();
        ScoreCategory sixes = new ScoreCategory(behavior);

        int output = sixes.score(roll);

        assertEquals(24, output);
    }
    @Test
    @DisplayName("Should return 30 Sixes")
    void shouldReturn30Sixes(){
        int [] roll = {6,6,6,6,6};

        ScoreInterface behavior = new SixesBehavior();
        ScoreCategory sixes = new ScoreCategory(behavior);

        int output = sixes.score(roll);

        assertEquals(30, output);
    }
    @Test
    @DisplayName("Should return 4 Pair")
    void shouldReturn4(){
        int [] roll = {2,5,2,3,4};

        ScoreInterface behavior = new PairBehavior();
        ScoreCategory pair = new ScoreCategory(behavior);

        int output = pair.score(roll);

        assertEquals(4, output);
    }
    @Test
    @DisplayName("Should return 12 Pair")
    void shouldReturn12(){
        int [] roll = {2,5,2,6,6};

        ScoreInterface behavior = new PairBehavior();
        ScoreCategory pair = new ScoreCategory(behavior);

        int output = pair.score(roll);

        assertEquals(12, output);
    }
    @Test
    @DisplayName("Should return 0 Pair")
    void shouldReturn0Pair(){
        int [] roll = {2,5,3,1,6};

        ScoreInterface behavior = new PairBehavior();
        ScoreCategory pair = new ScoreCategory(behavior);

        int output = pair.score(roll);

        assertEquals(0, output);
    }
    @Test
    @DisplayName("Should return 12 TwoPairs")
    void shouldReturn10TwoPairs(){
        int [] roll = {2,5,2,3,3};

        ScoreInterface behavior = new TwoPairsBehavior();
        ScoreCategory twoPairs = new ScoreCategory(behavior);

        int output = twoPairs.score(roll);

        assertEquals(10, output);
    }
    @Test
    @DisplayName("Should return 16 TwoPairs")
    void shouldReturn16TwoPairs(){
        int [] roll = {2,5,2,6,6};

        ScoreInterface behavior = new TwoPairsBehavior();
        ScoreCategory twoPairs = new ScoreCategory(behavior);

        int output = twoPairs.score(roll);

        assertEquals(16, output);
    }
    @Test
    @DisplayName("Should return 0 TwoPairs")
    void shouldReturn0TwoPairs(){
        int [] roll = {2,5,2,6,1};

        ScoreInterface behavior = new TwoPairsBehavior();
        ScoreCategory twoPairs = new ScoreCategory(behavior);

        int output = twoPairs.score(roll);

        assertEquals(0, output);
    }
    @Test
    @DisplayName("Should return 0 ThreeOfAKind")
    void shouldReturn0ThreeOfAKind(){
        int [] roll = {2,5,2,6,1};

        ScoreInterface behavior = new ThreeOfAKindBehavior();
        ScoreCategory threeOfAKind = new ScoreCategory(behavior);

        int output = threeOfAKind.score(roll);

        assertEquals(0, output);
    }
    @Test
    @DisplayName("Should return 9 ThreeOfAKind")
    void shouldReturn9ThreeOfAKind(){
        int [] roll = {2,5,3,3,3};

        ScoreInterface behavior = new ThreeOfAKindBehavior();
        ScoreCategory threeOfAKind = new ScoreCategory(behavior);

        int output = threeOfAKind.score(roll);

        assertEquals(9, output);
    }
    @Test
    @DisplayName("Should return 18 ThreeOfAKind")
    void shouldReturn18ThreeOfAKind(){
        int [] roll = {6,6,6,3,3};

        ScoreInterface behavior = new ThreeOfAKindBehavior();
        ScoreCategory threeOfAKind = new ScoreCategory(behavior);

        int output = threeOfAKind.score(roll);

        assertEquals(18, output);
    }
    @Test
    @DisplayName("Should return 0 FourOfAKind")
    void shouldReturn0FourOfAKind(){
        int [] roll = {6,6,6,3,3};

        ScoreInterface behavior = new FourOfAKindBehavior();
        ScoreCategory fourOfAKind = new ScoreCategory(behavior);

        int output = fourOfAKind.score(roll);

        assertEquals(0, output);
    }
    @Test
    @DisplayName("Should return 24 FourOfAKind")
    void shouldReturn24FourOfAKind(){
        int [] roll = {6,6,6,6,3};

        ScoreInterface behavior = new FourOfAKindBehavior();
        ScoreCategory fourOfAKind = new ScoreCategory(behavior);

        int output = fourOfAKind.score(roll);

        assertEquals(24, output);
    }
    @Test
    @DisplayName("Should return 4 FourOfAKind")
    void shouldReturn4FourOfAKind(){
        int [] roll = {1,1,6,1,1};

        ScoreInterface behavior = new FourOfAKindBehavior();
        ScoreCategory fourOfAKind = new ScoreCategory(behavior);

        int output = fourOfAKind.score(roll);

        assertEquals(4, output);
    }
    @Test
    @DisplayName("Should return 0 SmallStraight")
    void shouldReturn0SmallStraight(){
        int [] roll = {1,1,6,1,1};

        ScoreInterface behavior = new SmallStraightBehavior();
        ScoreCategory smallStraight = new ScoreCategory(behavior);

        int output = smallStraight.score(roll);

        assertEquals(0, output);
    }
    @Test
    @DisplayName("Should return 15 SmallStraight")
    void shouldReturn15SmallStraight(){
        int [] roll = {1,2,3,4,5};

        ScoreInterface behavior = new SmallStraightBehavior();
        ScoreCategory smallStraight = new ScoreCategory(behavior);

        int output = smallStraight.score(roll);

        assertEquals(15, output);
    }
    @Test
    @DisplayName("Should return 15 SmallStraight")
    void shouldReturn15SmallStraightv2(){
        int [] roll = {1,2,5,4,3};

        ScoreInterface behavior = new SmallStraightBehavior();
        ScoreCategory smallStraight = new ScoreCategory(behavior);

        int output = smallStraight.score(roll);

        assertEquals(15, output);
    }
    @Test
    @DisplayName("Should return 0 LargeStraight")
    void shouldReturn0LargeStraight(){
        int [] roll = {1,3,4,5,2};

        ScoreInterface behavior = new LargeStraightBehavior();
        ScoreCategory largeStraight = new ScoreCategory(behavior);

        int output = largeStraight.score(roll);

        assertEquals(0, output);
    }
    @Test
    @DisplayName("Should return 20 LargeStraight")
    void shouldReturn20LargeStraight(){
        int [] roll = {2,3,4,5,6};

        ScoreInterface behavior = new LargeStraightBehavior();
        ScoreCategory largeStraight = new ScoreCategory(behavior);

        int output = largeStraight.score(roll);

        assertEquals(20, output);
    }
    @Test
    @DisplayName("Should return 20 LargeStraight")
    void shouldReturn20LargeStraightv2(){
        int [] roll = {6,4,3,5,2};

        ScoreInterface behavior = new LargeStraightBehavior();
        ScoreCategory largeStraight = new ScoreCategory(behavior);

        int output = largeStraight.score(roll);

        assertEquals(20, output);
    }
    @Test
    @DisplayName("Should return 0 FullHouse")
    void shouldReturn0FullHouse(){
        int [] roll = {6,4,3,5,2};

        ScoreInterface behavior = new FullHouseBehavior();
        ScoreCategory fullHouse = new ScoreCategory(behavior);

        int output = fullHouse.score(roll);

        assertEquals(0, output);
    }
    @Test
    @DisplayName("Should return 0 FullHouse")
    void shouldReturn0FullHousev2(){
        int [] roll = {6,6,6,1,2};

        ScoreInterface behavior = new FullHouseBehavior();
        ScoreCategory fullHouse = new ScoreCategory(behavior);

        int output = fullHouse.score(roll);

        assertEquals(0, output);
    }
    @Test
    @DisplayName("Should return 7 FullHouse")
    void shouldReturn7FullHouse(){
        int [] roll = {1,1,1,2,2};

        ScoreInterface behavior = new FullHouseBehavior();
        ScoreCategory fullHouse = new ScoreCategory(behavior);

        int output = fullHouse.score(roll);

        assertEquals(7, output);
    }
}
