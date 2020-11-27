package L2.Challenge2;

public class Actor {


    private String nume;
    private Integer varsta;
    private Premiu[] premii;

    public Actor(String nume, Integer varsta, Premiu[] premii) {
        this.nume=nume;
        this.premii=premii;
        this.varsta=varsta;
    }


    public Integer getVarsta() {
        return varsta;
    }

    public String getNume() {
        return nume;
    }
}
