public class Main {
    public static void main(String[] args) {
        BomzhKorotiska Neznayka= new BomzhKorotiska("Незнайка", 2, Mestoimenie.ИМЯ);
        BomzhKorotiska Kozlik= new BomzhKorotiska("Козлик", 2, Mestoimenie.ИМЯ);
        Balagan balagan= new Balagan ("Закрыт", "Веселый балаганчик");
        WorkKorotishka Korotishka= new WorkKorotishka("Коротышка", 1, Time.вчерашний);
        BallFlyMan NN= new BallFlyMan("Кто-то");
        Ball ball= new Ball("мяч");
        FactoryHouse zavod =new FactoryHouse();
        Neznayka.setSos(Mestoimenie.ОНИ);
        Neznayka.search();
        Neznayka.seek();
        //Kozlik.setSos(Mestoimenie.ОН);
        Kozlik.Say();
        balagan.OPEN();
        Neznayka.stay();
        Neznayka.see();
        zavod.Generations();
        Neznayka.see();
    Korotishka.Sostoyanie();
    Korotishka.health();
    Korotishka.stay();
    Korotishka.DODGE();
        Korotishka.Zenki();
        Korotishka.attention();
        while (Korotishka.getEye() >0) {
            Double a= Math.random();
            if (a> 0.5) {
                NN.shootong();
                ball.Fly();
                WorkKorotishka.dodge(Korotishka);
            } else {
                Kozlik.calculation();
                NN.shootong();
                NN.PowerShooting();
                Korotishka.nododge();
                ball.Punch();
                Korotishka.setEye(Korotishka.getEye()-1);
                Korotishka.Zenki();
                Korotishka.Hand();
                Korotishka.cry();
            }
        }
        Korotishka.see();
        Korotishka.Run();
        Kozlik.sad();
        Kozlik.smile();
        //System.out.println(Neznayka.hashCode());
        //Neznayka.toString();
        //Neznayka.equals(Kozlik);
    }
}
