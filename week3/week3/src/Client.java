public class Client  {
    private Long IdClient;
    private String FirstName;
    private String LastName;
    private String Address;

    public Client(Long idClient,
                   String firstName,
                   String lastName,
                   String address) {
        this.IdClient = idClient;
        this.FirstName = firstName;
        this.LastName = lastName;
        this.Address = address;

    }

    public Long getIdClient() {
        return IdClient;
    }

    public void setIdClient(Long idClient) {
        this.IdClient = idClient;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        this.FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        this.LastName = lastName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        this.Address = address;
    }

    public String toString()
    {
        return "IdClient: " + IdClient + "\nFirstName: " + FirstName + "\nLastName: " + LastName +
                "\nAddress: " + Address ;
    }
}

