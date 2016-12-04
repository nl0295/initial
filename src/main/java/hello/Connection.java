package hello;

import java.io.Serializable;

public class Connection implements Serializable{
    private boolean connection;

    public boolean isConnection() {
        return connection;
    }

    public void setConnection(boolean connection) {
        this.connection = connection;
    }
}
