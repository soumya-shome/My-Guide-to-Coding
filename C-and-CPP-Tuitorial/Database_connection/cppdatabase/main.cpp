#include<iostream>
#include<stdio.h>
#include<windows.h>
#include <mysql/mysql.h>

using namespace std;

main()

{
    MYSQL* conn;
    conn=mysql_init(0);

    conn=mysql_real_connect(conn,"localhost","admin","admin","test_db",0,NULL,0);//(conn, ip address, db_username, db_password , database_name)
    if(conn){
        printf("Connected");
    }
    else{
        printf("Not Connected");
    }

}
