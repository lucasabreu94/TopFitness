
package modelo.bean;


public class Treino_aluno {
    
    private int id;
    private int fk_id_aluno;
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

    public int getFk_id_aluno() {
        return fk_id_aluno;
    }

    public void setFk_id_aluno(int fk_id_aluno) {
        this.fk_id_aluno = fk_id_aluno;
    }

    public int getFk_id_exercicio() {
        return fk_id_exercicio;
    }

    public void setFk_id_exercicio(int fk_id_exercicio) {
        this.fk_id_exercicio = fk_id_exercicio;
    }

    public String getExercicio() {
        return exercicio;
    }

    public void setExercicio(String exercicio) {
        this.exercicio = exercicio;
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

    public void setInt(int i, int fk_id_aluno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setFk_id_exercicio(int i, int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setExercicio(int i, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setSerie(int i, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setRepeticao(int i, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setDivisao(int i, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
