import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SplitExpression {
    private final static String customRegex = "//(.)\n(.*)";
    private final static String normalRegex = ",|:";

    String expr;
    int[] result;

    public SplitExpression(String expr) {
        this.expr = expr;
        toInt(split());
    }

    private String[] split() {
        Matcher matcher = Pattern.compile(customRegex).matcher(expr);
        if (matcher.find()) {
            return matcher.group(2).split(matcher.group(1));
        }
        return expr.split(normalRegex);
    }

    private void toInt(String[] nums) {
        result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = Integer.parseInt(nums[i]);
        }
    }

    public int[] getResult() {
        return result;
    }
}
