// Создать проект калькулятора комплексных чисел (достаточно сделать сложение, умножение и деление).
// Применить при создании программы архитектурные паттерны, добавить логирование калькулятора.
// Соблюдать принципы SOLID, паттерны проектирования.

public class Main {
    public static void main(String[] args) {
        View view = new View();
        Controller controller = new Controller(view);
        controller.run();
    }
}