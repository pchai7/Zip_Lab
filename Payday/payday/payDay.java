
/**
 * Write a description of class payDay here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class payDay
{
    // instance variables - replace the example below with your own
    private String name;
    private double grossPay;
    private double deduction;
    private double netPay;
    private double hoursWorked=21.5;
    private double payRate=10;
    private double deductionRate=0.05;
    private String str= "";

    /**
     * 
     */
    public String sampleMethod(String name,double hoursWorked,double deductionRate,double PayRate)
    {
        grossPay = payRate * hoursWorked;
        deduction = grossPay * deductionRate;
        netPay = grossPay - deduction;
        // put your code here
        str = String.format("%s %.2f %.2f %.2f",name, grossPay, deduction, netPay);
        return str;
    }
}
