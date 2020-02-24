import Animal.class;

class Dog extends Animal{
	public int legs;
	public String name;
	Dog(String na,int le){
		this.legs=le;
		this.name=na;
	}
	public int getLegs(){
		return this.legs;
	}
}

