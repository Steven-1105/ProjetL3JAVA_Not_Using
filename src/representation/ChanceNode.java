package representation;

import java.util.Random;

public class ChanceNode extends Node {
	//Constructeurs
	public ChanceNode(String description, int id) {
		super(description, id);
	}

	@Override
	public Node chooseNext() {
		Random random = new Random();
		int outcome = random.nextInt(nextNodes.length);

		// Returns a random node
		return nextNodes[outcome];
	}
}