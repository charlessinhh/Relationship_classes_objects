package extendedFamilyTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Family {
	
	Map<String , Member> members ;
	
	Family(){
		this.members = new HashMap<>();
	}
	
	String addChild(String name, String gender, String motherName, String fatherName ) {
		
		if(this.members.containsKey(name)) {
			return "Child addition failed: Member already exists.";
		}
		
		Member mother = this.members.get(motherName);
		Member father = this.members.get(fatherName);
		
		if ( mother == null && father == null) {
			return "Child addition failed: Both parents not found.";
		}
		
		
		Member newMember = new Member(name,gender,motherName, fatherName);
		this.members.put(name, newMember);
		
		
		if (mother != null) {
            mother.addChild(newMember);
        }

        if (father != null) {
            father.addChild(newMember);
        }

        return "Child addition succeed.";
	}
	
	Member find(String memberName) {
		return this.members.get(memberName);
	}
	
	List<String> getSiblings(String memberName) {
        Member member = this.find(memberName);
        if (member == null) {
            return List.of("Member not found.");
        }

        List<String> siblings = new ArrayList<>();
        if (member.motherName != null) {
            Member mother = this.find(member.motherName);
            if (mother != null) {
                for (Member sibling : mother.children) {
                    if (!sibling.name.equals(member.name)) {
                        siblings.add(sibling.name);
                    }
                }
            }
        }

        if (member.fatherName != null) {
            Member father = this.find(member.fatherName);
            if (father != null) {
                for (Member sibling : father.children) {
                    if (!sibling.name.equals(member.name) && !siblings.contains(sibling.name)) {
                        siblings.add(sibling.name);
                    }
                }
            }
        }

        return siblings;
    }

    List<String> getParents(String memberName) {
        Member member = this.find(memberName);
        if (member == null) {
            return List.of("Member not found.");
        }

        List<String> parents = new ArrayList<>();
        if (member.motherName != null) {
            parents.add(member.motherName);
        }
        if (member.fatherName != null) {
            parents.add(member.fatherName);
        }

        return parents;
    }

    List<String> getGrandparents(String memberName) {
        Member member = this.find(memberName);
        if (member == null) {
            return List.of("Member not found.");
        }

        List<String> grandparents = new ArrayList<>();
        if (member.motherName != null) {
            Member mother = this.find(member.motherName);
            if (mother != null) {
                if (mother.motherName != null) {
                    grandparents.add(mother.motherName);
                }
                if (mother.fatherName != null) {
                    grandparents.add(mother.fatherName);
                }
            }
        }

        if (member.fatherName != null) {
            Member father = this.find(member.fatherName);
            if (father != null) {
                if (father.motherName != null) {
                    grandparents.add(father.motherName);
                }
                if (father.fatherName != null) {
                    grandparents.add(father.fatherName);
                }
            }
        }

        return grandparents;
    }
}
