package friends;

// represents a list of people as a linked list of Person objects
public class PersonList {
	Person firstPerson;		// First Person object in the list

	public PersonList( ) {
		this.firstPerson = null;
	}
	
	// finds Person object in this list with given name
	// if none exists, returns null.  Runs in O(number of persons in this list) 
	public Person lookup(String name){
		Person target=firstPerson;
		while(target!=null){
			if(name.equals(target.name)){
				return target;
				}
			else{
				target=target.nextPerson;
			}
		}
		
		return null; 
	
	
	}
	
	// creates a new Person object with name and adds it to the list of 
	// Person objects.  Runs in O(1)
	public Person addPerson(String name){
		Person p=new Person(name, null);
		p.nextPerson=firstPerson;
		firstPerson=p;
		
		
		return p; 
		}

}
