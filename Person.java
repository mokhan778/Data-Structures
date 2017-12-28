package friends;

public class Person {
	String name;		// the person's name
	Friend firstFriend; // the first friend in the list of this
					    // person's friends
	Person nextPerson;  // the next person in the list of people
	
	public Person(String name, Person nextPerson) {
		this.name = name;
		this.nextPerson = nextPerson;
		}

	// A string representing the list of friends of this person.  
	// O(number of friends in the list)
	public String friendString(){

		String b="";
		for(Friend curr=firstFriend;curr!=null;curr=curr.nextFriend){
			b=b+curr.who.name+ " ";
		}
		return b;
		
	}
	
	// add friend as a friend of this person
	// O(1)
	public void addFriend(Person friend){
		firstFriend=new Friend(friend, firstFriend);
	}
	
	// remove Person friend as a friend of this person
	// if friend is not a friend of this person, does nothing
	// O(number of friends of this person)
	public void removeFriend(Person friend){
		Friend a=firstFriend;
		Friend b=null;
		
		if(a!=null&&a.who==friend){
			firstFriend=a.nextFriend;
			return;
		}
		while(a!=null&&a.who!=friend){
			b=a;
			a=a.nextFriend;
		}
		if(a==null)
		return; 
	
		b.nextFriend=a.nextFriend;
		
	}
}
