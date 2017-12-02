package NonString;

import java.util.Map;

public class Question {

	private int id;
	private String name;
	private Map<Answer,User> answers;
	
	
	public Question() {}
	
	public Question(int id,String name, Map<Answer,User> answers) {
		this.id=id;
		this.name=name;
		this.answers=answers;
	}
	
	public void display() {
		
		System.out.println("Question Id-> " +id);
		System.out.println("Question -> " +name);
		System.out.println("Answers Are:: ");
		
		for(Map.Entry<Answer,User> obj:answers.entrySet()) {
			System.out.println(obj.getKey()+" "+obj.getValue());
		}
	}
	
}
