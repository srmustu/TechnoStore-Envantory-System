import javax.management.remote.NotificationResult;
import java.util.*;

public class EnvantorySystem {

    String m1 = "The product you selected has been deleted.";
    String m2 = "The product you we are looking for was not found.";

    Scanner scan = new Scanner(System.in);
    Scanner doubleinput = new Scanner(System.in);
    Scanner removeChoice = new Scanner(System.in);
    Scanner filterBrand = new Scanner(System.in);

    Brand selectedBrand = null;

    private ArrayList<Brand> brands;
    private ArrayList<Phone> phones = new ArrayList<>();
    private ArrayList<Notebook> notebooks = new ArrayList<>();

    public EnvantorySystem() {
        brands = new ArrayList<>();
        brands.add(new Brand(1, "Samsung"));
        brands.add(new Brand(2, "Lenovo"));
        brands.add(new Brand(3, "Apple"));
        brands.add(new Brand(4, "Huawei"));
        brands.add(new Brand(5, "Casper"));
        brands.add(new Brand(6, "Asus"));
        brands.add(new Brand(7, "Hp"));
        brands.add(new Brand(8, "Xiaomi"));
        brands.add(new Brand(9, "Monster"));

    }


    private boolean addPhoneFunction = false;
    public void envPhoneInfo() {

        if (addPhoneFunction != true) {
            phones.add(new Phone(1, brands.get(7), "Galaxy A32", "Blue", 10000, 5,
                    59, 128, 6.1, 5000, 12));
            phones.add(new Phone(2, brands.get(0), "Iphone 16", "Product Red", 100000, 0,
                    559, 256, 6.0, 3500, 8));
            phones.add(new Phone(3, brands.get(8), "Redmi Note 15 Pro 5G", "Black Noir", 20000, 3,
                    6000, 512, 6.7, 5000, 14));

            addPhoneFunction = true;
        }

        // Başlık yazdırma
        System.out.println("\nCep Telefonu Listesi");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Ürün Adı                      | Fiyat     | Marka     | Depolama  | Ekran     | Pil       | RAM       | Renk      |");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");

        // Telefonların bilgilerini yazdırma
        for (Phone p : phones) {
            // Price için %d formatı kullanıyoruz çünkü price int tipinde
            System.out.printf("| %-2d | %-25s | %-8d TL | %-10s | %-8d | %-8.1f | %-7d | %-8d | %-4s |\n",
                    p.getId(), p.getName(), p.getPrice(), p.getBrand().getName(),
                    p.getGbTypeMemory(), p.getScreenSize(), p.getBatterySize(), p.getGbTypeRam(), p.getColor());
        }

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println();
        System.out.print("Click 0 to return to the main menu." + "\n" + "Click 1 to add a new product." + "\n" + "Click 2 to delete product." + "\n" + "Click 3 to filter by brand." + "\n" +"Your choice : ");
        int addFunc = scan.nextInt();

