import java.util.List;

public class NameFinder {
	
	public boolean findName(List<String> nameList,String name) throws NameNotFoundException{
		for(String n : nameList){
			if(n.equals(name)){
				return true;
			}
		}
		throw new NameNotFoundException();
	}

}
