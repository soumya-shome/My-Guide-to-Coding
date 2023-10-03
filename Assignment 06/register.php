<?php

require("conn.php");
$username=$_POST["user_name"];
$password=$_POST["password"];
$query="SELECT * FROM `users` WHERE `username` LIKE '".$username."' AND `password` LIKE '".$password."'";
$r=mysqli_query($con,$query);
if(mysqli_num_rows($r)>0){
	echo("login success");
}else{
	echo("login Failed");
}
?>