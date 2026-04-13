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
        int innerChoice = 0;

        while (true) {

            switch (choice) {
                case 1: {
                    for (Animals a : zoo) {
                        if (a instanceof Lion) {
                            ((Runnable) a).run();
                            a.makeSound();
                        }
                    }
                    System.out.println("1 - Tekrar Bak\n2 - Geri Dön");
                    innerChoice = input.nextInt();
                    break;
                }
                case 2: {
                    for (Animals a : zoo) {
                        if (a instanceof Eagle) {
                            ((Flyable) a).fly();
                            a.makeSound();
                        }
                    }
                    System.out.println("1 - Tekrar Bak\n2 - Geri Dön");
                    innerChoice = input.nextInt();
                    break;
                }
                case 3: {
                    for (Animals a : zoo) {
                        if (a instanceof Dolphin) {
                            ((Swimmable) a).swim();
                            a.makeSound();
                        }
                    }
                    System.out.println("1 - Tekrar Bak\n2 - Geri Dön");
                    innerChoice = input.nextInt();
                    break;
                }
                default: {
                    System.out.println("Geçersiz Seçim!");
                    break;
                }
            }

            if (innerChoice == 1) {
                continue;
            }
            else if (innerChoice == 2) {
                System.out.println("Girişe Dönüldü");
                System.out.println("Hangi hayvanlara bakmak istersin?\n1 - Aslanlar\n2 - Kartallar\n3 - Yunuslar\n4 - Hayvanat Bahçesinden Ayrıl");
                choice = input.nextInt();
                if (choice == 4) {
                    System.out.println("Hayvanat Bahçesinden Ayrılıyorsunuz...");
                    break;
                }
            }
        }
    }
}
