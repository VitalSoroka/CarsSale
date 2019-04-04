package classes;

import java.io.Serializable;

public class Account implements Serializable {
    private int accountId;
    private String login;
    private String password;

    public int getAccountId() {
        return accountId;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
