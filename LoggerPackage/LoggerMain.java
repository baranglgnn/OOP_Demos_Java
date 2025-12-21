package LoggerPackage;

public class LoggerMain {
    public static void main(String[] args) {

        CustomerManager[] customers = {
                new CustomerManager("Baran", "baran@hotmail.com", new FileLogger()),
                new CustomerManager("Celal", "celal@hotmail.com", new EmailLogger()),
                new CustomerManager("Muhammet", "mhm@hotmail.com", new DataBaseLogger()),
                new CustomerManager("Numan", "numan@hotmail.com", new ConsoleLogger())
        };

        for (CustomerManager customer : customers) {
            customer.add();
        }
    }
}



