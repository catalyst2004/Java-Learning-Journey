public class SwitchCaseExample {

    public static void main(String[] args) {

        int num = 5;
        checkValue(num);

    }

    private static void checkValue(long num) {

        switch (num) {
            case 4 -> System.out.println("4");
            case 5 -> System.out.println("5");
            default -> throw new ClassCastException("can not accept");

        }

    }
}