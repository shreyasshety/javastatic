class Company{
String name;
Country1 country;
String ceo;
String cfo;

Company(String name,String ceo,String cfo){
this.name=name;

this.ceo=ceo;
this.cfo=cfo;
}
Company(){


}
void Displaydetails()
{
System.out.println(this.name);
System.out.println(this.ceo);
System.out.println(this.cfo);

}


}
