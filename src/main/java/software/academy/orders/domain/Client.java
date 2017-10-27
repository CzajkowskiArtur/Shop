package software.academy.orders.domain;


public class Client {
    private String firstName;

    public Client(String firstName, String secondName, String login, ClientType type) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.login = login;
        this.type = type;
    }

    private String secondName;

    private String login;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public enum ClientType {
        REGULAR("Regular client in store"),
        VIP("Very important client");

        private String value;

        ClientType(String value) {
            this.value = value;
        }
    }

    private ClientType type;


}
