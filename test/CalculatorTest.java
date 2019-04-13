import org.junit.Before;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    /* 쉼표(,) 또는 콜론(:)을 구분자로 가지는 문자열을 전달하는 경우 구분자를 기준으로 분리한 각 수자의 합을 반환한다.
            (예: ""=>0, "1,2,3"=>6 ,"1,2:3"=>6)
    앞의 기본 구분자(쉼표, 콜론) 외에 커스텀 구분자를 지정할 수 있다. 커스텀 구분자는 무자열 앞부분의"//"와"\n" 사이에 위치하는 문자를 커스텀 구분자로 사용한다.
            (예 "//;\n1;2;3" 경우 구분자는 세미콜론(;)이며 , 결과 값은 6이 반환되어야 한다.
    문자열 계산기에 음수를 전달하는 경우 RuntimeException으로 예외처리해야 한다.*/

    private Calculator calculator;

    @Before
    public void setup() {
        calculator = new Calculator();
    }

    @Test
    public void 요구사항1() {
        String arg = "";
        assertEquals(0, calculator.calcluate(arg));
    }

    @Test
    public void 요구사항2() {
        String arg = "1,2,3";
        assertEquals(6, calculator.calcluate(arg));
    }

    @Test
    public void 요구사항3() {
        String arg = "1,2:3";
        assertEquals(6, calculator.calcluate(arg));
    }

    @Test
    public void 요구사항4() {
        String arg = "//;\n1;2;3";
        assertEquals(6, calculator.calcluate(arg));

    }

}
