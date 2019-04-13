public class Calculator {

    public int calcluate(String arg) {
        if (isBlank(arg)) {
            return 0;
        }
        SplitExpression expression = new SplitExpression(arg);
        return sum(expression.getResult());
    }


    private int sum(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result += num;
        }
        return result;
    }

    private boolean isBlank(String expr) {
        return "".equals(expr) || expr.isEmpty();
    }


}
