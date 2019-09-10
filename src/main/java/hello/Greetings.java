package hello;

@Data
@Entity

public class Greetings {
	private @Id @GeneratedValue Long id;
	private final String content;

	Greetings() {
	}

	Greetings(String content){
		this.content=content;
	}

}
