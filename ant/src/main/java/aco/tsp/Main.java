package aco.tsp;

public class Main {
	public static void main(String[] args) {
		ACO aco = new ACO();
		aco.init(2000);
		aco.run(20);
		aco.reportResult();
	}

	/*public static void main(String[] args) {
		System.out.println("aco");
	}*/
}
