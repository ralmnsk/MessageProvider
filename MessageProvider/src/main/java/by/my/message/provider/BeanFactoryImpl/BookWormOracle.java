package by.my.message.provider.BeanFactoryImpl;

public class BookWormOracle implements Oracle {
	private Encyclopedia encyclopedia;
	
	public void setEncyclopedia(Encyclopedia encyclopedia) {
		this.encyclopedia = encyclopedia;
	}

	@Override
	public String defineMeaningOfLife() {
		// TODO Auto-generated method stub
		return "Encyclopedias are a waste of money - go see the world instead";
	}

}
