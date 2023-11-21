package representation;

import java.util.Scanner; //Utilisation d'une console

public class DecisionNode extends Node {
  //Constructeurs
  public DecisionNode(String description, int id) {
	  super(description, id);
  }

  @Override
  public Node chooseNext() {
	  Scanner scanner = new Scanner(System.in);
	  System.out.println("Make a decision (enter a number):");
	  int decision = scanner.nextInt();

	  // Decide on next node based on user input
	  return nextNodes[decision];
  }
}