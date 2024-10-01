package InheritanceInterface;

interface Service {
    void execute();
}

class ServiceA implements Service {
    public void execute() {
        System.out.println("Executing Service A");
    }
}

class Client {
    private Service service;

    Client(Service service) {
        this.service = service;
    }

    void performService() {
        service.execute();
    }
}

class Interface19 {
    public static void main(String[] args) {
        Service service = new ServiceA();
        Client client = new Client(service);
        client.performService();
    }
}
