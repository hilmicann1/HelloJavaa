package abstractDemo.src;

public class Main {
    public static void main (String[] args){
        CustomerManager customerManager = new CustomerManager();
        CustomerManager.databaseManager =new MySqlDatabaseManager();
        customerManager.getCustomers();

    }
}
