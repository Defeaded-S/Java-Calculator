import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String action;
        Double first;
        Double second;
        Double result;
        action = JOptionPane.showInputDialog(null, "Введите действие: +, -, /, *, ^, %", "Ввод данных", JOptionPane.INFORMATION_MESSAGE);
        if (action.equals("+")){
            first = Double.valueOf(JOptionPane.showInputDialog(null, "Введите первое число:", "Ввод данных", JOptionPane.INFORMATION_MESSAGE));
            second = Double.valueOf(JOptionPane.showInputDialog(null, "Введите второе число:", "Ввод данных", JOptionPane.INFORMATION_MESSAGE));
            result = first + second;
            JOptionPane.showMessageDialog(null, "Результат: " + result, "Вывод данных", JOptionPane.INFORMATION_MESSAGE);
        }
        else if (action.equals("-")){
            first = Double.valueOf(JOptionPane.showInputDialog(null, "Введите первое число:", "Ввод данных", JOptionPane.INFORMATION_MESSAGE));
            second = Double.valueOf(JOptionPane.showInputDialog(null, "Введите второе число:", "Ввод данных", JOptionPane.INFORMATION_MESSAGE));
            result = first - second;
            JOptionPane.showMessageDialog(null, "Результат: " + result, "Вывод данных", JOptionPane.INFORMATION_MESSAGE);
        }
        else if (action.equals("/")){
            first = Double.valueOf(JOptionPane.showInputDialog(null, "Введите делимое число:", "Ввод данных", JOptionPane.INFORMATION_MESSAGE));
            second = Double.valueOf(JOptionPane.showInputDialog(null, "Введите делитель числа:", "Ввод данных", JOptionPane.INFORMATION_MESSAGE));
            result = first / second;
            JOptionPane.showMessageDialog(null, "Результат: " + result, "Вывод данных", JOptionPane.INFORMATION_MESSAGE);
        }
        else if (action.equals("*")){
            first = Double.valueOf(JOptionPane.showInputDialog(null, "Введите первое число:", "Ввод данных", JOptionPane.INFORMATION_MESSAGE));
            second = Double.valueOf(JOptionPane.showInputDialog(null, "Введите второе число:", "Ввод данных", JOptionPane.INFORMATION_MESSAGE));
            result = first * second;
            JOptionPane.showMessageDialog(null, "Результат: " + result, "Вывод данных", JOptionPane.INFORMATION_MESSAGE);
        }
        else if (action.equals("^")){
            first = Double.valueOf(JOptionPane.showInputDialog(null, "Введите число:", "Ввод данных", JOptionPane.INFORMATION_MESSAGE));
            second = Double.valueOf(JOptionPane.showInputDialog(null, "Введите степень числа:", "Ввод данных", JOptionPane.INFORMATION_MESSAGE));
            result = Math.pow(first, second);
            JOptionPane.showMessageDialog(null, "Результат: " + result, "Вывод данных", JOptionPane.INFORMATION_MESSAGE);
        }
        else if (action.equals("%")){
            first = Double.valueOf(JOptionPane.showInputDialog(null, "Введите число:", "Ввод данных", JOptionPane.INFORMATION_MESSAGE));
            second = Double.valueOf(JOptionPane.showInputDialog(null, "Введите процент числа(1 = 100%):", "Ввод данных", JOptionPane.INFORMATION_MESSAGE));
            result = first * second;
            JOptionPane.showMessageDialog(null, "Результат: " + result, "Вывод данных", JOptionPane.INFORMATION_MESSAGE);
        }
        JOptionPane.action;
    }
}