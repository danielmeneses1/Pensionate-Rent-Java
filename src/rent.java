public class rent {
    public String Nome;
    public String Email;

    public rent(String nome, String email) {
        Nome = nome;
        Email = email;
    }

    public String toString() {
        return Nome + ", " + Email;
    }
}
