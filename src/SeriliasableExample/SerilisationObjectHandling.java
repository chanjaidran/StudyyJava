package SeriliasableExample;

import java.io.*;

public class SerilisationObjectHandling {

    public static void main(String[] args) {

        Employe employe=new Employe(2,"jai");

        try (ObjectOutputStream outputStream=new ObjectOutputStream(new FileOutputStream("jai.ser"))){

            outputStream.writeObject(employe);
            System.out.println("object serilisable");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try (ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("jai.ser"))){

            Employe employe1= (Employe) objectInputStream.readObject();
            System.out.println(employe1.getId()+" "+employe1.getName());


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
