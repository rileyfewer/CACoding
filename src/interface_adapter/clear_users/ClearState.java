package interface_adapter.clear_users;

// TODO Complete me

import interface_adapter.login.LoginState;

public class ClearState {
    private String username = "";

    public ClearState(ClearState copy) {
        username = copy.username;
    }
    public ClearState() {}

    public String getUsername(){
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
}
