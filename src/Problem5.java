import java.util.ArrayList;
import java.util.List;

public class Problem5 {

    public static int calculate(List<String> exp) {
        if (exp == null || exp.size() == 0)
            throw new IllegalArgumentException("Illegal expression argument.");

        if (exp.size() == 1)
            return Integer.valueOf(exp.get(0));

        switch (exp.get(1)) {
            case "+":
                return Integer.valueOf(exp.get(0)) + calculate(exp.subList(2, exp.size()));
            case "-":
                return Integer.valueOf(exp.get(0)) - calculate(exp.subList(2, exp.size()));
            case "*":
                int value = Integer.valueOf(exp.get(0)) * Integer.valueOf(exp.get(2));
                if (exp.size() == 3)
                    return value;
                else {
                    List<String> subExp = exp.subList(3, exp.size());
                    subExp.add(0, "" + value);
                    return calculate(subExp);
                }
        }
        throw new IllegalArgumentException();
    }

    public static void main(String[] args) {
        List<String> exp = new ArrayList<>();
        exp.add("12");
        exp.add("+");
        exp.add("12");
        exp.add("+");
        exp.add("12");
        exp.add("+");
        exp.add("12");
        System.out.println(calculate(exp));
    }
}
