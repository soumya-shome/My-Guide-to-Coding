import java.util.*;
public class CRC{
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);

		int i,j,keylen,msglen,flag=0;
		String input="",key="",quot="",key1="",rem="",temp="";
		
		System.out.println("Enter Data: ");
		input=sc.next();
		System.out.println("Enter Key: ");
		key=sc.next();
		keylen=key.length();
		msglen=input.length();
		key1=key; 
		for (i=0;i<keylen-1;i++)
			input+='0';
		temp=input;
		
		for (i=0;i<msglen;i++){
			quot+=temp.charAt(0);
			char a=quot.charAt(i);
			if(a=='0'){
				key="";
				for(j=0;j<keylen;j++)
					key+='0'; 
			}
			else
				key=key1;
			for(j=0;j<keylen-1;j++){
				if(temp.charAt(j)==key.charAt(j))
					rem+='0';
				else
					rem+='1';
			}
			rem+=input.charAt(i+keylen-2);
			temp=rem;	
		}
		rem=temp;

		System.out.println("Quotient is"+quot);
	
		System.out.println("Remainder is"+rem);
	
		System.out.println("Final data is"+input+rem);
	
		String temp1;
		System.out.println("Enter received data");
		temp1=sc.next();
		sc.close();
		temp=temp1;

		for (i=0;i<msglen;i++){
			quot+=temp.charAt(0);
			char a=quot.charAt(i);
			if(a=='0'){
				key="";
				for(j=0;j<keylen;j++)
					key+='0'; 
			}
			else
				key=key1;
			for(j=0;j<keylen-1;j++){
				if(temp.charAt(j)==key.charAt(j))
					rem+='0';
				else
					rem+='1';
			}
			rem+=input.charAt(i+keylen-2);
			temp=rem;	
		}
		rem=temp;

		System.out.println("Quontient is"+quot);
		
		System.out.println("Remainder is"+rem);
		
		flag=0;
		for (i=0;i<keylen-1;i++){
			if(rem.charAt(i)=='1')
				flag=1;
			else 
				flag=0;
		}
		
		if(flag==0)
			System.out.println("no error");
		else 
			System.out.println("error is detected");
		
		
	}
}