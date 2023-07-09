/* try-catch inside catch block */
class nestedcatch
{
    public static void main(String[] args) {

        try
        {
            System.out.println(10/0);
        }
        catch(Exception e)
        {
            System.out.println(e);
            try
            {
                String a="ABHI";
                System.out.println(a.toLowerCase());
            }
            catch(NullPointerException n)
            {
                System.out.println("null value can't converted");
            }
        }
        System.out.println("main method ended");  
    }
}
