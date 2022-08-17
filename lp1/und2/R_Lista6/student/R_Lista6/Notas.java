public class Notas {
    float nota1, nota2, nota3, media;

    // constructor
    public Notas(float n1, float n2, float n3){
        this.nota1 = n1;
        this.nota2 = n2;
        this.nota3 = n3;
    }

    public void calculaMedia(){
        media = (nota1 + nota2 + nota3) / 3;
    }

    public float getNota1(){
        return nota1;
    }
    public float getNota2(){
        return nota2;
    }
    public float getNota3(){
        return nota3;
    }
    public float getMedia(){
        return media;
    }
    public void setNota1(float n1){
        this.nota1 = n1;
    }
    public void setNota2(float n2){
        this.nota2 = n2;
    }
    public void setNota3(float n3){
        this.nota3 = n3;
    }
    public void setMedia(float med){
        this.media = med;
    }
}
