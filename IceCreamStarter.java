class IceCreamStarter{

public static void main(String [] values)
{
	
	IceCream cream;
	cream = new IceCream(-20,"tender",Color.YELLOW);
	System.out.println(cream.temp);
	System.out.println(cream.flavour);
		System.out.println(cream.color);
			System.out.println(cream.brand);
				System.out.println(cream.type);
				cream.type="cone";
				cream.brand=new Brand();
					System.out.println(cream.brand);
						System.out.println(cream);
						
						//get flavour from ice cream and store it using var
						String fla=cream.flavour;
						System.out.println(fla);
						
						float temp=cream.temp;
						Brand brand=cream.brand;
						String name=brand.name;
						String location=brand.name;
						String oname=brand.ownerName;
						int since=brand.since;
						System.out.println(name);
						System.out.println(location);

						System.out.println(oname);

						System.out.println(since);
						brand.name = "natirals";
						brand.ownerName="sam";
						brand.since = 1234;
						System.out.println(name);
						System.out.println(location);
						System.out.println(oname);
						System.out.println(since);
						cream.brand.name=null;
						System.out.println(brand.name);
						cream.brand=null;
						System.out.println(brand.location);




						
							







	


}}