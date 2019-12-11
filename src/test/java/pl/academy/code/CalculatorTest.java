package pl.academy.code;

import org.junit.*;

public class CalculatorTest {

    static Calculator calculator;

    public CalculatorTest() {
        System.out.println("Konstruktor");
    }

    @BeforeClass
    public static void createCalculator() {
        CalculatorTest.calculator = new Calculator();
        System.out.println("BeforeClass");
    }

    @Test
    public void addTest() {
        int a = 7;
        int b = 8;
        int expectedResult = 15;

        int result = calculator.add(a,b);

        Assert.assertEquals(expectedResult, result);
        Assert.assertEquals(1,1);
    }

    @Test
    public void divideTest() {
        int a = 10;
        int b = 3;
        double expectedResult = 3.3;

        double result = calculator.divide(a,b);

        Assert.assertEquals(expectedResult,result, 0.05);
    }

    @Test(expected = IllegalArgumentException.class)
    public void divideByZeroTest() {
        int a = 5;
        int b = 0;

        calculator.divide(a,b);
    }
}
