package com.works.homework09.datasource;


public class DatabaseContextHolder {
    protected static final ThreadLocal<DatabaseType> CONTEXT_HOLDER = new ThreadLocal<>();
    
    public static void setDatabaseType(DatabaseType type){
        CONTEXT_HOLDER.set(type);
    }

    public static DatabaseType getDatabaseType(){
        return CONTEXT_HOLDER.get();
    }
}
