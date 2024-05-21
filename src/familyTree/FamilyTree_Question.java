package familyTree;

public class FamilyTree_Question {
	
	/*
	Problem Statement
	
	Create a simple family tree where you can add members and find their siblings. The family tree should allow you 
	to add members with their names and their mother's name. 
	The family tree should also allow you to find the siblings of a given member.

	Requirements
	
	Member Class:

	Constructor to initialize the member with a name, gender, and mother's name.
	Method to add a child to this member.
	
	Family Class:

	Constructor to initialize an empty family.
	Method addChild(String name, String gender, String motherName) to add a new member to the family.
	Method find(String memberName) to find a member by name in the family.
	Method getSiblings(String memberName) to find the siblings of a given member.
	
	Input Format
	Add members to the family using the addChild(String name, String gender, String motherName) method.
	Find siblings of a member using the getSiblings(String memberName) method.
	Example
	Adding members to the family:

	addChild("Alice", "female", "Mary")
	addChild("Bob", "male", "Mary")
	addChild("Charlie", "male", "Mary")
	Finding siblings:

	getSiblings("Alice") should return ["Bob", "Charlie"]
	getSiblings("Bob") should return ["Alice", "Charlie"]
	
	*/
	
	
	public static void main(String[] args) {
		Family family = new Family();
		
        family.members.put("Mary", new Member("Mary", "female", null)); // Adding a base member

        System.out.println(family.addChild("Alice", "female", "Mary")); // Child addition succeed
        System.out.println(family.addChild("Bob", "male", "Mary"));     // Child addition succeed
        System.out.println(family.addChild("Charlie", "male", "Mary")); // Child addition succeed
        System.out.println(family.addChild("Alice", "female", "Mary"));  //Child addition failed: Member already exits
        System.out.println(family.getSiblings("Alice")); // [Bob, Charlie]
        System.out.println(family.getSiblings("Bob"));   // [Alice, Charlie]
        System.out.println(family.getSiblings("Charlie"));  //[Alice, Bob]
        System.out.println(family.getSiblings("Mary"));  // No siblings found.
        System.out.println(family.getSiblings("Eve"));   // Member not found.
	}
}
