// JavaScript Document
function validate(){
name=document.f1.nam.value
if(name==""||name.length<=2){
	
	alert("Enter Name Please")
	document.f1.nam.focus()
	return false	
}
if(document.f1.pass.value.length<=5){
		alert("Enter Password with min 6 charecters");
		document.f1.pass.select();
		return false;
	}
if(document.f1.pass2.value!=document.f1.pass.value){
		alert("Password dose not match");
		document.f1.pass2.select();
		return false;
		
	}
var mail=document.f1.email.value;
var at=mail.indexOf("@");// first index number
var dot=mail.lastIndexOf(".");// last index no
	if(at<=0 ||( dot - at <=2)){
		alert("Please enter proper email with @ & .");
		document.f1.email.focus();
		return false;
		
	}
if(document.f1.pin.value.length!=6 || isNaN(document.f1.pin.value)){
		alert("Please enter Valid pin code");
		document.f1.pin.focus();
		return false;
	}
if(document.f1.mob.value.length!=10 || isNaN(document.f1.mob.value))
	{
		alert("Please enter 10 digit mobile no");
		return false;
	}
	if(document.f1.city.value=="0"){
		alert("Please select a city");
		document.f1.city.focus();
		return false;
	}
}