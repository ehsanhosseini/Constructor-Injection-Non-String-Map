package NonString;

public class Answer {

	private int id;
	private String answer;
	private String from;
	
	public Answer(int id,String answer, String from){
		this.id=id;
		this.answer=answer;
		this.from=from;
	}
	
	public String toString(){
		
		return id+" "+answer+" "+from;
	}
	
}
