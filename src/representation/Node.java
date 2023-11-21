package representation;

public abstract class Node {
	  // Attributs
	  protected String description;
	  protected int id;

	  // Constructeurs
	  public Node(String description, int id) {
		  this.description = description;
		  this.id = id;
	  }

	  // Méthodes
	  public void display() {
		  System.out.println(description);
	  }

	  public abstract Node chooseNext();
		  // Default method, will be overridden in subclasses
	  
}