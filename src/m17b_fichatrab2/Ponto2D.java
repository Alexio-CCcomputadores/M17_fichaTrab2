package m17b_fichatrab2;

public class Ponto2D {
    private int x;
    private int y;
    
    // Faltam construtor, getters e setters.
    
    public Ponto2D(){
        x = 0;
        y = 0;        
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public Ponto2D(int x, int y){
        this.x = x;
        this.y = y;        
    }
    
    public double distancia(Ponto2D a){
        // Falta fazer este método.
        
        return 0.0;
    }

    @Override
    public String toString() {
        return "Ponto2D{" + "x=" + x + ", y=" + y + '}';
    }
    
}
