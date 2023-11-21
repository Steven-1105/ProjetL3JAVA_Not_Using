package representation;

public class InnerNode extends Node {
	  // Attributs
	  private Node[] nextNodes = new Node[4]; // Assuming up to four branches of nodes

	  // Constructeurs
	  public InnerNode(String description, int id) {
	    super(description, id);
	  }

	  // Méthodes

	  @Override
	  public Node chooseNext() {
	    // select next node
	    return nextNodes[0]; // returns the first node, which should actually be chosen based on logic
	  }
	}