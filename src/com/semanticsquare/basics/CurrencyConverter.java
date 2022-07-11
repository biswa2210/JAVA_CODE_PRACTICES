class CurrencyConvert{
double inc=100;
double usd=1.33;
double chilean_peso=1088.69;
double mexican_peso=30.54;
double ausd=1.93;
double pound=1.08;
double dirham=4.87;
double euro=1.18;
void printcurrency(){
System.out.println("Indian Currency : "+inc);
System.out.println("US Dollar : "+usd);
System.out.println("Chilean Peso : "+chilean_peso);
System.out.println("Mexican Peso : "+mexican_peso);
System.out.println("Australian Dollar : "+ausd);
System.out.println("Pound : "+pound);
System.out.println("Dirham : "+dirham);
System.out.println("Euro : "+euro);
}
}
public class CurrencyConverter{
	public static void main(String args[]){
CurrencyConvert cc = new CurrencyConvert();
cc.printcurrency();
	}
}