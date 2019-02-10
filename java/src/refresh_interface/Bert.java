package refresh_interface;

public class Bert implements Student{

	@Override
	public String study() {
		String s = "Bert is studying class material.";
		return s;
	}

	@Override
	public String research() {
		String s = "Bert is doing a research for his team project.";
		return s;
	}

	@Override
	public String takeTest() {
		String s = "Bert is taking exam in a classroom.";
		return s;
	}
	
	public static void main(String[] args) {
		Bert b = new Bert();
		System.out.println(b.study() + "\n" + b.research() + "\n" + b.takeTest());
	}
}
