package cz.mendelu.eshop.persistence.utils;

public class DatabaseConnector {

    private Boolean isConnected=null;

    private static DatabaseConnector singletonInstance;

    public static DatabaseConnector getInstance(){
        if(singletonInstance==null)
            singletonInstance=new DatabaseConnector();
        return singletonInstance;
    }

    private DatabaseConnector(){
        this.isConnected=true;
    }

    public Boolean getConnected() {
        return isConnected;
    }

    public void setConnected(Boolean connected) {
        isConnected = connected;
    }
}
