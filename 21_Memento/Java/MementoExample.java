public class MementoExample {
	public static void main(String[] args) {
		Caretaker caretaker = new Caretaker();
		Originator originator = new Originator();
		
		originator.set("State1");
		originator.set("State2");
		caretaker.addMemento(originator.saveToMemento());
		originator.set("State3");
		
		originator.restoreFromMemento(caretaker.getMemento(0));
		originator.set("State4");

		caretaker.addMemento(originator.saveToMemento());
		originator.set("State5");

		originator.restoreFromMemento(caretaker.getMemento(1));
	}
}
