package familyTree;

import java.util.ArrayList;
import java.util.List;

public class Member {
	
	String name;
	String gender;
	String motherName;
	List<Member> children;
	
	Member(String name, String gender, String motherName ){
		this.name = name;
		this.gender = gender;
		this.motherName = motherName;
		this.children = new ArrayList<>();
	}
	
	void addChild(Member child) {
		this.children.add(child);
	}
	
	void printMember(){
		System.out.println("name: "+name);
		System.out.println("gender: "+gender);
		System.out.println("mothername: "+motherName);
		for(int i = 0; i < children.size() ;i++) {
			System.out.println("children: "+children.get(i));
		}
	}
}
