package Java_Coding_Programming.Oop_Programming;

import java.util.Arrays;
import java.util.function.IntBinaryOperator;

    public class StreamAdditionWithLambda {

        public static void main(String[] args) {
            // Define two numbers
            int num1 = 10;
            int num2 = 20;

            // Use a lambda expression with IntBinaryOperator to add the numbers
            IntBinaryOperator add = (a, b) -> a + b;

            // Apply the lambda to the two numbers
            int sum = add.applyAsInt(num1, num2);

            // Print the result
            System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        }
    }


