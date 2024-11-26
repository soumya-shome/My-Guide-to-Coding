#include <iostream>
#include<windows.h>
#include<mysql.h>
using namespace std;

int main()
{
    MYSQL* conn;
    conn=mysql_init(0);

    conn=mysql_real_connect(conn,"192.168.0.104","admin","admin","db_check",0,NULL,0);//(conn, ip address, db_username, db_password , database_name)
    if(conn){
        cout<<"Connected";
    }
    else{
        cout<<"Not Connected";
    }
    return 0;
}
