package com.borymskyi.solid;

/**
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class Client {
    private Long numberClient;
    private String firstName;
    private String lastName;

    public Client(Long numberClient, String firstName, String lastName) {
        this.numberClient = numberClient;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Long getNumberClient() {
        return numberClient;
    }

    public void setNumberClient(Long numberClient) {
        this.numberClient = numberClient;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
