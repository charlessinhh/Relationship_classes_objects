package familyTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Family {

	Map<String, Member> members;

	Family() {
		this.members = new HashMap<>();
	}
	

	
	String addChild(String name, String gender, String motherName) {
		// if member already present,,still u add it
		if(this.members.containsKey(name)) return "Child addition failed: Member already exits"; 
		
		Member mother = this.members.get(motherName);
		
		if(mother == null) {
			return "Child addition failed: Mother not found.";
		}
		mother.printMember();
		Member newMember = new Member(name,gender,motherName);
		newMember.printMember();
		this.members.put(name, newMember);
		mother.addChild(newMember);
		members.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));
		return "Child addition succeed.";
		
	}
	
	Member find(String memberName) {
		return this.members.get(memberName);
	}
	
	List<String> getSiblings(String memberName){
		Member member = this.find(memberName);
		
//		member.printMember();
		
		if(member == null) {
			return List.of("Member not found");
		}
		
		member.printMember();
		
		if(member.motherName == null) {
			return List.of("No siblings present");
		}
		
		Member mother = this.find(member.motherName); 
		member.printMember();
		if(mother == null) {
			return List.of("Mother not found");
		}
		
		List<String> siblings = new ArrayList<>();
		for (Member sibling : mother.children ) {
			if(!sibling.name.equals(member.name)) {
				siblings.add(sibling.name);
			}
		}
		member.printMember();
		return siblings;
	}

}
