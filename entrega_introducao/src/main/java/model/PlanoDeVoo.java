package model;

public class PlanoDeVoo {
    public Integer id;
    public String aeronave;
    public Integer saidaEstimada;
    public Integer chegadaEstimada;

    public PlanoDeVoo(Integer id, String aeronave, Integer saidaEstimada, Integer chegadaEstimada) {
        this.id = id;
        this.aeronave = aeronave;
        this.saidaEstimada = saidaEstimada;
        this.chegadaEstimada = chegadaEstimada;
    }
}
