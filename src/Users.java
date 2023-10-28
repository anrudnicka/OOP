public class Users {
     String name;
     int accessCardNumber;
     boolean isPresent;
    public Users(String name, int accessCardNumber, boolean isPresent) {
        this.name = name;
        this.accessCardNumber = accessCardNumber;
        this.isPresent = isPresent;}
    public void description () {
        System.out.println(name + " posiada kartę dostępu nr " + accessCardNumber);
        }

    }


