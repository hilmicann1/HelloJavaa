package abstractDemo.src;
public class CustomerManager {


    static BaseDatabaseManager databaseManager;

    public void getCustomers(){
        databaseManager.getData();
    }
}
