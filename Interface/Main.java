import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // textbook
        TextBook[] textBook = new TextBook[2];
        textBook[0] = new TextBook("Introduction to Algorithms", "Thomas H. Cormen, Charles E. Leiserson", 2009,
                "Algoritma");
        textBook[1] = new TextBook("Operating System Concepts", "Abraham Silberschatz, Peter B. Galvin, Greg Gagne",
                2018, "Sistem Operasi");

        // megazine
        Magazine[] megaZine = new Magazine[2];
        megaZine[0] = new Magazine("The New Yorker", "Roxane Gay", 2023, "Politik, Seni, Budaya, Sastra, Musik, Film");
        megaZine[1] = new Magazine("Time Magazine", "Belinda Luscombe", 2022,
                "Politik, Ekonomi, Budaya, Teknologi, dan Masalah Sosial");

        // novel
        Novel[] novel = new Novel[2];
        novel[0] = new Novel("1984", "George Orwell ", 1949, "Distopia");
        novel[1] = new Novel("To Kill a Mockingbird", "Harper Lee", 1960, "Bildungsroman");

        // input
        Scanner sc = new Scanner(System.in);

        // Liat Buku
        myBlock1: while (true) {
            System.out.println("\nList Buku : ");
            System.out.println("1. Textbook");
            System.out.println("2. Megazine");
            System.out.println("3. Novel");
            System.out.println("========================");
            System.out.println("4. Meminjam/Mengembalikkan Buku");

            System.out.print("Liat Buku : ");
            int liatBuku = sc.nextInt();
            sc.nextLine();
            switch (liatBuku) {
                case 1:
                    // print judul buku yang ada;
                    System.out.println("\n---- Book Information ----");
                    for (int i = 0; i < 2; i++) {
                        System.out.println("Text Book " + (i + 1));
                        textBook[i].display();
                    }
                    break;
                case 2:
                    // print judul buku yang ada;
                    System.out.println("\n---- Book Information ----");
                    for (int i = 0; i < 2; i++) {
                        System.out.println("Magazine " + (i + 1));
                        megaZine[i].display();
                    }
                    break;
                case 3:
                    // print judul buku yang ada;
                    System.out.println("\n---- Book Information ----");
                    for (int i = 0; i < 2; i++) {
                        System.out.println("Novel " + (i + 1));
                        novel[i].display();
                    }
                    break;
                case 4:
                    break myBlock1;

                default:
                    System.out.println("Input Salah, Silakan Masukkan Ulang!\n\n");

            }
        }

        MyBlock2: while (true) {
            System.out.println("");
            System.out.println("1. Meminjam");
            System.out.println("2. Mengembalikkan");
            System.out.println("3. Keluar");
            System.out.print("Opsi Buku (Meminjam/Mengembalikan) : ");
            int opsiBuku = sc.nextInt();
            System.out.println();
            switch (opsiBuku) {
                case 1: // meminjam
                    System.out.println("1. Textbook");
                    System.out.println("2. Magazine");
                    System.out.println("3. Novel");
                    System.out.print("Masukkan Jenis Buku : ");
                    int opsiJenisBuku = sc.nextInt();
                    System.out.println();
                    switch (opsiJenisBuku) {
                        // Textbook
                        case 1:
                            System.out.print("Meminjam textbook apa? (1/2): ");
                            int indexTextBook1 = sc.nextInt();
                            switch (indexTextBook1) {
                                case 1:
                                    textBook[0].borrowBook();
                                    break;
                                case 2:
                                    textBook[1].borrowBook();
                                    break;
                            }
                            break;

                        // Magazine
                        case 2:
                            System.out.print("Meminjam magazine apa? (1/2): ");
                            int indexTextBook2 = sc.nextInt();
                            switch (indexTextBook2) {
                                case 1:
                                    megaZine[0].borrowBook();
                                    break;
                                case 2:
                                    megaZine[1].borrowBook();
                                    break;
                            }
                            break;

                        case 3:
                        // novel
                            System.out.print("Meminjam novel apa? (1/2): ");
                            int indexTextBook3 = sc.nextInt();
                            switch (indexTextBook3) {
                                case 1:
                                    novel[0].borrowBook();
                                    break;
                                case 2:
                                    novel[1].borrowBook();
                                    break;
                            }
                            break;
                    }
                    break;
                case 2: // mengembalikkan
                    System.out.println("1. Textbook");
                    System.out.println("2. Magazine");
                    System.out.println("3. Novel");
                    System.out.print("Masukkan Jenis Buku : ");
                    int opsiJenisBuku1 = sc.nextInt();
                    System.out.println();
                    switch (opsiJenisBuku1) {
                        // Textbook
                        case 1:
                            System.out.print("Mengembalikkan textbook apa? (1/2): ");
                            int indexTextBook4 = sc.nextInt();
                            switch (indexTextBook4) {
                                case 1:
                                    textBook[0].returnBook();
                                    break;
                                case 2:
                                    textBook[1].returnBook();
                                    break;
                            }
                            break;

                        // Magazine
                        case 2:
                            System.out.print("Mengembalikkan magazine apa? (1/2): ");
                            int indexTextBook5 = sc.nextInt();
                            switch (indexTextBook5) {
                                case 1:
                                    megaZine[0].returnBook();
                                    break;
                                case 2:
                                    megaZine[1].returnBook();
                                    break;
                            }
                            break;
                        
                        // novel
                        case 3:
                            System.out.print("Mengembalikkan novel apa? (1/2): ");
                            int indexTextBook6 = sc.nextInt();
                            switch (indexTextBook6) {
                                case 1:
                                    novel[0].returnBook();
                                    break;
                                case 2:
                                    novel[1].returnBook();
                                    break;
                            }
                            break;
                    }
                    break;
                case 3:
                    break MyBlock2;
            }
        }
        System.out.println("\n---- Borrowing and Returning Books ----");

        for (int i = 0; i < 2; i++) {
            // Print textbook yang dipinjam
            if (textBook[i].isPernahDipinjam() == true) {
                if (textBook[i].isPernahDikembalikkan() == true) {
                    System.out.println("Textbook : " + textBook[i].getTitle() + " borrowed successfuly");
                } else {
                    System.out.println("Textbook : " + textBook[i].getTitle() + " is not borrowed");
                }
            }

            // Print Magazine yang dipinjam
            if (megaZine[i].isPernahDipinjam() == true) {
                if (megaZine[i].isPernahDikembalikkan() == true) {
                    System.out.println("Magazine : " + megaZine[i].getTitle() + " borrowed successfuly");
                } else {
                    System.out.println("Magazine : " + megaZine[i].getTitle() + " is not borrowed");
                }
            }

            // Print Novel yang dipinjam
            if (novel[i].isPernahDipinjam() == true) {
                if (novel[i].isPernahDikembalikkan() == true) {
                    System.out.println("Novel : " + novel[i].getTitle() + " borrowed successfuly");
                } else {
                    System.out.println("Novel : " + novel[i].getTitle() + " is not borrowed");
                }
            }

            // Print textbook yang sudah dikembalikan
            if (textBook[i].isPernahDikembalikkan() == true) {
                System.out.println("Textbook : " + textBook[i].getTitle() + " returned successfuly");
            }

            // Print Magazine yang sudah dikembalikan
            if (megaZine[i].isPernahDikembalikkan() == true) {
                System.out.println("Megazine : " + megaZine[i].getTitle() + " returned successfuly");
            }

            // Print Novel yang sudah dikembalikan
            if (novel[i].isPernahDikembalikkan() == true) {
                System.out.println("Novel : " + novel[i].getTitle() + " returned successfuly");
            }
        }

    }
}
