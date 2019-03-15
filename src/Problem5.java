import java.lang.reflect.Array;
import java.util.Arrays;

public class Problem5 {

    int calculate(String[] expression) {
        if (expression == null || expression.length == 0)
            throw new IllegalArgumentException("Illegal expression argument.");

        if (expression.length == 1)
            return Integer.valueOf(expression[0]);

        switch (expression[1]) {
            case "+":
                return Integer.valueOf(expression[0]) + calculate(Arrays.copyOfRange(expression, 2, expression.length));
            case "-":
                return Integer.valueOf(expression[0]) - calculate(Arrays.copyOfRange(expression, 2, expression.length));
            case "*":
                int value = Integer.valueOf(expression[0]) * Integer.valueOf(expression[2])
                if (expression.length == 3)
                    return value;
                else
                    return calculate(
                            System.arraycopy(new String[]{"" + value}, expression)
                    );
        }
    }

    public static void main(String[] args) {

    }
}
