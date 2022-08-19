package ru.netology.javaqa.numbers.scr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource (files="src/test/resources/squares.csv")
    public void AnotherEquals(int a, int b, int expected) {
        SQRService program = new SQRService();
        int actual = program.sqrNum(a,b);

        Assertions.assertEquals(expected, actual);


    }

}