        switch (addFunc) {
            case 0:
                break;
            case 1:
                addPhone();
                break;
            case 2:
                removePhone();
                break;
            case 3:
                filterPhonesByBrands();
                break;
            default:
                break;
        }

    }
        /*
        for (Phone p : phones) {
            System.out.println(p.getBrand().getName() + " " + p.getName());
        }

         */

    private boolean addNotebookFunction = false;

    public void envNotebookInfo() {

        if (addNotebookFunction != true) {

            notebooks.add(new Notebook(1, brands.get(1), "Proart Anc436", "Black", 65000, 0, 462, 4000,
                    14, 9000, 36));
            notebooks.add(new Notebook(2, brands.get(2), "Nirvana N987U", "Black", 20000, 0, 150, 8000,
                    14, 8000, 128));
            notebooks.add(new Notebook(3, brands.get(3), "Pavilion G7564_P", "Black", 90056, 0, 968, 1000,
                    14, 12000, 64));

            addNotebookFunction = true;
        }

        // Başlık yazdırma
        System.out.println("\nNotebook Listesi");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Ürün Adı                      | Fiyat     | Marka     | Depolama  | Ekran     | Pil       | RAM       | Renk      |");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");

        // Notebook bilgilerini yazdırma
        for (Notebook n : notebooks) {
            System.out.printf("| %-2d | %-25s | %-8.2f TL | %-10s | %-8d | %-8.1f | %-7d | %-8d | %-4s |\n",
                    n.getId(), n.getName(), (double) n.getPrice(), n.getBrand().getName(),
                    n.getGbTypeMemory(), n.getScreenSize(), n.getBatterySize(), n.getGbTypeRam(), n.getColor());
        }

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println();
        System.out.print("Click 0 to return to the main menu." + "\n" + "Click 1 to add a new product." + "\n" + "Click 2 to delete product." +  "\n" + "Click 3 to filter by brand." + "\n" + "Your choice : ");
        int addFunc = scan.nextInt();

        switch (addFunc) {
            case 0:
                break;
            case 1:
                addNotebook();
                break;
            case 2:
                removeNotebook();
                break;
            case 3:
                filterNotebookByBrands();
                break;
            default:
                break;
        }
    }


    public void printBrands() {
        brands.sort(new BrandComparator());

        for (Brand b : brands) {
            System.out.println("Id: " + b.getId() + "\t" + "Brand name : " + b.getName());
        }
    }

    public ArrayList<Brand> getBrands() {
        return this.brands;
    }

    public void setBrands(ArrayList<Brand> brands) {
        this.brands = brands;
    }

    public static void main(String[] args) {

    }

    public void addPhone() {
        int id;
        int brandChoice;
        String name;
        String color;
        int price;
        int discountRate;
        int stockQuantity;
        int gbTypeMemory;
        int gbTypeRam;
        double screenSize;
        int batterySize;

        System.out.println("Enter the properties of the device you want to add : ");

        System.out.print("Enter the device id : ");
        id = scan.nextInt();

        System.out.print("Enter the brand of the device : ");
        brandChoice = scan.nextInt();


        System.out.print("Enter the name of the device : ");
        scan.nextLine();
        name = scan.nextLine();

        System.out.print("Enter the color of the device : ");
        color = scan.nextLine();

        System.out.print("Enter the price of the device : ");
        price = scan.nextInt();

        System.out.print("Enter the discount rate on the price of the device : ");
        discountRate = scan.nextInt();

        System.out.print("Enter the stock quantity of the device : ");
        stockQuantity = scan.nextInt();

        System.out.print("Enter the memory information of to the device in GB type : ");
        gbTypeMemory = scan.nextInt();


        System.out.print("Enter the amount of battery in the mah type of the device : ");
        batterySize = scan.nextInt();

        System.out.print("Enter the ram information of to the device in GB type : ");
        gbTypeRam = scan.nextInt();

        System.out.print("Enter the screen size of the device : ");
        screenSize = doubleinput.nextDouble();

        phones.add(new Phone(id, brands.get(brandChoice), name, color, price, discountRate,
                stockQuantity, gbTypeMemory, screenSize, batterySize, gbTypeRam));

        System.out.println("Device added.");
    }

    public void addNotebook() {
        int id;
        int brandChoice;
        String name;
        String color;
        int price;
        int discountRate;
        int stockQuantity;
        int gbTypeMemory;
        int gbTypeRam;
        double screenSize;
        int batterySize;

        System.out.println("Enter the properties of the device you want to add : ");

        System.out.print("Enter the device id : ");
        id = scan.nextInt();

        System.out.print("Enter the brand of the device : ");
        brandChoice = scan.nextInt();


        System.out.print("Enter the name of the device : ");
        scan.nextLine();
        name = scan.nextLine();

        System.out.print("Enter the color of the device : ");
        color = scan.nextLine();

        System.out.print("Enter the price of the device : ");
        price = scan.nextInt();

        System.out.print("Enter the discount rate on the price of the device : ");
        discountRate = scan.nextInt();

        System.out.print("Enter the stock quantity of the device : ");
        stockQuantity = scan.nextInt();

        System.out.print("Enter the memory information of to the device in GB type : ");
        gbTypeMemory = scan.nextInt();


        System.out.print("Enter the amount of battery in the mah type of the device : ");
        batterySize = scan.nextInt();

        System.out.print("Enter the ram information of to the device in GB type : ");
        gbTypeRam = scan.nextInt();

        System.out.print("Enter the screen size of the device : ");
        screenSize = doubleinput.nextDouble();

        notebooks.add(new Notebook(id, brands.get(brandChoice), name, color, price, discountRate,
                stockQuantity, gbTypeMemory, screenSize, batterySize, gbTypeRam));

        System.out.println("Device added.");
    }

    public void removePhone() {
        System.out.print("Enter the id number of the device you want to delete from the inventory : ");
        int id = removeChoice.nextInt();

        boolean found = false;
        Phone phoneToRemove = null;
        for (Phone p : phones) {
            if (p.getId() == id) {
                phones.remove(id);
                found = true;
                break;
            }

            if (found) {
                System.out.print(m1);
            } else {
                System.out.println(m2);
            }
        }
    }

    public void removeNotebook() {
        System.out.print("Enter the id number of the device you want to delete from the inventory : ");
        int id = removeChoice.nextInt();

        boolean found = false;
        Notebook notebookToRemove = null;
        for (Notebook n : notebooks) {
            if (n.getId() == id){
                notebooks.remove(id);
                found = true;
                break;
            }
        }
        if (found){
            System.out.print(m1);
        }else {
            System.out.print(m2);
        }
    }

    public void filterPhonesByBrands(){

        System.out.print("Enter the brands you want to filter :");
        String choice = filterBrand.nextLine();

        boolean found = false;
        boolean crown = false;

        for (Phone p : phones){
            String ciguli = p.getBrand().getName();
            if (ciguli.equals(choice)){
                if (crown == false) {// Başlık yazdırma
                    System.out.println("\nCep Telefonu Listesi");
                    System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("| ID | Ürün Adı                      | Fiyat     | Marka     | Depolama  | Ekran     | Pil       | RAM       | Renk      |");
                    System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
                }

                System.out.printf("| %-2d | %-25s | %-8d TL | %-10s | %-8d | %-8.1f | %-7d | %-8d | %-4s |\n",
                        p.getId(), p.getName(), p.getPrice(), p.getBrand().getName(),
                        p.getGbTypeMemory(), p.getScreenSize(), p.getBatterySize(), p.getGbTypeRam(), p.getColor());
                System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
                crown = true;
            }

                found = true;
        }

        if (found != true){
            System.out.print("No phones found the brand : " + choice);
        }

    }

    public void filterNotebookByBrands(){
        System.out.print("Enter the brands you want to filter : ");
        String choice = filterBrand.nextLine();


        boolean isOk = false;
        boolean found = false;
        for (Notebook n : notebooks){
            String gilgamis = n.getBrand().getName();
            if (gilgamis.equals(choice)){

                if (isOk == false) {
                    System.out.println("\nNotebook Listesi");
                    System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("| ID | Ürün Adı                      | Fiyat     | Marka     | Depolama  | Ekran     | Pil       | RAM       | Renk      |");
                    System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
                }
                // Notebook bilgilerini yazdırma
                    System.out.printf("| %-2d | %-25s | %-8.2f TL | %-10s | %-8d | %-8.1f | %-7d | %-8d | %-4s |\n",
                            n.getId(), n.getName(), (double) n.getPrice(), n.getBrand().getName(),
                            n.getGbTypeMemory(), n.getScreenSize(), n.getBatterySize(), n.getGbTypeRam(), n.getColor());

                isOk = true;
                System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
            }

            found = true;
        }

        if (found != true){
            System.out.print("No notebooks found the brand : " + choice);
        }
    }
}



