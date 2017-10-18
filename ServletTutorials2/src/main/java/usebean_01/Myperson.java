package usebean_01;

public class Myperson extends Person2{
	int id;
	
	public Myperson(){
		
	}
	
	public Myperson(int age,String name ,String surname,int id){
		super(age,name,surname);
		this.id=id;
	}
		
}
