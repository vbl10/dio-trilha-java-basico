public class Aparelho {
    private ReprodutorMusical reprodutor = new ReprodutorMusical();
    private Telefone telefone = new Telefone();
    private NavegadorInternet navegador = new NavegadorInternet();
    
    public ReprodutorMusical getReprodutorMusical() { return reprodutor; }
    public Telefone getTelefone() { return telefone; }
    public NavegadorInternet getNavegadorInternet() { return navegador; }
}
