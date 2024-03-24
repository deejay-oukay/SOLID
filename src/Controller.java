public class Controller {
    private final View view;

    public Controller(View view) {
        this.view = view;
    }

    public void run() {
        double firstReal = view.getReal(1);
        double firstImaginary = view.getImaginary(1);
        double secondReal = view.getReal(2);
        double secondImaginary = view.getImaginary(2);

        Number first = new Number(firstReal, firstImaginary);
        Number second = new Number(secondReal, secondImaginary);

        Interface logger = new Decorator(first);
        int choice = view.selectAction();

        if (choice == 1)
            view.showResult(logger.addition(second).toString());
        else if (choice == 2)
            view.showResult(logger.multiplication(second).toString());
        else if (choice == 3)
            view.showResult(logger.division(second).toString());
        else
            view.showResult("Недопустимая операция...");
        view.closeScanner();
    }
}
