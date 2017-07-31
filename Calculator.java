class Calculator
{

double dodaj(double a, double b)
{
return a+b;
}


static public void main(String [] args)
{
Scanner scan = new Scanner(System.in);
double a,b;
System.out.println("Dodawanie\nPodaj pierwsza liczbę:  );
a=scan.nextDouble();
System.out.println("Podaj drugą liczbę:  );
b=scan.nextDouble();


System.out.println(dodaj(a,b));
}

}
