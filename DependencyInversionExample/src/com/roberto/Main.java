package com.roberto;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}

interface DBConnectionInterface {
    public int connect();
}

class MySqlConnection implements DBConnectionInterface{
    @Override
    public int connect(){
        return 1;
    }
}

class PasswordReminder {
    private DBConnectionInterface dbConnection;

    public PasswordReminder(DBConnectionInterface dbConnection){
        this.dbConnection = dbConnection;
    }
}
