package LoggerPackage;

public class CustomerManager {

    private String name;
    private String email;
    private BaseLogger logger;

    public CustomerManager(String name, String email, BaseLogger logger) {
        this.name = name;
        this.email = email;
        this.logger = logger;
    }

    public void add() {
        System.out.println("Customer added : " + name);
        logger.log(name + "--" + email);
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
    
}

