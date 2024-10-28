public class Ball{
    private int raio;
    private float x;
    private float y;
    private float xDelta;
    private float yDelta;

    public Ball(int raio, float x, float y, float xDelta, float yDelta){
        this.raio = raio;
        this.x = x;
        this.y = y;
        this.xDelta = xDelta;
        this.yDelta = yDelta;
    }

    public float getX(){
        return x;
    }
    public void setX(float x){
        this.x = x;
    }

    public float getY(){
        return y;
    }
    public void setY(float y){
        this.y = y;
    }

    public int getRaio(){
        return raio;
    }
    public void setRaio(int raio){
        this.raio = raio;
    }

    public float getXDelta(){
        return xDelta;
    }
    public void setXDelta(float xDelta){
        this.xDelta = xDelta;
    }

    public float getYDelta(){
        return yDelta;
    }
    public void setYDelta(float yDelta){
        this.yDelta = yDelta;
    }

    public void move(){
        x += xDelta;
        y += yDelta;
    }

    public void reflectHorizontal(){
        xDelta = - xDelta;
    }

    public void reflectVertical(){
        yDelta = - yDelta;
    }

    public String toString(){
        return "Bola[(" + x + ", " + y + "), velocidade = (" + xDelta + ", " + yDelta + ")]";
    }

}