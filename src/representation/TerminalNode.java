package representation;

public class TerminalNode extends Node {
	  // Constructeurs
	  public TerminalNode(String description, int id) {
		  super(description, id);
	  }

	  @Override
	  public Node chooseNext() {
		  // The end node returns to itself, because the game is over!
		  return this;
	  }
}