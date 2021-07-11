import java.io.*;
import java.util.*;
class Film
{
	String name,language,lead_actor,category;
	int duration;
	Film()
	{
		System.out.println("Default Constructor is created");
	}

	Film(String name,String language,String lead_actor,String category,int duration)
	{
		this.name = name;
		this.language = language;
		this.lead_actor = lead_actor;
		this.category = category;
		this.duration = duration;
	}
	void display()
	{
		System.out.println("Name of the movie is: " + name);
		System.out.println("Language: " + language);
		System.out.println("Lead Actor: " + lead_actor);
		System.out.println("Category: " + category);
		System.out.println("Duration: " + duration);
	}
}
class FilmMain
{
	public static void main(String args[])
	{
		Film A = new Film("Predator","English","Arnold","Action",90);
		Film B = new Film("Kaala","Tamil","Rajini","Action",185);
		Film C = new Film("Kabali","Tamil","Rajini","Action",180);
		Film D = new Film("Viswasam","Tamil","Ajith","Action",175);
		Film E = new Film("HulChul","Hindi","Akshay","Comedy",140);
		Film F = new Film("Hungama","Hindi","Akshay","Comedy",180);
		if ((A.lead_actor == "Arnold")||((A.lead_actor == "Rajini")&&(A.language == "Tamil"))||(A.category == "Comedy"))
		{
			A.display();
		}
		if ((B.lead_actor == "Arnold")||((B.lead_actor == "Rajini")&&(B.language == "Tamil"))||(B.category == "Comedy"))
		{
			B.display();
		}
		if ((C.lead_actor == "Arnold")||((C.lead_actor == "Rajini")&&(C.language == "Tamil"))||(C.category == "Comedy"))
		{
			C.display();
		}
		if ((D.lead_actor == "Arnold")||((D.lead_actor == "Rajini")&&(D.language == "Tamil"))||(D.category == "Comedy"))
		{
			D.display();
		}
		if ((E.lead_actor == "Arnold")||((E.lead_actor == "Rajini")&&(E.language == "Tamil"))||(E.category == "Comedy"))
		{
			E.display();
		}
		if ((F.lead_actor == "Arnold")||((F.lead_actor == "Rajini")&&(F.language == "Tamil"))||(F.category == "Comedy"))
		{
			F.display();
		}
	}

}
