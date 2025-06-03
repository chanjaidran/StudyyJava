package SeriliasableExample;

public class AuditlOGGER {


    public static void getLogger(Object object)
    {
        if (object instanceof AuditMarkerInterface)
        {
            System.out.println("AUDIT: Action performed on " + object.getClass().getSimpleName());
        }

        else
        {
            System.out.println("NO AUDIT: " + object.getClass().getSimpleName() + " is not auditable.");
        }
    }
}
