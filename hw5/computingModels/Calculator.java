package computingModels;

import java.util.Stack;

// Класс реализует рассчет математических выражений с помощью стека.
// Метод принимает экземпляр класса String- выражение в постфиксной форме записии. Пример: 10 20 + 5 /
// Метод возвращает результат вычисления- экземпляр класса String. Пример: 6

public class Calculator {

    public static String calculation(String example) {

        String[] exp = example.split(" ");
        Stack<Integer> st = new Stack<>();
        int res = 0;

        for (int i = 0; i < exp.length; i++) {
            if (isDigit(exp[i])) {
                st.push(Integer.parseInt(exp[i]));
            } else {
                switch (exp[i]) {
                    case "+":
                        res = st.pop() + st.pop();
                        st.push(res);
                        break;
                    case "-":
                        res = -st.pop() + st.pop();
                        st.push(res);
                        break;
                    case "*":
                        res = st.pop() * st.pop();
                        st.push(res);
                        break;
                    case "/":
                        int num = st.pop();
                        res = st.pop() / num;
                        st.push(res);
                        break;
                    default:
                        break;
                }
            }
        }
        return st.pop().toString();
    }

    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
