package day29abstractioncollections;

public interface Engine extends Vehicle{
    /***
     * Class>>>> Interface >>>>Implement kullaniriz
     * Class===Class>>.Extends kullaniriz...
     * Interface>>> interface ==extends
     * interface ===class===Mumkun degil!!!!

     */

    // interfacelerdeki tum variableler otomatik olarak(defaultdeniyor programlama dilinde)public tir...
// interfacelerdeki tum variableler otomatik olarak(defaultdeniyor programlama dilinde)final tir...
   // interfacelerdeki tum variableler otomatik olarak(defaultdeniyor programlama dilinde) static tir...
// interfaceler de obje olusturamayiz. neden? Cunku; interface lerde constructur yoktr.
    // abstrac clas'larda class olduklari icin constructur vardir.
    //Ama; constructurlar abstract classlarda obje olusturamazlar.
    int price = 2000;// interfacelerin icine variable koyabiliyoruz.
    double weight = 23.5;

    void run();

}
