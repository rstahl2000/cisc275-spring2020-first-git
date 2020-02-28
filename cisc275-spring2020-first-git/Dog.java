
class Dog extends Animal{
	public String name;
	Dog(String na,int le){
		super(le);
		this.name=na;
	}
	public String toString(){
		return name+" "+legs;
	}
}

