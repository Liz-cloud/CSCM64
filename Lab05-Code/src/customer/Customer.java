package customer;

public class Customer {

	private String name; 
	public String getName () {return name;}
	private String homeAddress; 
	public String getHomeAddress () {return homeAddress;}
	private String favouriteColour; 
	public String getFavouriteColour () {return favouriteColour;}
	private String favouriteEmoji;
	public String getFavouriteEmoji () {return favouriteEmoji;}
	private int age;
	public int getAge () {return age;}
	private int telephoneNumber;
	public int getTelephoneNumber () {return telephoneNumber;}
	private boolean student;
	public boolean isStudent () {return student;}
	private boolean pensioner;
	public boolean isPensioner () {return pensioner;}
	private boolean premiumMember;
	public boolean isPremiumMember () {return premiumMember;}
	
	public double ticketPrice (double fullPrice) {
		return fullPrice * relativeTicketPrice ();
	}
	
	public double relativeTicketPrice () {
		double relativePrice = 1.0;
        if (getAge() <= 18 || (getAge() <= 21 && isStudent()))
            relativePrice *= 0.5;
        if (isStudent () && getAge() > 21)
            relativePrice *= 0.75;
        if (isPremiumMember() && getAge() > 18)
            relativePrice *= 0.75;
        if (isPensioner() || getAge() >= 65)
            relativePrice *= 0.5;
        return relativePrice;
	}
	
	public boolean hasValidName () {
		return nameHasTwoWords()
			&& nameIsLegit();
	}
	
	private boolean nameHasTwoWords () {
		return getName().split(" ").length == 2;
	}
	
	private boolean nameIsLegit () {
		return !getName().toUpperCase().contains("ZOIDBERG");
	}
	
	public Customer ( String name,
			String homeAddress,
			String favouriteColour,
			String favouriteEmoji,
			int age,
			int telephoneNumber,
			boolean student,
			boolean pensioner,
			boolean premiumMember) {
				// "John Doe", -5
		if(age<0 || age>150 ||(age<65 & pensioner))
		this.name = name;
		this.homeAddress = homeAddress;
		this.favouriteColour = favouriteColour;
		this.favouriteEmoji  = favouriteEmoji;
		this.age = age;
		this.telephoneNumber = telephoneNumber;
		this.student = student;
		this.pensioner = pensioner;
		this.premiumMember = premiumMember;
	}
}
