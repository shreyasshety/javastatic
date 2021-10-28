class Run1{
public static void main(String[] values){
Currency currency=new Currency();
System.out.println("****************CURRENCY*********");
//System.out.println("NAME");
currency.name="--ringgit--";
//System.out.println("VALUE");
currency.value=17.84;
//currency.Displaydetails();


//currency=new Currency();
Country1 ref=new Country1();
//ref=new Country1();
currency.country=new Country1();//LINKING ONE REFERENCE TO ANOTHER
ref.name="MALAYSIA";
ref.code=75;
System.out.println(ref.name);
System.out.println(ref.code);

//ref.Displaydetails();
currency.Displaydetails();


System.out.println("****************COUNTRY*********");
Country1 country=new Country1();
country.name="INDIA";
country.code=91;
country.Displaydetails();


System.out.println("****************APPLICATION*********");
Application application=new Application();
application.name="sssssss";
application.version="2.0";
Company company=new Company();
//ref=new Country1();
application.company=new Company();//LINKING ONE REFERENCE TO ANOTHER
application.Displaydetails();


System.out.println("****************COMPANY*********");
//Company company=new Company();

company.name="GOOGLE";
company.ceo="jhh";
company.cfo="r";
System.out.println(company.name);
System.out.println(company.ceo);
System.out.println(company.cfo);

//Country1 country=new Country1();
//company.country=new Country1();//LINKING ONE REFERENCE TO ANOTHER
country.Displaydetails();
System.out.println("*************************");
company.Displaydetails();//INVOKING METHOD
}

}