import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.programm.Task2;

import java.util.stream.Stream;

public class Task2Test {

    Task2 task2 = new Task2();

    @ParameterizedTest
    @MethodSource("sourceTestIsPowerOfTwo")
    public void testIsPowerOfTwo(int[] expected, int[] numbers){
        Assertions.assertArrayEquals(expected, task2.findDivider(numbers));
    }

    public static Stream<Arguments> sourceTestIsPowerOfTwo(){
        return Stream.of(
                Arguments.of(new int[]{2, 3, 6}, new int[]{42, 12, 18}),
                Arguments.of(new int[]{2, 5, 10, 25, 50}, new int[]{50, 100, 200}),
                Arguments.of(new int[]{11}, new int[]{33, 66, 11}),
                Arguments.of(new int[]{}, new int[]{})
        );
    }
}
