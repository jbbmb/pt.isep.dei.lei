/**
 * Class dedicated to test the TaxPayer project.
 * @author João Borges, 1150475
 */
package taxpayer;

public class TaxPayerTest {

    public static void main(String[] args) {
        
        // Testing Unemployed class
        Unemployed unemployed1 = new Unemployed("Unemployed 1", "Fake Street, 123", 480, 2);
        System.out.println(unemployed1.toString());
        System.out.println("Tax = " + unemployed1.calculateTax());
        System.out.println("EXPECTED VALUE = 9.6");
        
        // Testing Retired class
        Retired retired1 = new Retired("Retired 1", "Fake Street, 123", 500, 2000);
        System.out.println(retired1.toString());
        System.out.println("Tax = " + retired1.calculateTax());
        System.out.println("EXPECTED VALUE = 35.0");

        // Testing CompanyEmployee class
        CompanyEmployee companyEmployee1 = new CompanyEmployee("Company employee 1", "Fake Street, 123", 900, 2500, "X Inc.");
        System.out.println(companyEmployee1.toString());
        System.out.println("Tax = " + companyEmployee1.calculateTax());
        System.out.println("EXPECTED VALUE = 43.0");
        CompanyEmployee companyEmployee2 = new CompanyEmployee("Company employee 2", "Fake Street, 123", 900, 40000, "Y Inc.");
        System.out.println(companyEmployee2.toString());
        System.out.println("Tax = " + companyEmployee2.calculateTax());
        System.out.println("EXPECTED VALUE = 818.0");

        // Testing SelfEmployedWorker class
        SelfEmployedWorker selfEmployedWorker1 = new SelfEmployedWorker("Self employed 1", "Fake Street, 123", 500, 3000, "Developer");
        System.out.println(selfEmployedWorker1.toString());
        System.out.println("Tax = " + selfEmployedWorker1.calculateTax());
        System.out.println("EXPECTED VALUE = 100.0");
        SelfEmployedWorker selfEmployedWorker2 = new SelfEmployedWorker("Self employed 2", "Fake Street, 123", 89000, 3000, "Developer");
        System.out.println(selfEmployedWorker2.toString());
        System.out.println("Tax = " + selfEmployedWorker2.calculateTax());
        System.out.println("EXPECTED VALUE = 4540.0");
        
    }
    
}