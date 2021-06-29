package de.pojos;


public class Person {
	
	
	private String id;
	private String vorname;
	private String nachname;
	
	
	
	public Person() {
		this("123","John","Doe");
	}
	
	public Person(String id, String vorname, String nachname) {
		super();
		this.id = id;
		this.vorname = vorname;
		this.nachname = nachname;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public String getNachname() {
		return nachname;
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [id=");
		builder.append(id);
		builder.append(", vorname=");
		builder.append(vorname);
		builder.append(", nachname=");
		builder.append(nachname);
		builder.append("]");
		return builder.toString();
	}
	
	public static PersonBuilder builder() {
		return new PersonBuilder();
	}
	
	
	public static class PersonBuilder {
		
		private final Person person = new Person();
		
		public PersonBuilder id(String id) {
			person.setId(id);
			return this;
		}
		public PersonBuilder vorname(String vorname) {
			person.setVorname(vorname);
			return this;
		}
		public PersonBuilder nachname(String nachname) {
			person.setNachname(nachname);
			return this;
		}
		
		public Person build() {
			return person;
		}
		
	}
}
