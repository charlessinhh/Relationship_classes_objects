package extendedFamilyTree;

public class FamilyTreeQuestion {

	

		/*
		 * Problem Statement Create an extended family tree where you can add members,
		 * find their siblings, parents, and grandparents. The family tree should allow
		 * you to add members with their names and their parent's names (both mother and
		 * father). The family tree should also allow you to find the siblings, parents,
		 * and grandparents of a given member.
		 * 
		 * Requirements Member Class:
		 * 
		 * Constructor to initialize the member with a name, gender, mother’s name, and
		 * father’s name. Method to add a child to this member. 
		 * Family Class:
		 * 
		 * Constructor to initialize an empty family. Method addChild(String name,
		 * String gender, String motherName, String fatherName) to add a new member to
		 * the family. Method find(String memberName) to find a member by name in the
		 * family. Method getSiblings(String memberName) to find the siblings of a given
		 * member. Method getParents(String memberName) to find the parents of a given
		 * member. Method getGrandparents(String memberName) to find the grandparents of
		 * a given member. Input Format Add members to the family using the
		 * addChild(String name, String gender, String motherName, String fatherName)
		 * method. Find siblings, parents, and grandparents of a member using the
		 * corresponding methods. 
		 * 
		 * 
		 * Example Adding members to the family:
		 * 
		 * addChild("Alice", "female", "Mary", "John") 
		 * addChild("Bob", "male", "Mary","John") 
		 * addChild("Charlie", "male", "Mary", "John") 
		 * addChild("David", "male","Alice", "Michael") 
		 * 
		 * Finding siblings:
		 * getSiblings("Alice") should return ["Bob", "Charlie"] 
		 * getSiblings("Bob") should return ["Alice", "Charlie"] 
		 * 
		 * Finding parents:
		 * getParents("Alice") should return ["Mary", "John"] 
		 * getParents("David") should return ["Alice", "Michael"] 
		 * 
		 * Finding grandparents:
		 * getGrandparents("David") should return ["Mary", "John"]
		 * getGrandparents("Alice") should return [] (no grandparents added for Alice)
		 * 
		 */
	
	public static void main(String[] args) {
		
		Family family = new Family();
        family.members.put("Mary", new Member("Mary", "female", null, null)); // Adding a base member
        family.members.put("John", new Member("John", "male", null, null)); // Adding a base member

        System.out.println(family.addChild("Alice", "female", "Mary", "John")); // Child addition succeed
        System.out.println(family.addChild("Bob", "male", "Mary", "John"));     // Child addition succeed
        System.out.println(family.addChild("Charlie", "male", "Mary", "John")); // Child addition succeed
        family.members.put("Michael", new Member("Michael", "male", null, null)); // Adding another base member
        System.out.println(family.addChild("David", "male", "Alice", "Michael")); // Child addition succeed

        System.out.println(family.getSiblings("Alice")); // [Bob, Charlie]
        System.out.println(family.getSiblings("Bob"));   // [Alice, Charlie]
        System.out.println(family.getParents("Alice"));  // [Mary, John]
        System.out.println(family.getParents("David"));  // [Alice, Michael]
        System.out.println(family.getGrandparents("David")); // [Mary, John]
        System.out.println(family.getGrandparents("Alice")); // []

	}

}
