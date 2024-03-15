class WideningConversionToAll{

public static void main(String args[]){

int intValue = 10;

//int to double

double doubleValue = intValue;
System.out.println("double value = " + doubleValue);


//int to float

float floatValue = intValue;
System.out.println("float value = " + floatValue);

//int to boolean

boolean booleanValue = intValue != 0;

System.out.println("boolean value = " + booleanValue);

//int to string

String stringValue = String.valueOf(intValue);

System.out.println("String value = " + stringValue);






}




}