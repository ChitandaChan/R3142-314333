import sun.font.TrueTypeFont;

public class Main {
    public static void main(String[] args) {
        BomzhKorotiska Neznayka= new BomzhKorotiska("Незнайка", 2, Mestoimenie.ИМЯ);
        BomzhKorotiska Kozlik= new BomzhKorotiska("Козлик", 2, Mestoimenie.ИМЯ);
        Balagan balagan= new Balagan ("Закрыт", "Веселый балаган");
        WorkKorotishka Korotishka= new WorkKorotishka("Коротышка", 1, Time.Вчерашний, true, true);
        BallFlyMan NN= new BallFlyMan("Кто-то");
        Ball ball= new Ball();
        Hause hause = new Hause("знакомое увесилительное здание ", Pozition.Рядом);
        Problem problem = new Problem(false);
        Mesto mesto = new Mesto("улица");
        Money money = new Money("там", "деньги");
        Search search= new Search("их поиски", "не увенчались упехом");
        Day day = new Day("в этот День");
        Arbeit work = new Arbeit("работа");
        Neznayka.setSos(Mestoimenie.ОНИ);
        Neznayka.search("снова");
        work.vName();
        day.intName();
        search.search();
        //Kozlik.setSos(Mestoimenie.ОН);
        Kozlik.Say();
        balagan.OPEN();
        money.Up();
        Neznayka.stay();
        mesto.input();
        hause.location();
        Korotishka.stay();
        mesto.Pozition="Помостье";
        mesto.input();
        System.out.println("");
        Neznayka.see();
        Korotishka.dodge();
        ball.Fly("лицо");
        Korotishka.zenki();
        Korotishka.attention(false);
        problem.fullState("подобные ");
        while (Korotishka.getEye() >0) {
            Double a= Math.random();
            if (a> 0.5) {
                NN.shootong(false, "");
                ball.Fly("коротышка");
                Korotishka.dodge();
                ball.input();
            } else {
                Kozlik.payment(true);
                NN.shootong(true, "действительно скоро");
                Korotishka.nododge();
                Korotishka.setEye(Korotishka.getEye()-1);
                Korotishka.zenki();
                Korotishka.grabHand("подбитый глаз");
                Korotishka.cry("боль");
            }
        }
        Korotishka.name="Бедняга";
        Korotishka.see();
        Korotishka.run("дом", "поскорей");
        Korotishka.name="Несчастный коротышка";
        Kozlik.sad();
        Korotishka.input();
        Kozlik.smile();
        money.earn();
    }
}
