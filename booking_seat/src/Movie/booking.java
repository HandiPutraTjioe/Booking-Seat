package Movie;

import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class booking {
    static Scanner scan = new Scanner(System.in);
    // Scanner
    
    static int choice, choice1, choice2;
    // For Main Menu Switch 
    // Choice Variable for main menu
    // Choice1 Variable for Case 1
    // Choice2 Variable for case 2
    
    static int choice4;
    // For Number Book ( Movie )
    
    static String choice3, myname;
    // For Booking
    // Choice3 for Book Seat
    // myname is information about Book Seat
    
    static ArrayList<String> namamovie = new ArrayList<String>(); // Movie Name
    
    static ArrayList<String> moviebook = new ArrayList<String>(); // Movie Book
    static ArrayList<String> namebook = new ArrayList<String>(); // Customer Book
    static ArrayList<String> bookseat = new ArrayList<String>();// Customer Seat
        
    static String[] vecnama = new String[40]; 
    static String[][] vecseat = new String[4][4];
    static int reser = 0;//Admin
    static int reser1 = 0;//Booking
    
    public static void title(){
        System.out.printf("=============================\n");
        System.out.printf("||...... CINEMA XXI .......||\n");
        System.out.printf("=============================\n\n");
    }
    // Title
    
    public static void menu_utama(){
        System.out.println("==============");
        System.out.println("| Main  Menu |");
        System.out.println("==============");
        System.out.println("| 1. User    |");
        System.out.println("| 2. Admin   |");
        System.out.println("| 3. Exit    |");
        System.out.println("==============");
    }
    // Main Menu
    
    public static void menu_user(){
        System.out.println("\n Booking Seat");
        System.out.println("================");
        System.out.println("| 1. Booking   |");
        System.out.println("| 2. View Book |");
        System.out.println("| 3. Exit      |");
        System.out.println("================");
        
    }
    // User Menu
    
    public static void menu_admin(){
        System.out.println("\n    Menu Movie");
        System.out.println("===================");
        System.out.println("| 1. Add Movie    |");
        System.out.println("| 2. View Movie   |");
        System.out.println("| 3. Update Movie |");
        System.out.println("| 4. Delete Movie |");
        System.out.println("| 5. Exit         |");
        System.out.println("===================");
    }
    // Admin Menu
    
    public static void add(){
        String temp = "";
        do{
            System.out.print("\nInput Movie Name [6..21] : ");
            try{
            temp = scan.nextLine();
            }catch(Exception e){
                System.out.println("You Must Input String [6..21]");
                break;
            }
        }while(temp.length() < 6 || temp.length() > 21);
        vecnama[0] = temp;
        reser++;
        namamovie.add(temp);
        System.out.println("Data Have Been Add...");
        scan.nextLine();
    }
    // Add Movie
    
    public static void chair(){
        System.out.println(" ==============");
        System.out.println(" === Screen ===");
        System.out.println(" ==============\n");
        for(int i=0; i<4; i++){
        for(int j=0; j<4; j++){
            if(vecseat[i][j] == vecseat[0][j]){
             vecseat[i][j] = " A" + (j+1);   
             System.out.print(vecseat[i][j]);
            }
            if(vecseat[i][j] == vecseat[1][j]){
             vecseat[i][j] = " B" + (j+1);   
             System.out.print(vecseat[i][j]);
            }
            if(vecseat[i][j] == vecseat[2][j]){
             vecseat[i][j] = " C" + (j+1);   
             System.out.print(vecseat[i][j]);
            }
            if(vecseat[i][j] == vecseat[3][j]){
             vecseat[i][j] = " D" + (j+1);   
             System.out.print(vecseat[i][j]);
            }
            if(vecseat[i][j] == vecseat[i][3]){  
             System.out.println(vecseat[i][j]);
            }
    }
    }
    }
    // Seat
    
    public static void book(){
                  if(reser == 0){
                      //System.out.println("\nThere Is No Movies ....\n");
                      print();
                      scan.nextLine();
                  }else{
                        print(); // Movie View
                        do{
                        System.out.print(" Input Your Name First [6..20] : ");
                        try{
                        myname = scan.nextLine();
                        }catch(Exception e){
                            System.out.println("You Must Input String [6..20]");
                            break;
                        }
                        }while(myname.length() < 6 || myname.length() > 20);
                        
                        System.out.printf("\n Choose Movie [1..%d] : ", reser);
                        do{
                        try{
                        choice4 = scan.nextInt();
                        }catch(Exception e){
                            System.out.println("You Must Input A Number");
                            break;
                        }
                        }while(choice4 < 1 || choice4 > reser);
                        
                        System.out.println(" ============================");
                        System.out.println(" Movie Name : "+namamovie.get(choice4-1));
                        System.out.println(" ============================\n");
                        
                                                chair();  // Seat Movie
                        
                        System.out.print("\n Choose  Seat [Exmpl : AX, X is digit] : ");
                        do{
                            try{
                                choice3 = scan.nextLine();
                            }catch(Exception e){
                                System.out.println("You Must Input String Max 2 - alphabet ");
                                break;
                            }
                        }while(choice3.length() != 2);
                        reser1++;
                        namebook.add(myname);
                        moviebook.add(namamovie.get(choice4-1));
                        bookseat.add(choice3);
                        System.out.println("\nData Have Been Add in View Booking...");
                        scan.nextLine();
                  }
    }
    // Book Movie
    
    public static void update(){
        if(reser == 0){
            System.out.println("There Is No Movies To Update....\n");
            scan.nextLine();
        }else{
            print();
            int no=0;
            String word="";
            do{
                System.out.printf("Input Number To Update The Movie Name [1..%d] : ",reser);
                try{
                no = scan.nextInt();
                }catch(Exception e){
                    System.out.println("You Must Input A Number");
                    break;
                }
            }while(no < 1 || no > reser);
            
                System.out.println("\nOld Movie Name : "+namamovie.get(no-1));
            
                System.out.print("\nInput New Movie Name [6..21] : ");
            do{
                 try{
                 word = scan.nextLine();
                 }catch(Exception e){
                    System.out.println("You Must Input A String [6..21]");
                    break;
                 }
            }while(word.length() < 6 || word.length() > 21 );
            namamovie.set(no-1, word);
            System.out.printf("Index %d Have Been Update...\n", no);
            scan.nextLine();
        }
    }
    // Update Data Movies
    
    public static void print(){
        if(reser != 0){
                System.out.printf("\n==============================\n");
                System.out.printf("|%4s| %-21s |\n","No.","Movie");
                System.out.printf("==============================\n");
            for(int i=0; i<reser; i++){
                System.out.printf("|%2d. | %-21s |\n", i+1, namamovie.get(i) );
            }
                System.out.printf("==============================\n");
                System.out.printf("| Total : %-18d |\n", reser);
                System.out.printf("==============================\n\n");
        }else{
            System.out.printf("\n==============================\n");
            System.out.printf("|%4s| %-21s |\n","No.","Movie");
            System.out.printf("==============================\n");
            System.out.println("     Data Movie Is Empty\n\n");
        }
    }
    // View Data Movies
    
    public static void print_book(){
        if(reser1 != 0){
                System.out.printf("\n===========================================================================\n");
                System.out.printf(" |%4s| %-23s | %-26s | %-6s |\n","No.","Name","Movie","Seat Code");
                System.out.printf("===========================================================================\n");
            for(int i=0; i<reser1; i++){
                System.out.printf(" |%2d. | %-23s | %-26s | %-9s |\n", i+1, namebook.get(i), moviebook.get(i) , bookseat.get(i));
            }
                System.out.printf("===========================================================================\n");
                System.out.printf(" | Total : %-61d |\n", reser1);
                System.out.printf("===========================================================================\n\n");
        }else{
                System.out.printf("\n===========================================================================\n");
                System.out.printf(" |%4s| %-23s | %-26s | %-6s |\n","No.","Name","Movie","Seat Code");
                System.out.printf("===========================================================================\n");
                System.out.println("\t\t\t   Data Booking Is Empty\n\n");
        }
        scan.nextLine();
    }
    // View Booking
    
    public static void delete(int reser){
        if(reser == 0){
            System.out.println("There Is No Movies To Delete....\n");
            scan.nextLine();
        }else{
            print();
            int number;
            System.out.printf("Input Number Movie to delete [1..%d] : ",reser);
            do{
                try{
                    number = scan.nextInt();
                }catch(Exception e){
                    System.out.println("You Must Input A Number");
                    break;
                }
                System.out.printf("Index %d Have Been Delete...\n", number);
                namamovie.remove(reser-1);
        }while(number < 1 || number > reser);
          reser--;
        }   
         scan.nextLine();
    }
    // Delete Data Movie
    
    public static void cls(){
        try{
            if(System.getProperty("os.name").startsWith("window")){
                Process exitCode = Runtime.getRuntime().exec("cls");
            }else{
                Process exitCode = Runtime.getRuntime().exec("clear");
            }
        }catch(IOException e){
            for(int i=0; i<1000; i++){
                System.out.println();
            }
        }
    }
    // Clear Screen
        
    public static void main(String[] args){
        do{
        cls();
        title();
        
        menu_utama();
        System.out.print("Pilihan : ");
        try{
        choice = scan.nextInt(); scan.nextLine();
        }catch(Exception e){
            System.out.println("You Must Input A Number");
            break;
        }
        switch(choice){
            case 1:
                menu_user();
                do{
                System.out.print("Pilihan : ");
                try{
                choice1 = scan.nextInt();scan.nextLine();
                }catch(Exception e){
                    System.out.println("You Must Input A Number");
                    break;
                }
                switch(choice1){
                    case 1:
                        book();
                        break;
                    case 2:
                        print_book();
                        break;
                    case 3:
                        
                        break;
                }
                }while(choice1 < 1 || choice1 > 3);
                break;
            case 2:
                menu_admin();
                do{
                System.out.print("Pilihan : ");
                try{
                choice2 = scan.nextInt();scan.nextLine();
                }catch(Exception e){
                    System.out.println("You Must Input A Number");
                    break;
                }
                switch(choice2){
                    case 1:
                        add();
                        break;
                    case 2:
                        print();
                        scan.nextLine();
                        break;
                    case 3:
                        update();
                        break;
                    case 4:
                        delete(reser);
                        break;
                    case 5:
                        
                        break;
                }
                }while(choice2 < 1 || choice2 > 5);
                break;
            case 3:
                cls();
                
                System.out.print("\t\t\t           ________              _________    ___ \n");
                System.out.print("\t\t\t          |  ____  |            |   ___   |  |   |\n");
                System.out.print("\t\t\t          | |    |_|            |__|   |  |  |   |\n");
                System.out.print("\t\t\t          | |         ________         |  |  |   |\n");
                System.out.print("\t\t\t          | |     _  |________|  ______|  |  |   |\n");
                System.out.print("\t\t\t    ___   | |    | | |________| |  _______|  |   |   ___\n");
                System.out.print("\t\t\t   |___|  | |____| |            | |_______   |   |  |___|\n");
                System.out.print("\t\t\t   |___|  |________|            |_________|  |___|  |___|\n");
                
                System.out.print("\n");
                
                System.out.println("\t\t\t        .... Thank You For Coming To Cinema XXI .... ");
                System.out.println("\t\t\t\t         (^_^) .... (^_^) .... (^_^) ");
                scan.nextLine();
                break;
        }
    }while(choice != 3);
    }
}
    //  Static Void Main