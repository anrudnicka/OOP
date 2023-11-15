package pl.rudnicka;

public abstract class Users {
    private final String name;
    private int accessCardNumber;
    private boolean isPresent;

    public Users(String name, int accessCardNumber, boolean isPresent) {
        this.name = name;
        this.accessCardNumber = accessCardNumber;
        this.isPresent = isPresent;
    }
    public void description() {
        System.out.println(name + " posiada kartę dostępu nr " + accessCardNumber);
    }
    public void welcome(){
        System.out.println("Witam! Nazywam się " + name);
    }
    public String getName() {
        return name;
    }

    public int getAccessCardNumber() {
        return accessCardNumber;
    }

    public boolean isPresent() {
        return isPresent;
    }

    public void setPresent(boolean present) {
        isPresent = present;
    }



}


