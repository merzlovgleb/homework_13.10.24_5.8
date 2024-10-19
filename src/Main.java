public class Main {
    public static void main(String[] args) {
                System.out.println("Фунты\tКилограммы");

                for (int pounds = 1; pounds <= 10; pounds++) {
                    double kilograms = pounds * 0.453; // 1 фунт = 0.453 кг
                    System.out.println(String.format("%d\t%.3f%n", pounds, kilograms));
                }
            }
        }


