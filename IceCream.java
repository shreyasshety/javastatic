class IceCream{
String flavour = "vanilla";//literals
Color color = Color.BLACK;//literals
float temp;// constructor
String type;// ref
Brand brand;// ref

IceCream(float temp)
{
	this.temp=temp;
}
IceCream(float temp,String flavour, Color color)
{
	this(temp);
	this.flavour=flavour;
	this.color=color;
}
}
//git push https://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@github.com/shreyasshety/core-java.git program_files