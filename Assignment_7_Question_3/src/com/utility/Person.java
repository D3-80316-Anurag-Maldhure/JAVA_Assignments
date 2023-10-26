package com.utility;

public class Person implements Cloneable{

	    private String name;
	    private int weight;
	    private Date birth;
	    
	    public Person(){
		}
	    
	    public Person(String name, int weight, Date birth) {
			this.name = name;
			this.weight = weight;
			this.birth = birth;
		}

		// ...
	    // deep copy
	    public Object clone() throws CloneNotSupportedException {
	        Person temp = (Person)super.clone(); // shallow copy
	        temp.birth = (Date)this.birth.clone(); // + copy reference types explicitly
	        return temp;
	    }

		public final String getName() {
			return name;
		}

		public final void setName(String name) {
			this.name = name;
		}

		public final int getWeight() {
			return weight;
		}

		public final void setWeight(int weight) {
			this.weight = weight;
		}

		public final Date getBirth() {
			return birth;
		}

		public final void setBirth(Date birth) {
			this.birth = birth;
		}

		@Override
		public String toString() {
			return "Person [name=" + name + ", weight=" + weight + ", birth=" + birth + "]";
		} 
}
