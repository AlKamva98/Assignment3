import static org.junit.Assert.*;

public class AnimalTest {

    Animal an3,an1,an2;

    @org.junit.Before
    public void setUp() throws Exception {
    an1 = new Cow("Roxy", "black", 5, 5);
    an2 = new Wolf("Adam", "grey", 1.2,3);
    an3 = new Sheep("Baabaa", "Black", 2.5,1);
    }


    @org.junit.Test
    public void talk() {
        String cowTalk = "Moooo";
        String wolfTalk = "Woof";
        assertSame(an1.talk(),cowTalk);
        assertSame(an2.talk(),wolfTalk);
    }

    @org.junit.Test
    public void eats() {
        String sheepEats ="grass";
        String wolfEats = "Meat";

        assertSame(an3.eats(), sheepEats);
        assertSame(an2.eats(), wolfEats);


    }

    @org.junit.Test
    public void getName(){
        String cowName = "Roxy";
        String sheepName ="Baabaa";

        assertSame(an3.getName(),sheepName);
        assertSame(an1.getName(),cowName);
    }

    @org.junit.Test
    public void testToString() {


    }
}