package Persist_Employee;
import java.io.*;
import java.util.*;
public class EmployeeUtility {
    public boolean addEmployee(String fileName,ArrayList<Employee> employeelist) {
    	try {
    		FileOutputStream file=new FileOutputStream(fileName);
    		ObjectOutputStream out=new ObjectOutputStream(file);
    		
    		out.writeObject(employeelist);
    		out.close();
    		file.close();
    		return true;
    	}catch(IOException ioe) {
    		ioe.printStackTrace();
    	}
    	return false;
    }
    public Employee viewEmployeeById(String fileName,int EmployeeId) {
    	Employee obj=null;
    	try {
    		FileInputStream fis=new FileInputStream(fileName);
    		ObjectInputStream ois=new ObjectInputStream(fis);
    		Object eobj=ois.readObject();
    		ArrayList<Employee> namelist=(ArrayList<Employee>) eobj;
    		for(int i=0;i<namelist.size();i++) {
    			obj=namelist.get(i);
    			if(obj.getEmployeeId()==EmployeeId) {
    				return obj;
    			}
    		}
    		ois.close();
    		fis.close();
    	}catch(Exception e) {
    		
    	}
    	return null;
    }
    
}