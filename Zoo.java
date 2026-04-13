import java.util.Scanner;
public class Zoo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        Animals[] zoo = new Animals[5];
        zoo[0] = new Lion("Simba", 5, 190.5);
        zoo[1] = new Eagle("Eddy", 3, 5.2);
        zoo[2] = new Dolphin("Flipper", 8, 120.0);
        zoo[3] = new Lion("Nala", 4, 180.0);
        zoo[4] = new Eagle("Sky", 2, 4.8);

        System.out.println("===== Hayvanat Bahçesine Hoş Geldin =====");
        System.out.println("Hangi hayvanlara bakmak istersin?\n1 - Aslanlar\n2 - Kartallar\n3 - Yunuslar");
        int choice = input.nextInt();

        if (choice == 1) {
            for (Animals a : zoo) {
                if (a instanceof Lion) {
                    ((Runnable) a).run();
                    a.makeSound();
                }
            }
        }

        System.out.println("=== Hayvan Sesleri ===");
        for (Animals a : zoo) {
            a.makeSound();
        }

        System.out.println("=== Hayvanlar Ne Yapıyor ===");
        for (Animals a : zoo) {
            if (a instanceof Runnable) {
                ((Runnable) a).run();
            }
            else if (a instanceof Swimmable) {
                ((Swimmable) a).swim();
            }
            else if (a instanceof Flyable) {
                ((Flyable) a).fly();
            }
        }

        

    }
}
