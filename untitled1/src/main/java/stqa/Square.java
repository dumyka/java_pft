package stqa;

public class Square {
  public double l;

  public Square(double l){
    this.l = l;
  }
  public double area(){  //ссылка на тот объект с которой метод ассоциирован
    return this.l * this.l;
  }
}
