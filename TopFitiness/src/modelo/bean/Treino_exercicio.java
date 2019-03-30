
package modelo.bean;

public class Treino_exercicio {
    
    private int id;
    private int fk_id_treinos;
    private int fk_id_exercicio;
    private String exercicio;
    private String serie;
    private String repeticao;
    private String divisao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    public String getExercicio() {
        return exercicio;
    }

    public void setExercicio(String exercicio) {
        this.exercicio = exercicio;
    }


    public int getFk_id_treinos() {
        return fk_id_treinos;
    }

    public void setFk_id_treinos(int fk_id_treinos) {
        this.fk_id_treinos = fk_id_treinos;
    }

    public int getFk_id_exercicio() {
        return fk_id_exercicio;
    }

    public void setFk_id_exercicio(int fk_id_exercicio) {
        this.fk_id_exercicio = fk_id_exercicio;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getRepeticao() {
        return repeticao;
    }

    public void setRepeticao(String repeticao) {
        this.repeticao = repeticao;
    }

    public String getDivisao() {
        return divisao;
    }

    public void setDivisao(String divisao) {
        this.divisao = divisao;
    }
    
    
}
