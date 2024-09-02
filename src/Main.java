public class Main {
    public static void main(String[] args) {
        System.out.println("\nTask 1\n");
        {
            for (int i = 1; i < 11; i++)
                System.out.println(i);
        }

        System.out.println("\nTask 2\n");
        {
            for (int i = 10; i > 0; i--)
                System.out.println(i);
        }

        System.out.println("\nTask 3\n");
        {
            for (int i = 0; i < 17; i = i + 2)
                System.out.println(i);
        }

        System.out.println("\nTask 4\n");
        {
            for (int i = 10; i > -11; i--)
                System.out.println(i);
        }

        System.out.println("\nTask 5\n");
        {
            for (int i = 1904; i < 2097; i = i + 4)
                System.out.println(i + " является високосным");
        }

        System.out.println("\nTask 6\n");
        {
            for (int i = 7; i < 99; i = i + 7)
                System.out.printf("%d ", i);
            System.out.println();
        }

        System.out.println("\nTask 7\n");
        {
            for (int i = 1; i < 513; i = i * 2)
                System.out.printf("%d ", i);
            System.out.println();
        }

        System.out.println("\nTask 8\n");
        {
            int monthDeposit = 29_000;
            int total = 0;
            for (int i = 1; i < 13; i++) {
                total += monthDeposit;
                System.out.printf("Месяц %d, сумма накоплений равна %d рублей\n", i, total);
            }
        }

        System.out.println("\nTask 9\n");
        {
            int monthDeposit = 29_000;
            int total = 0;
            for (int i = 1; i < 13; i++) {
                total += total / 100;
                total += monthDeposit;
                System.out.printf("Месяц %d, сумма накоплений равна %d рублей\n", i, total);
            }
        }

        System.out.println("\nTask 10\n");
        {
            for (int i = 1; i < 11; i++)
                System.out.printf("2*%d=%d\n", i, 2 * i);
            System.out.println();
        }
    }
}