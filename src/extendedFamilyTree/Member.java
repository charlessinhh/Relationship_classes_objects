package extendedFamilyTree;

import java.util.ArrayList;
import java.util.List;

public class Member {
	
	String name;
	String gender;
	String motherName;
	String fatherName;
	List<Member> children;
	
	Member(String name, String gender, String motherName, String fatherName){
		this.name = name;
		this.gender = gender;
		this.motherName = motherName;
		this.fatherName = fatherName;
		this.children = new ArrayList<>();
		
	}
	void addChild(Member child) {
		this.children.add(child);
	}
	

}
