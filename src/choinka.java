public class choinka {
    public static void main(String[] args) {
        int n = 7; //ilosc znaków w wierszu
        int i = 0; // indeksy wierszy

        //1. wyświetl n gwiazdek
        //2. wyświetl n-2 gwiazdek w kolejnym wierszu
        //3. wyświetl n-4 gwiazdki

        System.out.println();

        //czubek choinki
        if (n >= 7) {
            while (i < (n - 3)) {
                while (i < 3) {
                    System.out.print("  ");
                    i++;
                }
                System.out.print("* ");
                System.out.println();
                i++;
            }
        } else {
            System.out.println();
        }

        // trzeci rząd od dołu
        n = 7;
        i = 0;
        while (i < (n - 2)) {
            while (i < 2) {
                System.out.print("  ");
                i++;
            }
            System.out.print("* ");
            i++;
        }
        System.out.println();


        // drugi rząd od dołu
        n = 7;
        i = 0;
        while (i < (n - 1)) {
            while (i < 1) {
                System.out.print("  ");
                i++;
            }
            System.out.print("* ");
            i++;
        }
        System.out.println();

        //podstawa choinki
        n = 7;
        i = 0;
        while (i < n) {
            System.out.print("* ");
            i++;
        }
        System.out.println();
    }
}






