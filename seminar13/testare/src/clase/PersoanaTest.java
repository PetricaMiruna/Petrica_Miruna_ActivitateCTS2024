package clase;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersoanaTest {

    @org.junit.Test
    public void getSexReturnFem() {
        Persoana pers1= new Persoana("Simona", "602567785678");
        assertEquals(pers1.getSex(), "F");

    }

    @org.junit.Test
    public void getSexReturnM(){
        Persoana pers2= new Persoana("Ionut", "5088765543498");
        assertEquals(pers2.getSex(), "M");
    }

    @org.junit.Test
    public void getSexReturnLimitaInferioara(){
        Persoana pers1= new Persoana("Simona", "602567785678");
        assertEquals(pers1.getSex(),"F");

    }

    @org.junit.Test
    public void getSexParitate(){
        String cnp="187328734734983";
        Persoana persoana= new Persoana("Andrei", cnp);
        String sex;
        if(Integer.valueOf(cnp.charAt(0))%2==0) {
            sex=String.valueOf('F');
        }
        else{
                sex=String.valueOf('M');
        }
        assertEquals(persoana.getSex(), sex);
    }

    @org.junit.Test(expected =IllegalArgumentException.class)
    public void getSexErrorCNPStartWithNumberOutsideCases(){
        Persoana persoana= new Persoana("Andrei", "903838288822983");
        persoana.getSex();
    }

    @org.junit.Test(expected =IllegalArgumentException.class)
    public void getSexErrorStartWithInvalidCharacter(){
        Persoana persoana= new Persoana("Andrei", "-903838288822983");
        persoana.getSex();
    }

    @org.junit.Test(expected = NullPointerException.class)
    public void getSexErrorEmptyString(){
        Persoana persoana= new Persoana("Andrei", "");
        persoana.getSex();
    }

    @org.junit.Test(timeout =200 )
    public void getSexPerformance(){
        Persoana persoana= new Persoana("Andrei", "5028283720147");
        persoana.getSex();
    }

    @org.junit.Test()
    public void getSexCorrect(){
        Persoana persoana= new Persoana("Andrei", "1028283720147");
        assertEquals(1,persoana.getSex().length());
    }

    @org.junit.Test()
    public void getSexCorrectByLetter(){
        Persoana persoana= new Persoana("Andrei", "1028283720147");
        boolean isCorrect= persoana.getSex().toLowerCase().equals("m")|| persoana.getSex().toLowerCase().equals("f");
        assertTrue(isCorrect);
    }

    @org.junit.Test()
    public void getSexOrder(){
        Persoana persoana1= new Persoana("Andrei", "5028283720147");
        Persoana persoana2= new Persoana("Simona", "602567785678");
        assertTrue(persoana1.getSex().compareTo(persoana2.getSex())>0);

    }

    @org.junit.Test()
    public void getSexRange(){
        Persoana persoana1= new Persoana("Simona", "6028283720147");
        assertEquals(true, persoana1.getSex().equals('F'));

    }

    @org.junit.Test( expected = NullPointerException.class)
    public void getSexExistance(){
        Persoana persoana1= new Persoana("Andrei", null);
        persoana1.getSex();

    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void getSexCardinality(){
        Persoana persoana1= new Persoana("Andrei", "087765478898876");
        persoana1.getSex();

    }






}