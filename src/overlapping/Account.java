package overlapping;

import java.util.EnumSet;

public class Account {

    private String username;
    private String password;

    private boolean adminMode;

    private String backgroundColor;

    private EnumSet<AccountType> type;

    public Account(String username, String password, boolean adminMode) {
        this.username = username;
        this.password = password;
        this.adminMode = adminMode;
        type = EnumSet.of(AccountType.ADMIN);
    }

    public Account(String username, String password, boolean adminMode, String backgroundColor) {
        this.username = username;
        this.password = password;
        this.adminMode = adminMode;
        this.backgroundColor = backgroundColor;
        type = EnumSet.of(AccountType.ADMIN, AccountType.OWNER);
    }

    public boolean isAdminMode() throws Exception {
        if (type.contains(AccountType.ADMIN)) {
            return adminMode;
        }
        throw new Exception("Account does not have admin access");
    }

    public void setAdminMode(boolean adminMode) throws Exception {
        if (type.contains(AccountType.ADMIN)) {
            this.adminMode = adminMode;
            return;
        }
        throw new Exception("Account does not have admin access");
    }

    public String getBackgroundColor() throws Exception {
        if (type.contains(AccountType.OWNER)) {
            return backgroundColor;
        }
        throw new Exception("Account does not have owner access");
    }

    public void setBackgroundColor(String backgroundColor) throws Exception {
        if (type.contains(AccountType.OWNER)) {
            this.backgroundColor = backgroundColor;
            return;
        }
        throw new Exception("Account does not have owner access");
    }

}
