package templatePattern;

public abstract class CaffeineBeverageWithHook {
	void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		// hooking with condition
		if (customerWantsCondiments()) {
			addCondiments();
		}
	}

	abstract void brew();
	abstract void addCondiments();

	final void boilWater() {
		System.out.println("Boiling Water");
	}

	final void pourInCup() {
		System.out.println("Pouring into cup");
	}

	// hook
	boolean customerWantsCondiments() {
		return true;
	}
}