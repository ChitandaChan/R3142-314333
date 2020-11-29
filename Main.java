public class Main {
    public static void main(String[] args) {
        BomzhKorotiska Neznayka= new BomzhKorotiska("Незнайка", 2, Mestoimenie.ИМЯ);
        BomzhKorotiska Kozlik= new BomzhKorotiska("Козлик", 2, Mestoimenie.ИМЯ);
        Balagan balagan= new Balagan ("Закрыт", "Веселый балаган");
        WorkKorotishka Korotishka= new WorkKorotishka("Коротышка", 1);
        BallFlyMan NN= new BallFlyMan("Кто-то");
        Ball ball= new Ball();
        FactoryHouse zavod =new FactoryHouse();
        Neznayka.setSos(Mestoimenie.ОНИ);
        Neznayka.Go();
        Neznayka.search();
        //Kozlik.setSos(Mestoimenie.ОН);
        Kozlik.Say();
        balagan.OPEN();
        Neznayka.Go();
        Neznayka.stay();
        Neznayka.see();
        zavod.Generations();
        Korotishka.stay();
        Korotishka.Zenki();
        Korotishka.see();
        while (Korotishka.getEye() >0) {
            NN.shootong();
            Double a= Math.random();
            if (a> 0.5) {
                ball.Fly();
                Korotishka.dodge();
            } else {
                ball.Punch();
                Korotishka.nododge();
                Korotishka.setEye(Korotishka.getEye()-1);
                Korotishka.Zenki();
                Korotishka.cry();
            }
        }
        Korotishka.see();
        Korotishka.Run();
        Kozlik.smile();
        //System.out.println(Neznayka.hashCode());
        //Neznayka.toString();
        //Neznayka.equals(Kozlik);
    }
}
