package InterviewQuestions;

public class Name {

    public static void main(String[] args) {

        //NameStatic.name();
        NameStatic nameStatic=null;
        nameStatic.name();

    }



}
//✅ Answer:
//Yes, this will work!
//Even though obj is null, obj.show() will still execute successfully, because:
//
//        🔹 Static methods are resolved at compile time using the class, not the object.
//
//So obj.show() is the same as Test.show() in the eyes of the compiler.
class NameStatic
{
    public void name()
    {
        System.out.println("hello");
    }
}