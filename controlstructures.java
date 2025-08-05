public class controlstructures {
    public static void main(String[] args) {
        int num = 3;

        if (num > 0)
            System.out.println("Positive");
        else
            System.out.println("Non-positive");

        switch (num) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Other");
        }

        for (int i = 1; i <= 3; i++)
            System.out.println("For: " + i);

        int j = 1;
        while (j <= 3) {
            System.out.println("While: " + j);
            j++;
        }

        int k = 1;
        do {
            System.out.println("Do-While: " + k);
            k++;
        } while (k <= 3);
    }
}